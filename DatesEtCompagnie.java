
import java.util.Scanner ;

public class DatesEtCompagnie
{
     /**
     *  @param annee une année
     *  @return vrai si l'année est bissextile, faux sinon
     */
    public static boolean estBissextile(int annee) {
        boolean Bissextile = false;
        if (((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0 )) {
            Bissextile = true;
        }
        return Bissextile ;
    }
    
    
    
     /**
     *  Détermine le nombre de jours dans un mois d'une année donnée
     *  @param mois
     *      mois
     *  @param année
     *      année
     *  @return le nombre de jours dans le mois
     */
    public static int nbJours(int mois, int annee) {
        int JoursMois;
        
        if (mois == 2 ) {
            if (estBissextile(annee)) {
                JoursMois = 29;
            } else {
                JoursMois = 28;
            }
        } else {
            if ((mois == 1)||(mois == 3)||(mois == 5)||(mois == 7)||(mois == 9)||(mois == 11)) {
                JoursMois = 31;
            } else {
                JoursMois = 30;
            }
        }
        return JoursMois;
    }
    
    /**
     *  Détermine si une date est valide
     *  @param jour
     *      jour de la date
     *  @param mois
     *      mois de la date
     *  @param année
     *      année de la date
     *  @return vrai si la date est valide, faux sinon
     */
    public static boolean estValide(int jour, int mois, int annee) {
       
        boolean dateValide = true;
        
        if ((annee < 1582) || ((mois < 1) || (mois > 12)) || (jour < 1) || (jour > nbJours(mois, annee))) {
            dateValide = false;
        }
        
        return dateValide;
    }
    
    public static int saisieEntier() {
        System.out.println("Saisir un entier");
        Scanner clavier = new Scanner(System.in) ;
        int nombreSaisi = clavier.nextInt() ;
        return nombreSaisi ;
    }
    
    public static void saisieCalculAffichageValidite() {
        int jour,mois,annee;
        boolean saisieValide;
        
        jour = saisieEntier();
        mois = saisieEntier();
        annee = saisieEntier();
        
        saisieValide = estValide(jour, mois, annee);
        
        if (saisieValide == true) {
            System.out.println("La date : "+jour+" / "+mois+" / "+annee);
            System.out.println("est une date valide");
        } else {
            System.out.println("La date : "+jour+" / "+mois+" / "+annee);
            System.out.println("n'est pas une date valide");
        }
    }
}

