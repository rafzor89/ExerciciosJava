/**
 * Dado um número, o programa deve calcular
 * o dobro e o triplo desse número
 */


package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número");
		float n1 = teclado.nextFloat();
		
		float dob1 = (n1*2);
		float tri1 = (n1*3);
		
		System.out.println("O dobro do número "+n1+" é "+dob1+" e o triplo é "+tri1);
		
		
	}

}
