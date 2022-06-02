/**
 * Crie um algoritmo que leia um valor e a partir disso fa�a:1) se o valor for negativo,
 * mostre o modulo (valor sem sinal) do valor; 2) se for um valor maior do que 10,
 * solicite outro valor e mostre a diferen�a entre eles; 3) Caso o valor n�o seja de
 * nenhuma condi��o anterior, mostre o valor dividido por 5.
 */


package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um Numero:");
		int n1 = teclado.nextInt();
		
		if (n1 < 0) {
			n1 = -(n1);
			System.out.println("Valor: "+n1);
		} else if (n1 > 10) {
			System.out.println("Digite outro valor:");
			int n2 = teclado.nextInt();
			int sub = (n1 - n2);
			System.out.println("A diferen�a entre "+n1+" e "+n2+" � de "+sub+" numeros.");
		} else {
			double div = (double) n1/ 5;
			System.out.println("Seu numero dividido por 5 � "+div);
		}
	}

}
