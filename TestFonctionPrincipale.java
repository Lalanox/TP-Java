
import java.util.Scanner;

public class TestFonctionPrincipale
{
    /** Programme principal, le paramètre du main n'étant pas utilisé ici nous ne commentons pas,
    il devra l'être en cas d'utilisation (cf. suite) 
     */
    public static void main(String[] args) {
        System.out.println("Debut du main");
        afficherTirets(13);
        afficherTableauChaine(args);
        System.out.println("avec un tableau d'arguments de taille " + args.length);
    }

    /**
     * Affiche autant de pfn tirets à l'écran
     * @param  pfn IN nombre de tirets à afficher
     */
    public static void afficherTirets(int pfn) {
        int i;
        String accu = "" ;
        for(i = 0 ; i < pfn ; i++) {
            accu += "-" ;
        }
        System.out.println(accu);
    }

    /**
     * Affiche tous les elements du tableau
     * @param  tableau de chaine de caractères
     */
    public static void afficherTableauChaine(String tab []) {
        String msg = "";
        for(int i = 0 ; i < tab.length ; i++) {
            msg += tab[i]+" ";
        }
        System.out.println(msg);
    }   
    
    public static void testRandom() {
        System.out.println((int) (Math.random()*10));
        System.out.println((int) (Math.random()*10));
        System.out.println((int) (Math.random()*10));
        System.out.println((int) (Math.random()*10));
        System.out.println((int) (Math.random()*10));
        System.out.println((int) (Math.random()*10));
    }
    
    public static void Random(String arguments[]) {
        int largeur = -1;
        
        if (arguments.length > 0) {
            largeur = Integer.parseInt(arguments[0]);
        } else {
            System.out.println("Pour N x N tirages aleatoires : choisissez N ?");
            Scanner clavier = new Scanner(System.in) ;
            largeur = clavier.nextInt() ;
        
            while (largeur < 0) {
                System.out.println("Pour N x N tirages aleatoires : choisissez N ?");
                largeur = clavier.nextInt() ;
            }
        }
        
        int hauteur = largeur;
        System.out.println(largeur+" X "+ hauteur + " = " + largeur*hauteur+" tirages avec Math.random() :");
        
        int nb0 = 0;
        int nb1 = 0;
        int nb2 = 0;
        int nb3 = 0;
        int nb4 = 0;
        int nb5 = 0;
        int nb6 = 0;
        int nb7 = 0;
        int nb8 = 0;
        int nb9 = 0;
        
        int tirage;
        String matrice = "";
        String ligne = "";
        
        for(int indiceLigne = 1; indiceLigne <= hauteur; indiceLigne ++) {
            for (int indiceColonne = 1; indiceColonne <= largeur; indiceColonne ++) {
                tirage = (int) (Math.random()*10);
                ligne += tirage+"     ";
                
                if (tirage == 0 ) {
                    nb0 += 1;
                } else if (tirage == 1){
                    nb1 += 1;
                } else if (tirage == 2){
                    nb2 += 1;
                }  else if (tirage == 3){
                    nb3 += 1;
                }  else if (tirage == 4){
                    nb4 += 1;
                } else if (tirage == 5){
                    nb5 += 1;
                } else if (tirage == 6){
                    nb6 += 1;
                } else if (tirage == 7){
                    nb7 += 1;
                } else if (tirage == 8){
                    nb8 += 1;
                } else if (tirage == 9){
                    nb9 += 1;
                }
            }
            matrice += ligne+"\n";
            ligne = "";
        }
        
        System.out.println(matrice);
        
        System.out.println("Nombre de fois 0"+" : "+nb0);
        System.out.println("Nombre de fois 1"+" : "+nb1);
        System.out.println("Nombre de fois 2"+" : "+nb2);
        System.out.println("Nombre de fois 3"+" : "+nb3);
        System.out.println("Nombre de fois 4"+" : "+nb4);
        System.out.println("Nombre de fois 5"+" : "+nb5);
        System.out.println("Nombre de fois 6"+" : "+nb6);
        System.out.println("Nombre de fois 7"+" : "+nb7);
        System.out.println("Nombre de fois 8"+" : "+nb8);
        System.out.println("Nombre de fois 9"+" : "+nb9);
        
    }
}

