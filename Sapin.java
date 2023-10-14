
public class Sapin
{
    public static String genererStringLigne (int nb, String car){
        int cpt = 1;
        String ligne = "";
        
        while (cpt <= nb) {
            cpt = cpt + 1;
            ligne = ligne + car;
        }
        
        return ligne;
    }
    
    public static void SapinPlein (int hauteur){
        int cpt = 1;
        int nbEspace = hauteur - 1;
        int Etoiles = 1;
        String Sapin = "";
        
        while (cpt <= hauteur) {
            Sapin = Sapin + genererStringLigne(nbEspace," ");
            Sapin = Sapin + genererStringLigne(Etoiles,"*");
            cpt = cpt + 1;
            Etoiles = Etoiles + 2;
            nbEspace = nbEspace - 1;
            Sapin = Sapin + "\n";
        }
        
         System.out.print(Sapin);
    }
    

     
    public static void SapinVide (int hauteur){
        int Espaces = 1;
        int nbEspace = hauteur - 2;
        String Sapin = "";
            
        Sapin = Sapin + genererStringLigne(hauteur-1," ")+"*"+"\n";
        
        for (int i = 1; i < hauteur-1; i++) {
            Sapin = Sapin + genererStringLigne(nbEspace," ");
            Sapin = Sapin + "*"+genererStringLigne(Espaces," ")+"*";
            Sapin = Sapin + "\n";
            
            Espaces = Espaces + 2;
            nbEspace = nbEspace - 1;
        }
        
        Sapin = Sapin + genererStringLigne(Espaces+2,"*");
        
        System.out.print(Sapin);
    }
    
    
    public static void SapinCouche (int hauteur){
        String Sapin = "";
        boolean AddOrDel = true;
        int etoiles = 1;
        
        for (int i = 1; i < (hauteur*2); i++) {
                Sapin = Sapin + genererStringLigne(etoiles,"*") + "\n";
                if (etoiles >= hauteur) {
                    AddOrDel = false;
                }
                if (AddOrDel == true) {
                    etoiles = etoiles + 1;
                } else {
                    etoiles = etoiles - 1;
                }
        }
       
        System.out.print(Sapin);
    }
    
    
}

