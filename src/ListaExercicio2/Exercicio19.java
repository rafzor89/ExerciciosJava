/*
 * Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando
 * o pre�o normal de etiqueta e a escolha da condi��o de pagamento. Utilize os codigos da
 * tabela a seguir para ler qual a condi��o de pagamento escolhida e efetuar o calculo adequado
 * 
 * C�digo - Condi��o de pagamento
 * 1 - � vista em dinheiro ou cheque, recebe 10% de desconto
 * 2 - � vista no cart�o de cr�dito, recebe 15% de desconto
 * 3 - Em duas vezes, pre�o normal de etiqueta sem juros
 * 4 - Em duas vezes, pre�o normal de etiqueta mais juros de 10%
 */


package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor de etiqueta do produto:");
		double valor = teclado.nextDouble();
		System.out.println("Digite a forma de pagamento 1) � vista; 2) � vista no cart�o de cr�dito; 3) 2x sem juros ou 4) 2x com juros");
		int cod = teclado.nextInt();
		
		if(cod == 1) {
			double vist = valor-(valor*0.1);
			System.out.println("Valor a vista em dinheiro ou cheque � de R$"+vist);
		} else if (cod == 2) {
			double vist = valor-(valor*0.15);
			System.out.println("Valor a vista no cart�o de cr�dito � de R$"+vist);
		} else if (cod == 3) {
			double div = valor/2;
			System.out.println("Valor em duas vezes sem juros de R$"+div);
		} else {
			double div = valor/2;
			double juros = div+(div*0.1);
			System.out.println("Valor em duas vezes sem juros de R$"+juros);
		}
		
		

	}

}
