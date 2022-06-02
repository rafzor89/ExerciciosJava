/*
 * Faça um algoritmo para receber um numero qualquer e informar na tela se é par ou impar
 */

package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um Numero:");
		int n1 = teclado.nextInt();
		
		if (n1 % 2 == 0) {
			System.out.println("Seu numero é par");
		} else {
			System.out.println("Seu numero é impar");
		}

	}

}
