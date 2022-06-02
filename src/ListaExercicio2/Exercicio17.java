/*
 * Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá
 * se somar os dois, caso contratio multiplique A por B. Ao final de qualquer um dos calculos deve-se atribuir
 * o resultado para uma variavel C e mostrar seu conteudo na tela.
 */


package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro Numero:");
		int n1 = teclado.nextInt();
		System.out.println("Digite o segundo Numero:");
		int n2 = teclado.nextInt();
		
		if(n1 == n2) {
			int soma = n1 + n2;
			System.out.println("A soma dos seus numeros é de "+soma);
		} else if (n1 != n2) {
			int mult = n1*n2;
			System.out.println("A multiplicação do seus numeros é de "+mult);
		}

	}

}
