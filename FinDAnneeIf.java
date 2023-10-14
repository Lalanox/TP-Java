

import java.util.Scanner ;

public class FinDAnneeIf
{ 
    public static void main(String[] arguments) {

        int mois;
        int annee;
  
        int JoursMois;
        
        boolean Valide = false;
        boolean Bissextile  = false;
        
        String StgMois = "";
        
        while (Valide == false) {
            
            System.out.println("Saisir un numéro de mois ?");
            Scanner clavier = new Scanner(System.in) ;
            mois = clavier.nextInt() ;
            
            System.out.println("Saisir une année ?");
            Scanner clavier2 = new Scanner(System.in) ;
            annee = clavier2.nextInt() ;
                    
            if ((mois > 0) && (mois < 13) && (annee >= 1582)) {
                
                Valide = true;
                
                if (((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0 )) {
                            Bissextile = true;
                }
                
                for (int i = mois; i <= 12; i++) {
                        if (i == 1) {
                            StgMois = "Janvier";
                        } else if  (i == 2) {
                            StgMois = "Fevrier";
                        } else if  (i == 3) {
                            StgMois = "Mars";
                        } else if  (i == 4) {
                            StgMois = "Avril";
                        } else if  (i == 5) {
                            StgMois = "Mai";
                        } else if  (i == 6) {
                            StgMois = "Juin";
                        } else if  (i == 7) {
                            StgMois = "Juillet";
                        } else if  (i == 8) {
                            StgMois = "Aout";
                        } else if  (i == 9) {
                            StgMois = "Septembre";
                        } else if  (i == 10) {
                            StgMois = "Octobre";
                        } else if  (i == 11) {
                            StgMois = "Nomvembre";
                        } else {
                            StgMois = "Decembre";
                        } 
                        
                        if (i == 2 ) {
                            if (Bissextile == true) {
                                JoursMois = 29;
                            } else {
                                JoursMois = 28;
                            }
                        } else {
                            if ((i == 1)||(i == 3)||(i == 5)||(i == 7)||(i == 8)||(i == 10)||(i == 12)) {
                                JoursMois = 31;
                            } else {
                                JoursMois = 30;
                            }
                        }
                        
                        System.out.println(StgMois + " " +annee+","+" "+JoursMois+" jours");
                }
            } else {
                System.out.println("Cette date n'est pas valide.");
                System.out.println("");
            }
        }
    }
    
    public static void SaisieControlee() {
         int val = 0;
         
         while ((val < 1) || (val > 10)) {
            System.out.println("Entrer un nombre entier compris entre 1 et 10 :");
            Scanner clavier = new Scanner(System.in) ;
            val = clavier.nextInt() ;
         }
         
         System.out.println("Vous avez correctement saisi : "+val+".");
    }
}

