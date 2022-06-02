package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class ExemploRepeticao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");	
		int n1 = teclado.nextInt();
		int num = 0;
		
		while(num <= 10) {
			int mult = num * n1;
			System.out.println("Tabuado do numero "+n1+" é "+n1+" x "+num+" é igual a "+mult);
			num++;
		}
		
	}

}
