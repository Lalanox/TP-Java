
import java.util.Scanner ;

public class SaisieControlee
{
     public static void main(String[] arguments) {
         int val = 0;
         
         while ((val < 1) || (val > 10)) {
            System.out.println("Entrer un nombre entier compris entre 1 et 10 :");
            Scanner clavier = new Scanner(System.in) ;
            val = clavier.nextInt() ;
         }
         
         System.out.println("Vous avez correctement saisi : "+val+".");
         
    }
}

