/**
 * Uma fruteira está vendendo frutas com a seguinte tabela de preços
 *             até 5kg                       acima de 5kg 
 * morando R$2,50 por kg                    2,20 por kg
 * maça    R$1,80 por kg                    1,50 por kg
 * 
 * Se o cliente comprar mais de 8kg em frutas ou o valor toral da compra ultrapassar R$25,00
 * receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade
 * (em kg) de morangos e a quantidade (em kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 */


package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio3_2 {

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
