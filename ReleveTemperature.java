import java.util.Scanner;

public class ReleveTemperature
{
    public static void main() {
        int nbValeurs = 0;
      
        double valSaisieTab;
        double valSearch;
        
        while (nbValeurs <= 0 || nbValeurs > 60) {
            System.out.println("Donner le nombre de valeurs à saisir dans le tableau entre 1 et 60 valeurs");
            Scanner clavier = new Scanner(System.in) ;
            nbValeurs = clavier.nextInt() ;
        }
        
        double [] tab = new double[nbValeurs];
        
        for (int i = 0; i<nbValeurs; i++) {
            System.out.println("Donner la "+(i+1)+" valeur");
            Scanner clavier = new Scanner(System.in) ;
            valSaisieTab = clavier.nextInt() ;
            tab[i] = valSaisieTab;
        }
        
        System.out.println("Donner une valeur à rechercher dans l'ensemble.");
        Scanner clavier = new Scanner(System.in) ;
        valSearch = clavier.nextInt() ;
        
        if (appartient(tab,valSearch)) {
            System.out.println("La valeur "+valSearch+" apartient bien à l'ensemble");
        }else {
            System.out.println("La valeur"+valSearch+"n'apartient pas à l'ensemble");
        }
        
        System.out.println("La moyenne des valeurs est : "+moyenne(tab));
        System.out.println("La valeur maximum est : "+max(tab));
        System.out.println("La valeur minimum est : "+min(tab));
    }
    
     /**
     * Retourne la moyenne d'un ensemble
     * @param  tab tableau de réel à une entrée
     */
    public static double moyenne(double tab []) {
        double moy = 0;
        
        if (tab.length > 0 ) {
            for (int i = 0 ; i < tab.length ; i++) {
                moy += tab[i];
            }
            moy = moy/tab.length;
        }
        return moy;
    }
    
     /**
     * Retourne la valeur in d'un ensemble
     * @param  tab tableau de réel à une entrée
     */
    public static double max(double tab []) {
        double max = 0;
        
        if (tab.length > 0 ) {
            max = tab[0];
            for (int i = 1 ; i < tab.length ; i++) {
                if (tab[i] > max ) {
                    max = tab[i];
                }
            }
        }
        return max;
    }
    
     /**
     * Retourne la valeur max d'un ensemble
     * @param  tab tableau de réel à une entrée
     */
    public static double min(double tab []) {
        double min = 0;
        
        if (tab.length > 0 ) {
            min = tab[0];
            for (int i = 1 ; i < tab.length ; i++) {
                if (tab[i] < min ) {
                    min = tab[i];
                }
            }
        }
        return min;
    }
    
    /**
     * Retourne si un réel appartien a un ensemble
     * @param  tab tableau de réel à une entrée
     * @param  valFind une valeur à trouver dans l'ensemble
     */
    public static boolean appartient(double tab [], double valFind) {
        boolean res = false;
        for (int i=0 ; i < tab.length ; i++) {
            if (tab[i] == valFind) {
                res = true;
            }
        }
        return res;
    }
}

