/**
 * 
 */
package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um Numero:");
		int n1 = teclado.nextInt();
		
		if(n1>=1 && n1<=3) {
			n1 = n1*n1;
			System.out.println("O numero que voc? digitou ao Quadrado "+n1);
		} else if (n1 == 4 || n1 == 9) {
			double raiz = Math.sqrt(n1);
			System.out.println("A Raiz quadrada do numero que voc? digitou ? "+raiz);
		} else if (n1 >= 6 && n1 <= 8){
			double div = (double)n1 / 9;
			System.out.println("Seu numero dividido por 9 ? "+div);
		}  else {
			System.out.println("Valor Invalido");
		}
	}

	

}
