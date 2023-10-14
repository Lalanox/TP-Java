

import java.util.Scanner;

public class JourSuivant {


    public static void main(String [] args) {
        /* Déclaration des variables */
        int [] date = new int[3] ;
        int [] newDate = new int[3];
        int [] AfterNewDate = new int[3];
        boolean valide;

        /* -- Etape 1 -- */
        /* Saisie d'une date */
        saisieDate(date);


        /* -- Etape 2 -- */
        /* Vérification de la date saisie */
        // A vous
        valide = dateValide(date);


        /* -- Etape 3 -- */
        if (valide) {
            jourSuivant(date,newDate);
            System.out.println("Le jour suivant donnera cette date : "+ newDate[0] + "/" + newDate[1] + "/" + newDate[2]);

            surlendemain(newDate,AfterNewDate);
            System.out.println("Le surlendemain donnera cette date : "+ AfterNewDate[0] + "/" + AfterNewDate[1] + "/" + AfterNewDate[2]);
        } else {
            System.out.println("La date du " + date[0] + "/" + date[1] + "/" + date[2]+ " n'est pas une date valide.");
        }
    }


    /**
     * Fait saisir une date à l'utilisateur
     *
     * @param pfDate OUT : un tableau de trois cases représentant une
     * date. 1ere case : jour, 2nde case : mois, 3eme case : annee
     *
     */
    public static void saisieDate(int[] pfDate) {
        if (pfDate.length != 3) {
            System.out.print("Le tableau représentant la date a une taille inattendue : ");
            System.out.println(pfDate.length + " case(s) au lieu de 3 !");
        }
        Scanner clavier = new Scanner(System.in);
        
        System.out.println("Saisir un jour");
        pfDate[0] = clavier.nextInt() ;
        
        System.out.println("Saisir un mois");
        pfDate[1] = clavier.nextInt() ;

        System.out.println("Saisir une année");
        pfDate[2] = clavier.nextInt() ;
        // A compléter !
    }


    /**
     * Calcul la validité d'une date
     *
     * @param pfDate IN : date initiale
     * @return true si et seulement si pfDate est valide
     *
     */
    public static boolean dateValide(int[] pfDate) {
        if (pfDate.length != 3) {
            System.out.print("Un tableau représentant une date a une taille inattendue : ");
            System.out.println(pfDate + " case(s) au lieu de 3 !");
        }
        
        boolean Bissextile = false;
        boolean valide = false;
        int JoursMois;
        
        if ((pfDate[1] > 0) && (pfDate[1] < 13) && (pfDate[2] >= 1582)) {
            
            if (((pfDate[2] % 4 == 0) && (pfDate[2] % 100 != 0)) || (pfDate[2] % 400 == 0 )) {
                Bissextile = true;
            }
            
            if (pfDate[1] == 2 ) {
                if (Bissextile == true) {
                    JoursMois = 29;
                } else {
                    JoursMois = 28;
                }
            } else {
                if ((pfDate[1] == 1)||(pfDate[1] == 3)||(pfDate[1] == 5)||(pfDate[1] == 7)||(pfDate[1] == 8)||(pfDate[1] == 10)||(pfDate[1] == 12)) {
                    JoursMois = 31;
                } else {
                    JoursMois = 30;
                }
            }
            
            if (pfDate[0] <= JoursMois && pfDate[0] > 0) {
                valide = true;
            }
            
        }

        return valide ;
    }


    /**
     * Calcul du jour suivant
     *
     * @param pfDateJourCourant IN : date initiale
     * @param pfDateJourSuivant OUT : date du jour suivant
     *
     */
    public static void jourSuivant(int[] pfDateJourCourant, int[] pfDateJourSuivant) {
        if (pfDateJourCourant.length != 3 || pfDateJourSuivant.length != 3) {
            System.out.print("Un tableau représentant une date a une taille inattendue : ");
            System.out.println(pfDateJourCourant.length + " ou " + pfDateJourSuivant.length
                + " case(s) au lieu de 3 !");
        }
        
        int jour = pfDateJourCourant[0];
        int mois = pfDateJourCourant[1];
        int annee = pfDateJourCourant[2];
        
        boolean Bissextile = false;
        int maxJourMois;
        
        if (((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0 )) {
            Bissextile = true;
        }
        
        if (mois == 2 ) {
            if (Bissextile == true) {
                maxJourMois = 29;
            } else {
                maxJourMois = 28;
            }
        } else {
            if ((mois == 1) || (mois == 3) ||(mois == 5)||(mois == 7)||(mois == 8)||(mois == 10)||(mois == 12)) {
                maxJourMois = 31;
            } else {
                maxJourMois = 30;
            }
        }
        
        if (jour+1 > maxJourMois) {
            if ( mois+1 > 12) {
                pfDateJourSuivant[0] = 1;
                pfDateJourSuivant[1] = 1;
                pfDateJourSuivant[2] = annee+1;
            } else { 
                pfDateJourSuivant[0] = 1;
                pfDateJourSuivant[1] = mois+1;
                pfDateJourSuivant[2] = annee; 
            }
        } else {
            pfDateJourSuivant[0] = jour+1;
            pfDateJourSuivant[1] = mois;
            pfDateJourSuivant[2] = annee;
        }
    }
    public static void surlendemain(int[] pfDateJourCourant, int[] pfDateSurlendemain) {
        jourSuivant(pfDateJourCourant,pfDateSurlendemain);
    }

}

