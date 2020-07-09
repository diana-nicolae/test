
/**
 * @author El-Heni Ela
 * 
 *@ref code permanent : ELHE24579402
 * 

 */
public class AssuranceAuto
{
	//un commentaire pertinent

    final static String QUES_SEXE = "Quel est votre sexe? (h/f)";
    final static String QUES_AGE = "Quel est votre age?";
    final static String QUES_ACHAT = "Quelle est la valeur d'achat de votre v�hicule?";
    final static String QUES_FABRICATION = "Quelle est l'ann�e de fabrication de votre v�hicule?";
    final static String QUES_RECLAMATION = "Avez-vous fait des reclamations d'assurance auto dans les 6 derni�res ann�es? (oui/non)?";
    final static String QUES_NBR_RECLAMATION ="Combien de r�clamations avez-vous faites? ";
    final static String REFUS = "D�sol�, nous n'avons aucun produit � vous offrir";
    final static String NOUVELLE_SOUMISSION = "Voulez-vous faire une nouvelle soumission?";
    final static String AFFICH_MONT_ASSURANCE = "Montant de l'assurance annuelle :";
    final static String AFFICH_MENTUALITE ="Avec une mentualit� de : ";
    final static String ERREUR = "ERREUR! Veuillez entrer un nombre.";
    final static String ERREUR2 = "ERREUR! Veuillez entrer un charact�re.";
    final static String ERREUR3 = "ERREUR! r�essayez. (oui/non)";
    final static String DOLLAR = " $.";

    final static int ANNEE_ACTUELLE = 2018;
    final static long MAX_PRIX = 100000;
    final static long MAX_SOMME_RECLAMATION = 35000;
    final static int MAX_RECLAMATIONS = 4;
    final static int MAX_AGE = 100;
    final static int MIN_AGE_F = 16;
    final static int MIN_AGE_H = 18;
    final static int MAX_ANNEE = 25;
    final static int PENALITE= 500;
    final static long CONDITION_PENALITE= 25000;

    /**
     * Verifie si une chaine de caract�res est form�e d'entiers seulement ou pas
     * @param chaine La chaine � verifier
     * verifie si tous les caract�res un par un sont des entiers
     * @param numerique prend la valeur vrai (true) si tous les caract�res sont des entiers et faux sinon
     * retourne numerique
     * 
     */

    public static boolean estUnEntier(String chaine){ 
        boolean numerique = true; 
        char[] tab = chaine.toCharArray(); 

        for(char carac : tab){ 
            if(!Character.isDigit(carac) && numerique){ numerique = false; } 
        } 

        return numerique; 
    } 

    /**
     * Verifie si une chaine de caract�res peut etre convertie en reel ou pas
     * @param chaine La chaine � verifier
     * retourne vrai (true) si la chaine peut etre convertie en reel sinon faux (false)
     */

    public static boolean estUnReel (String chaine){
        try{
            Double.parseDouble(chaine);}
        catch (NumberFormatException e){
            return false;}
        return true; 
        // en utilisant une boucle qui verifie si il y a des chiffres et une virgule caractere par caractere le programme compile mais ne fonctionne pas.
    }

    /**
     * Demande � l'utilisateur d'entrer son sex et v�rifie si c'est un sex valide sinon affiche un message d'erreur et repose la question
     * @param a Prend soit 1 soit 2 dependament du sex entr� par l'utilisateur
     * @param sex Prend pour valeur le caractere entr� au clavier
     * @retourne la valeur de a
     */
    public static int connaitreSexe ( ){
        int a =0;
        char sexe;

        do{
            System.out.println(QUES_SEXE);
            sexe = Clavier.lireCharLn();
            if (sexe == 'h' || sexe == 'H'){
                a = 1;

            } else if (sexe == 'f' || sexe == 'F'){
                a = 2;

            }else {
                System.out.println(ERREUR2);
            }
        }while(a!=1&& a!=2); 
        return a;
    }

    /**
     * Demande � l'utilisateur d'entrer son age et verifie si c'est un age valide sinon affiche un message d'erreur et repose la question
     * @param a prend pour valeur la chaine de caract�res entr�e au clavier
     * @param c Effectue une verification sur a en utilisant la fonction estUnEntier
     * @param b Prend la valeur numerique de la chaine a
     * @retourne b
     */
    public static int connaitreAge (){

        String a = null;
        int b = 0;
        boolean c = false;

        do{
            System.out.println (QUES_AGE);
            a = Clavier.lireString();
            c =estUnEntier(a);

            if (c== true){
                b=Integer.parseInt(a);

            }else{
                System.out.println(ERREUR);
                //commentaire

            }

        }while (c==false); 

        return b;

    }

    /**
     * Demande � l'utilisateur d'entrer la valeur d'achat de sa voiture et verifie si c'est une valeur valide sinon affiche un message d'erreur et repose la question
     * @param a prend pour valeur la chaine de caract�res entr�e au clavier
     * @param c Effectue une verification sur a en utilisant la fonction estUnReel
     * @param b Prend la valeur numerique de la chaine a
     * @retourne b
     */
    public static double connaitreValeurAchat(){

        String a =null;
        double b=0;
        boolean c = false;
        do{
            System.out.println(QUES_ACHAT);
            a = Clavier.lireString();
            c= estUnReel(a);
            if(c==true){
                b=Double.parseDouble(a);
            }else{
                System.out.println(ERREUR);

            }

        }while (c==false);

        return b;

    }

    /**
     * Demande � l'utilisateur d'entrer l'ann�e de fabrication de son v�hicule et verifie si c'est une valeur valide sinon affiche un message d'erreur et repose la question
     * @param a prend pour valeur la chaine de caract�res entr�e au clavier
     * @param c Effectue une verification sur a en utilisant la fonction estUnEntier
     * @param b Prend la valeur numerique de la chaine a
     * @retourne b
     */
    public static int connaitreAnneeFabrication(){
        String a =null;
        int b=0;
        boolean c = false;
        do{
            System.out.println(QUES_FABRICATION);
            a = Clavier.lireString();
            c= estUnEntier(a);
            if(c==true){
                b=Integer.parseInt(a);
            }else{
                System.out.println(ERREUR);

            }

        }while (c==false);
        return b;

    }

    /**
     * Demande � l'utilisateur si il a fait des r�clamation (oui\non) et v�rifie si c'est une r�ponse valide sinon retourne un message d'erreur et repose la meme question � nouveau
     * @param a prend la valeur de l'entre� du clavier
     * effectue les verifications en ignorant la casse si c'est valide sort de la boucle sinon affiche un message d'erreur
     * retourne la chaine a
     *
     */
    public static String infoReclamation (){
        String a = null;

        do {

            System.out.println(QUES_RECLAMATION );

            a = Clavier.lireString();

            if (!a.equalsIgnoreCase("oui")&&!a.equalsIgnoreCase("non")){

                System.out.println(ERREUR3);}

        } while (!a.equalsIgnoreCase("oui")&&!a.equalsIgnoreCase("non")); 
        return a;
    }

    /**
     * Demande � l'utilisateur d'entrer le nombre de r�clamations et verifie si c'est un nombre valide sinon affiche un message d'erreur et repose la question
     * @param a prend pour valeur la chaine de charact�res entr�e au clavier
     * @param c Effectue une verification sur a en utilisant la fonction estUnEntier
     * @param b Prend la valeur numerique de la chaine a
     * @retourne b
     */
    public static int connaitreNbrReclamations (){
        String a =null;
        int b=0;
        boolean c = false;
        do{
            System.out.println (QUES_NBR_RECLAMATION);
            a = Clavier.lireString();
            c= estUnEntier(a);
            if(c==true){
                b=Integer.parseInt(a);
            }else{
                System.out.println(ERREUR);

            }

        }while (c==false);
        return b;

    }

    /**
     * Demande � l'utilisateur si il veut faire une nouvelle soumission (oui\non) et v�rifie si c'est une r�ponse valide sinon retourne un message d'erreur et repose la meme question � nouveau
     * @param a prend la valeur de l'entre� du clavier
     * effectue les verifications en ignorant la casse si c'est valide sort de la boucle sinon affiche un message d'erreur
     * retourne la chaine a
     *
     */
    public static String nouvelleSoumission (){
        String a = null;
        do{
            System.out.println(NOUVELLE_SOUMISSION);
            a = Clavier.lireString ();
            if (!a.equalsIgnoreCase("oui")&&!a.equalsIgnoreCase("non")){
                System.out.println(ERREUR3);
            }

        }while(!a.equalsIgnoreCase("oui")&&!a.equalsIgnoreCase("non"));

        return a;

    }

    /**
     *Affiche un message d'erreur si l'utilisateur ne satisfait pas aux conditions d'utilisation et lui demande si il veut faire une nouvelle soumission d'assurance
     *@param a initialis�e a une chaine de caract�res nulles puis prend comme valeur la d�cision de l'utilisateur en utilisant la m�thode nouvelleSoumission
     *retourne a, donc la d�cision de l'utilisateur
     */
    public static String refus (){
        String a = null;
        System.out.println (REFUS);
        return a = nouvelleSoumission();
    }

    /**
     *Effectue le calcul de l'assurance annuelle en prenant pour param�tres un entier et un reel et une chaine de caract�res
     *@param a un reel qui prendra la valeur du montant de base dans le programme principal
     *@param b un entier qui prendra la valeur du nombre de r�clamations dans le programme principal
     *@param c une chaine de caract�re qui prendra pour valeur si l'utilisateur a fait des r�clamations, si non le programme va alors supposer que le nombre de r�clamations =
     *@param x contiendra la valeur calcul�e de l'assurance annuelle de l'utilisateur
     *retourne la valeur de x
     */
    public static double assuranceAnnuelle (double a, int b, String c){
        double x = 0;
        if (c.equals("oui")){
            x= a + (350*b);
        }else if (c.equals("non")){
            x=a;
        }

        return x;

    }

    /**
     * Effectue le calcul du montant de base en respectant les conditions, prend pour parametre deux entier et un reel
     * @param a un entier qui prendra la valeur du sex de l'utilisateur dans le programme pricipal
     * @param b un entier qui prendra pour valeur l'age de l'utilisateur dans le programme principale
     * @param c un reel qui prendra la valeur d'achat du v�hicule de l'utilisateur dans le programme principal
     * @param x contiendra la valeur du montant de base calcul�e d�pendament des conditions pos�e
     * retourne la valeur de x
     */
    public static double calculMontantBase (int a, int b, double c){
        double x = 0;
        if((a==1) && (b<25)){
            x = c * 0.05 ;
            return x;
        }else if (b>=75){
            x= c * 0.04 ;
            return x;
        }else{
            x= c * 0.02 ;
            return x;
        }

    }

    /**
     * Effectue le calcul des mentualit� du montant de l'assurance annuelle en prenant pour param�tre un reel
     * @param a un reel qui prendra la valeur du montant de base dans le programme principal
     * @param x contiendra la valeur de la mentualit� calcul�e
     * retourne la valeur de x
     */
    public static double calculMentualite (double a){
        double x = 0;

        x = a/12;
        return x;
    }

    /**
     * Si la valeur r�el entr�e en param�tre n'a que des 0 apr�s la virgule la m�thode retourne la partie enti�re seulement sinon remplace le '.' par un virgule
     * @param chaine prend la valeur r�elle entr�e en param�tre et la retourne avec deux chiffres ap�s la virgule
     * @param partieEntiere prend la partie enti�re de la valeur entr�e en param�tre
     * @param nouvelleValeur d�pendement de la condition va prendre la nouvelle forme de valeur
     * retourne nouvelleValeur
     */
    public static String affichageValeur (double valeur){
        String chaine = null;
        
        int partieEntiere;
        String nouvelleValeur = null;

        chaine = String.format("%.2f",valeur);
        

        if(((valeur*100) %100) == 0){ //si le reste de la division d'un r�el*100 par 100 est �gale a 0 alors les chiffres apr�s la virgule sont des z�ros
            partieEntiere=(int)valeur;
            nouvelleValeur=Integer.toString(partieEntiere);

        }else {
            nouvelleValeur = chaine.replace('.',',');
        }

        return nouvelleValeur;

    }

    /**
     * A chaque fois que l'utilisateur le demande le programme effectue une nouvelle soumission d'assurance en respectant les conditions impos�es
     * @param sexEntre la valeur retournee par la fonction connaitreSex
     * @param ageEntre la valeur retournee par la fonction connaitreAge
     * @param valeurAchatEntree la valeur retournee par la fonction connaitreValeurAchat
     * @param limiteAnne sert a verifier la condition de l'age du véhicule
     * @param infoReclamationEntree prend la valeur retournee par la fonction infoReclamation
     * @param nbrReclamation prend la valeur retournee par la fonction connaitreNbrReclamations
     * @param montantEntre prend la valeur du montant de chaque reclamation
     * @param somme calcule la somme des montants des reclamations
     * @param montantBaseCalcule prend la valeur retournee par la fonction montantBase
     * @param assuranceAnnuelleCalculee contient la valeur de l'assurance annuelle
     * @param mentualiteCalculee contient la valeur de chaque mentualite que l'utilisateur aura a payer
     * @param reponse contient la decision de l'utilisateur O/N de faire une nouvelle soumission et le programme s'arrete si cette derniere est non
     */
    public static void main(String[] args){
        int sexeEntre;
        int ageEntre = 0;
        double valeurAchatEntree = 0;
        int anneeEntree = 0;
        int limiteAnnee;
        String infoReclamationEntree = null;
        int nbrReclamationsEntre = 0;
        double montantEntre = 0;
        double somme;
        String reponse = null;
        double montantBaseCalcule;
        double assuranceAnnuelleCalculee;
        double mentualiteCalculee;
        String assuranceAnnuelleAffichee = null;
        String mentualiteAffichee = null;

        do{
            reponse = null;
            infoReclamationEntree= null;
            mentualiteCalculee =0;
            assuranceAnnuelleCalculee = 0;
            limiteAnnee = 0;
            somme =0;
            sexeEntre = 0; // servent a renitialiser les valeurs a chaque nouveau tour de boucle

            sexeEntre = connaitreSexe();
            ageEntre = connaitreAge();
            if((sexeEntre == 1 && ageEntre<MIN_AGE_H)||(sexeEntre == 2 && ageEntre<MIN_AGE_F) || (ageEntre>=MAX_AGE)){

                reponse = refus();

            }else{
                valeurAchatEntree =connaitreValeurAchat();
                if(valeurAchatEntree>MAX_PRIX) {
                    reponse = refus();
                }else{
                    anneeEntree = connaitreAnneeFabrication();
                    limiteAnnee = ANNEE_ACTUELLE - anneeEntree;
                    if(limiteAnnee>MAX_ANNEE){
                        reponse = refus();

                    }else{
                        infoReclamationEntree = infoReclamation ();

                        if(infoReclamationEntree.equals("oui")||infoReclamationEntree.equals("non")){

                            if(infoReclamationEntree.equals("oui")){
                                nbrReclamationsEntre = connaitreNbrReclamations();

                                if(nbrReclamationsEntre>MAX_RECLAMATIONS){

                                    reponse = refus();
                                }else{
                                    for(int i=1; i<=nbrReclamationsEntre;i++){
                                        System.out.println("pour la r�clamation #"+i+", quel montant avez-vous r�clam�?");
                                        montantEntre = Clavier.lireDouble();
                                        somme +=montantEntre;
                                        if (somme>MAX_SOMME_RECLAMATION){
                                            reponse = refus();

                                        }
                                        montantEntre=0;

                                    }

                                }
                            }

                            montantBaseCalcule = calculMontantBase (sexeEntre, ageEntre, valeurAchatEntree);
                            assuranceAnnuelleCalculee = assuranceAnnuelle (montantBaseCalcule, nbrReclamationsEntre, infoReclamationEntree);
                            assuranceAnnuelleAffichee = affichageValeur(assuranceAnnuelleCalculee );
                            if (somme>CONDITION_PENALITE){
                                assuranceAnnuelleCalculee += PENALITE;
                            }

                            mentualiteCalculee = calculMentualite (assuranceAnnuelleCalculee);
                            mentualiteAffichee = affichageValeur(mentualiteCalculee );

                            System.out.println(AFFICH_MONT_ASSURANCE+assuranceAnnuelleAffichee+DOLLAR);
                            System.out.println(AFFICH_MENTUALITE+mentualiteAffichee+DOLLAR);

                            reponse = nouvelleSoumission();

                        }

                    }
                }
            }
        } while (!reponse.equalsIgnoreCase("non"));
    }

}

