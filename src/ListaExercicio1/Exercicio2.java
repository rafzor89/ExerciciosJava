/**
 * Exercicio2: Dado um n�mero inteiro, o 
 * programa deve mostrar o n�mero antecessor,
 * o n�mero digitado e o n�mero sucessor
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
		
		System.out.println("Digite um n�mero");
		int n1 = teclado.nextInt();
		
		int ant1 = (n1-1);
		int suc1 = (n1+1);
		
		System.out.println("O antecessor do n�mero "+n1+" � "+ ant1+" e o n�mero sucessor � "+suc1);
	}

}
