import java.util.Scanner;

public class SaisieInfinie
{
    public static void versLInfini() {
        Scanner clavier = new Scanner(System.in);
        int saisie ;
        String message = "Entrer un nombre entier ?" ;
        int compteur ;

        compteur = 10 ;
        while ( compteur > 0 ){
            System.out.println(message);
            saisie = clavier.nextInt() ;
        }

        // Affichages
        System.out.println("Vous ne verrez jamais ce OUPS");
    }
    
    public static void Exemple1() {
        Scanner clavier = new Scanner(System.in);
        int saisie ;
        String message = "Entrer un nombre entier ?" ;
        int compteur ;

        compteur = 0 ; //Modification
        while ( compteur < 10 ){ //Modification
                System.out.println(message);
                saisie = clavier.nextInt() ;
                compteur = compteur + 1 ;
        }

        // Affichages
        System.out.println("Vous ne verrez jamais ce OUPS");
    }
    
    public static void Exemple2() {
        Scanner clavier = new Scanner(System.in);
        int saisie ;
        String message = "Entrer un nombre entier ?" ;
        int compteur ;

        // Traitements
        compteur = 10 ; // Modification
        while ( compteur > 0 ){
                System.out.println(message);
                saisie = clavier.nextInt() ;
                compteur = compteur - 1 ;
        }

        // Affichages
        System.out.println("Vous ne verrez jamais ce OUPS");
    }
    
    public static void Exemple3() {
        Scanner clavier = new Scanner(System.in);
        int saisie ;
        String message = "Entrer un nombre entier ?" ;
        int compteur ;

        // Traitements 
        
        
        compteur = 0 ;
        while ( compteur < 9 ){ //Modification
                System.out.println(message);
                saisie = clavier.nextInt() ;
                compteur = (compteur + 1) % 10 ;
        }

        // Affichages
        System.out.println("Vous ne verrez jamais ce OUPS");
    }
}

