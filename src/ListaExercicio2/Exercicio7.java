/**
 * 
 */
package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos quilos de Morango:");
		float mora = teclado.nextFloat();
		float precomora = (float) (mora*2.50);
		
		System.out.println("Quantos quilos de Maça");
		float maca = teclado.nextFloat();
		float precomaca = (float) (maca*2.2);
		
		float totalFrutas = (mora+maca);
				
		float valorTotal = (precomora+precomaca);
		
		
		if(valorTotal>25 || totalFrutas>8) {
			valorTotal = (float) ((float) valorTotal - (valorTotal*0.1));
			System.out.println("O valor a ser pago com desconto é de R$"+valorTotal);
		}else {
			
			System.out.println("O valor a ser pago é de R$"+valorTotal);
		}
		
		
	}

}
