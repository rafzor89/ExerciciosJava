/**
 * Exercicio1: Dado dois números, some os dois números e
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
		
		System.out.println("Digite o Primeiro Número:");
		float n1 = teclado.nextFloat();
		
		System.out.println("Digite o Segundo Número:");
		float n2 = teclado.nextFloat();
		
		float soma = n1+n2;
		
		System.out.println("A Soma dos dois números é "+soma);
				
	}
	
}