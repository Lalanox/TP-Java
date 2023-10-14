import java.util.Scanner;
public class FizzBuzz {


    /**
     * Fonction qui calcule la suite des annonces du jeu FizzBuzz.
     * <p>Il est à noter que cette fonction comporte la précondition
     * suivante : 1 <= nbMax.</p>
     * <p>Si cette inégalité n'est pas respectée, la fonction est
     * libre de faire ce que bon lui semble.</p>
     * @param nbMax le nombre d'annonces au total.
     * @return une chaîne de caractères contenant les annonces, séparées
     *         par des espaces
    */
    public static String genererSuiteFizzBuzz(int nbMax) {
        String valreturn = "";
        
	if (1>nbMax) {
	    System.out.println("La précondition de genererSuiteFizzBuzz "
			       + "n'est pas respectée. Exécution à vos "
			       + "risques et périls.");
	}

	for (int i = 1; i <= nbMax; i++) {
	    if (i % 3 == 0 && i % 5 ==0) {
	        valreturn += "FizzBuzz ";
	    } else if (i % 5 == 0) {
	        valreturn += "Buzz ";
	    } else if (i % 3 == 0) {
	        valreturn += "Fizz ";
	    } else {
	        valreturn += i + " ";
	    }
	}

	return valreturn ;
    }


    public static void main(String [] arguments ) {

	/* ------------------------ */
	/* Des étapes préliminaires */
	/* ------------------------ */
	String suiteFizzBuzz ; 
	int val = 0;
	// A vous !
	// ...
         
         while ((val < 1) || (val > 100)) {
            System.out.println("Nombre d'annonces FizzBuzz à afficher (entre 1 et 100) ?");
            Scanner clavier = new Scanner(System.in) ;
            val = clavier.nextInt() ;
         }

	
	// Génération de la chaîne de caractères
	suiteFizzBuzz = genererSuiteFizzBuzz(val);

	
	/* ---------------------- */
	/* Des étapes conclusives */
	/* ---------------------- */

	// A vous !
	// ...
	
	System.out.println(suiteFizzBuzz);
	
    }
}