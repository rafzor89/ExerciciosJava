/**
 * 
 */
package ListaExercicio4;

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
		int[] numero;
		numero = new int[10];
		
		for (int i =0; i < numero.length; i++) {
		System.out.println("Digite um numero:");
		numero[i] = teclado.nextInt();
		
		}
		for (int i = 0 ; i < 10; i++) {
			System.out.println(numero[i]);
		}

	}

}
