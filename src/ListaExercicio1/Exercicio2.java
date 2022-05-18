/**
 * Exercicio2: Dado um número inteiro, o 
 * programa deve mostrar o número antecessor,
 * o número digitado e o número sucessor
 *
 */

package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int n1 = teclado.nextInt();
		
		int ant1 = (n1-1);
		int suc1 = (n1+1);
		
		System.out.println("O antecessor do número "+n1+" é "+ ant1+" e o número sucessor é "+suc1);
	}

}
