/**
 * Exercicio1: Dado dois n�meros, some os dois n�meros e
 * mostre resultado na tela.
 */
package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro N�mero:");
		float n1 = teclado.nextFloat();
		
		System.out.println("Digite o Segundo N�mero:");
		float n2 = teclado.nextFloat();
		
		float soma = n1+n2;
		
		System.out.println("A Soma dos dois n�meros � "+soma);
				
	}
	
}