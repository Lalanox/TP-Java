

import java.util.Scanner;

public class Sauts
{
    /** Retourne une valeur entière saisie au clavier comprise entre 
        deux valeurs
     * @param min la valeur minimale
     * @param max la valeur maximale
     * @return valeur entière comprise entre min et max (inclus)
     */
    public static int saisieIntMinMax(int min, int max){
	int saisie = min - 1 ;
	Scanner clavier = new Scanner(System.in) ;
	while (saisie < min || saisie > max){
	    System.out.println("Donnez une valeur comprise entre " + min + " et " + max + " :") ;
	    saisie = clavier.nextInt() ;
	}
	return saisie;
    }

    
    /** Retourne une valeur entière saisie au clavier au moins égale à min
     * @param min la valeur minimale
     * @return valeur entière au moins égale à min
     */
    public static int saisieIntMin(int min){
	int saisie = min - 1 ;
	Scanner clavier = new Scanner(System.in) ;
	while (saisie < min){
	    System.out.println("Donnez une valeur au moins égale à " + min + " :") ;
	    saisie = clavier.nextInt() ;
	}
	return saisie ;
    }


    /** Retourne une valeur réelle saisie au clavier au moins egale à min
     * @param min la valeur minimale
     * @return valeur réelle au moins égale à min
     */
    public static double saisieDoubleMin(double min){
	double saisie = min - 1 ;
	Scanner clavier = new Scanner(System.in) ;
	while (saisie < min){
	    System.out.println("Donnez une valeur au moins égale à " + min + " :") ;
	    saisie = clavier.nextDouble() ;
	}
	return saisie ;
    }

    
    /** Saisit nbSaisies réels positifs ou nuls au clavier et les stocke dans le tableau tab
     * @param nbSaisies nombre de réels à saisir
     * @param tab le tableau où stocker les saisies
     */
    public static void saisieTabD (int nbSaisies, double tab[]) {
	int i ;
	Scanner clavier = new Scanner(System.in) ;
	for (i = 0 ; i < nbSaisies ; i++) {
	    System.out.println("Valeur n°" + (i+1) + " :") ;
	    tab[i] = saisieDoubleMin(0) ;
	}
    }		

    
    /** Calcule et retourne la moyenne des sauts
     * @param nbSauts le nombre de sauts
     * @param tab le tableau contenant les sauts
     * @return la moyenne des sauts
     */
    public static double moyenneSauts(int nbSauts, double tab[]) {
	double moy = 0; 
	
	for (int i=0; i<nbSauts; i++) {
	   moy += tab[i];
	}
	
	if (nbSauts != 0 ) { // Si il n'y a pas de valeurs dans le tableau
	   moy = moy/nbSauts ;
	}
	
	return moy ;
    }

    
     /** Prendre la valeur la plus haute du tableau
     * @param nbSauts le nombre de sauts
     * @param tab le tableau contenant les sauts
     * @return la meilleur valeur
     */
    public static double meilleurSaut(int nbSauts, double tab[]) {
        double max;
        
        if (nbSauts != 0 ) { // Initialisation avec la première valeur du tab
           max = tab[0]; 
        } else { // Si il n'y a pas de valeurs dans le tableau
           max = 0;
        }
        
	for (int i=1 ; i <nbSauts ; i ++) {
	    if (tab[i] > max ) {
	        max = tab[i];
	    }
	}
	
	return max ;
    }

    /** Prendre la valeur la plus basse du tableau
     * @param nbSauts le nombre de sauts
     * @param tab le tableau contenant les sauts
     * @return la plus petite valeur
     */
    public static double pireSaut(int nbSauts, double tab[]) {
        double min;
        
        if (nbSauts != 0 ) {// Initialisation avec la première valeur du tab
           min = tab[0]; 
        } else { // Si il n'y a pas de valeurs dans le tableau
           min = 0;
        }
        
	for (int i=1 ; i <nbSauts ; i ++) {
	    if (tab[i] < min ) {
	        min = tab[i];
	    }
	}
	
	return min ;
    }
    
    /** Programme principal : 
     *  - saisit tous les sauts
     *  - calcule et affiche la moyenne des sauts
     *  - calcule et affiche le meilleur saut
     *  - calcule et affiche le pire saut
     */
    public static void main(String [] args) {

        double [] PfTab = new double [15];
        int PfMaxSauts = saisieIntMinMax(0, 15);
        
        double PfMoy, PfMax, PfMin;
        
        /* --- Saisie des sauts --- */
        saisieTabD(PfMaxSauts, PfTab);

        /* --- Moyenne des sauts --- */
        PfMoy = moyenneSauts(PfMaxSauts, PfTab);
        
        /* --- Meilleur saut --- */
        PfMax = meilleurSaut(PfMaxSauts,PfTab);

        /* --- Pire saut --- */
        PfMin = pireSaut(PfMaxSauts,PfTab);
        
        System.out.println("La moyenne des sauts : "+PfMoy);
        System.out.println("Le meilleur saut : "+PfMax);
        System.out.println("Le pire saut : "+PfMin);
        
    }

}

