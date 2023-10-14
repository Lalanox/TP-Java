public class Boucles
{
    public static void points() {
        int compteur = 0;
        System.out.print("DEBUT");

        while (compteur <= 10 ){
            System.out.print('.');
            compteur = compteur + 1 ;
        }

        System.out.println("FIN");
    }
    
    public static void boum() {
        int compteur = 0;
        
        while (compteur <= 10 ) {
            System.out.print(compteur+" ");
            compteur = compteur + 1 ;
        }
        
        System.out.print("BOUM");
    }
    
    public static void boumPair() {
        int compteur = 0;
        
        while (compteur <= 10 ) {
            System.out.print(compteur+" ");
            compteur = compteur + 2 ;
        }
        
        System.out.print("BOUM");
    }
    
    public static void boumPropre() {
        int compteur;
        String message;
        
        message = "";
        compteur = 0;
        while (compteur <= 10 ) {
            message = message + compteur;
            compteur = compteur+ 1 ;
        }
        
        System.out.print(message+"BOUM");
    }
    
    public static void stringConcat() {
        String message ;
        message = "IUT 2023-2024";
        System.out.println(message);

        message = "I" ;
        message = message + "U" ; // 1
        message = message + "T" ; // 1
        message = message + " " ; // 1
        message = message + "2023" ; // 1
        message = message + "-" ; // 1
        message = message + "2024" ;  // 1
        System.out.println(message);

        message = "I" + "U" + "T" + " " + "2023" + "-" + "2024";  // 1
        System.out.println(message);

        message = "I" + "U" + "T" ; // 1
        message = message + " 2023-2024" ;  // 1
        System.out.println(message);
        
        message = "I" + "U" + "T" + " " + 2023 + "-" + 2024 ;  // 1 2
        System.out.println(message);

        int annee1, annee2 ;
        annee1 = 2023 ; annee2 = 2024 ;
        message = "I" + "U" + "T" + " " + annee1 + "-" + 2024;  // 1 2
        System.out.println(message);

        message = "I" + "U" + "T" + " " + annee1 + "-" + annee2;  // 1 2
        System.out.println(message);
        
        double reel = 2023.2024 ;
        message = "I" + "U" + "T" + " " + reel ;  // 1 2
        System.out.println(message);
        
        message = "I" + "U" + "T" + " " ;
        int fin = annee1 + annee2 ; 
        System.out.println(message + fin); // A l'affichage  nous allons avoir IUT 4047
        
        System.out.println(2023 + 2024 + "*");
        System.out.println("*" + 2023 + 2024); // Si on met un caractère devant une opération alors cela affiche les entiers en chaine de caractere sinon, il seront calculer.
    }
    
}
