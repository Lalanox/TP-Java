
public class MatriceEcran
{
    public static void printMatrice() {
        String maMatrice ;
        
        maMatrice = genererStringMatrice();
        System.out.print(maMatrice);

    }
    
    public static String genererStringLigne() {
        int largeur = 10;
        String ligne = "";
        int compteurColonne = largeur; 
        
        while (compteurColonne > 0 ) {
            ligne = ligne + "*";
            compteurColonne = compteurColonne - 1;
        }
        
        return ligne;
    }
    
    public static String genererStringMatrice() {
        int hauteur = 10;
        String matrice = "";
        int compteurLigne = hauteur;
        
        while (compteurLigne > 0) {
            matrice = matrice + genererStringLigne()+"\n";
            compteurLigne = compteurLigne - 1; 
        }
        
        return matrice;
    }
    
    
    
    
    public static void printMatriceEcran(int longueur, int largeur) {
        String maMatrice ;
        
        maMatrice = genererStringMatriceEcran(longueur,largeur);
        System.out.print(maMatrice);

    }
    
    
    public static String genererStringLigneEcran(int MaxLargeur) {
        int largeur = MaxLargeur;
        String ligne = "";
        int compteurColonne = largeur; 
        
        while (compteurColonne > 0 ) {
            ligne = ligne + "0";
            compteurColonne = compteurColonne - 1;
        }
        
        return ligne;
    }
    
    
    public static String genererStringMatriceEcran(int longueur, int largeur) {
        int hauteur = longueur;
        int maxLargeur = largeur+1;
        int compteurLigne = hauteur;
        
        String StartAndEnd = "";
        
        
        while (maxLargeur >= 0) {
            StartAndEnd = StartAndEnd+"*";
            maxLargeur = maxLargeur - 1;
        }
        
        String matrice = StartAndEnd+"\n";
        
        while (compteurLigne > 0) {
            matrice = matrice+"*"+genererStringLigneEcran(largeur)+"*"+"\n";
            compteurLigne = compteurLigne-1;
        }
        
        matrice = matrice+StartAndEnd+"\n";
        
        return matrice;
    }
}

