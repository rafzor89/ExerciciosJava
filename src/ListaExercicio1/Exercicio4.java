/**
 * Dado duas médias, o programa
 * deve calcular a média aritmética.
 */


package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a 1 nota:");
		float nota1 = teclado.nextFloat();
		
		System.out.println("Digite a 2 nota:");
		float nota2 = teclado.nextFloat();
		
		float media = (nota1+nota2)/2;
		
		System.out.println("A média das notas é "+media);
		
	}

}
