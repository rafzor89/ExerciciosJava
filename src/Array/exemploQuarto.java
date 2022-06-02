/**
 * 
 */
package Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class exemploQuarto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		
		int numero_pessoas = teclado.nextInt();
		
		int fumante = teclado.nextInt();
		
		Quarto quarto1 = new Quarto(numero, numero_pessoas, fumante);
		Quarto quarto2 = new Quarto(201, 5, 0);
		Quarto quarto3 = new Quarto(301, 1, 0);
		Quarto quarto4 = new Quarto(401, 10, 0);
		
		ArrayList<Quarto>quartos = new ArrayList<>();
			quartos.add(quarto1);
			quartos.add(quarto2);
			quartos.add(quarto3);
			quartos.add(quarto4);
			
		System.out.println(quartos);

	}

}
