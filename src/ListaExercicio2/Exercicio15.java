/*
 * Criar uma calculadora que realize as opera��es abaixo com 2 numeros; somar,
 * diminuir, multiplicar, dividir, numero elevado a N, raiz quadrada.
 */


package ListaExercicio2;
import java.util.Scanner;
import java.lang.Math;

/**
 * @author guest01
 *
 */
public class Exercicio15 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int n1 = teclado.nextInt();
		System.out.println("Digite o segundo numero: ");
		int n2 = teclado.nextInt();
		
		System.out.println("O que voc� deseja 1 - Somar; 2- Diminuir; 3- Multiplicar; 4- Dividir; 5- Numero elevado a N ou 6- Raiz Quadrada");
		int calc = teclado.nextInt();
		
		if (calc == 1) {
			int soma = n1+n2;
			System.out.println("A soma entre "+n1+" e "+n2+" � "+soma);
		} else if (calc == 2) {
			int sub = n1-n2;
			System.out.println("A subtra��o entra "+n1+" e "+n2+" � "+sub);
		} else if (calc == 3) {
			int mult = n1*n2;
			System.out.println("A multiplica��o entre "+n1+" e "+n2+" � "+mult);
		} else if (calc == 4) {
			double div = (double)(n1/n2);
			System.out.println("A divis�o de "+n1+" e "+n2+" � "+div);
		} else if (calc == 5) {
			double elevado = CalculatePower(n1,n2);
			System.out.println(n1+" elevado a "+n2+" � "+elevado);
		} else {
			double raiz = Math.sqrt(n1);
			System.out.println("A Raiz quadrada do primeiro numero que voc� digitou � "+raiz);
			double raiz2 = Math.sqrt(n2);
			System.out.println("A Raiz quadrada do segundo numero que voc� digitou � "+raiz2);
		}
		
	}

	private static double CalculatePower(int n1, int n2) {
		// TODO Auto-generated method stub
		return Math.pow(n1,n2);
	}







	
}
