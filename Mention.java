
import java.util.Scanner;

/* 
 //// Jeu d'essai ////
 
 note 1 = 10
 note 2 = 20
 note 3 = 5 
 moyenne = 11.66
 mention = passable 
 
 
 note 1 = 3
 note 2 = 7
 note 3 = 14
 moyenne = 8
 mention = collé 
   
 note 1 = 18
 note 2 = 17
 note 3 = 20 
 moyenne = 18.33
 mention = très bien 
  
*/


public class Mention
{
    
    //Module (fonction) permettant de retourner une valeur comprise entre pfBorneInf et pfBorneSup
    public static double saisieC(double pfBorneInf, double pfBorneSup){
        double valeurC;
        Scanner clavier = new Scanner(System.in) ;
        System.out.println("Donnez une valeur comprise entre "+pfBorneInf+" et "+pfBorneSup+ "?");
        valeurC=clavier.nextDouble();
        while (valeurC<pfBorneInf || valeurC>pfBorneSup){
            System.out.println("Erreur ! Donnez une valeur comprise entre "+pfBorneInf+" et "+pfBorneSup+ "?");
            valeurC=clavier.nextDouble();
        }
        return valeurC;
    }


    // Mais que fait ce programme ???
    public static void calcul() {


        // Declaration des variables
        double note1, note2, note3 ;
        double somme ;
        String mention ;


        // Saisie des 3 notes
        System.out.println("Donnez la note 1");
        note1 = saisieC(0,20);
        System.out.println("Donnez la note 2");
        note2 = saisieC(0,20);
        System.out.println("Donnez la note 3");
        note3 = saisieC(0,20);



        // Calcul de la somme et de la moyenne
        somme = (note1+note2+note3)/3;
        
        if (somme < 10) {
            mention = "collé";
        } else {
            if (somme < 12) {
                mention = "passable";
            } else {
                if (somme < 14) {
                    mention = "assez Bien";
                } else {
                    if (somme < 16) {
                        mention = "bien";
                    } else { 
                        mention = "très bien";
                    }
                }
            }
            
        }



        //Affichage
        System.out.println("La somme des 3 notes est : "+somme);
        System.out.println("Mention obtenue : "+mention+" !");


  }
}

