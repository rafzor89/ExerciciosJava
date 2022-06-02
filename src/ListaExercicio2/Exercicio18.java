/*
 * O IMC - indice de massa corporal é um criterio de organização mundial de saude para
 * dar uma indicação sobre a condição de peso de uma pessoa adulta. A formula é IMC =
 * peso / (altura)². Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição
 * de acordo com a tabela abaixo:
 * 
 * IMC em adultos
 * Abaixo de 18,5 -> Abaixo do peso
 * Entre 18,5 e 25 -> Peso normal
 * Entre 25 e 30 -> Acima do peso
 * Acima de 30 -> Obeso
 */


package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu peso:");
		double peso = teclado.nextDouble();
		System.out.println("Digite sua altura:");
		double altu = teclado.nextDouble();
		
		double imc = peso / (altu*altu);
		
		System.out.println("IMC em Adultos:");
		if(imc < 18.5) {
			System.out.println("Abaixo do Peso");
		} else if (imc >= 18.5 && imc <25) {
			System.out.println("Peso normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Acima do peso");
		} else {
			System.out.println("Obeso");
		}

	}

}
