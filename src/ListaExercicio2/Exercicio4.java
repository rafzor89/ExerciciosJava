/**
 * Entar com a idade de uma pessoa e informar:
 * 
 * Se ? Maior de idade
 * 
 * Se ? Menor de idade
 */
package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio4 {

	

	

	/**
	 * @param args
	 * @param salario 
	 * @param filho 
	 * @param salar 
	 * @param filh 
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = teclado.nextInt();
		
		if(idade >= 18) {
			System.out.println("Voc? ? maior de idade");
		} else {
			System.out.println("Voc? ? menor de idade");
		}

	}

}
