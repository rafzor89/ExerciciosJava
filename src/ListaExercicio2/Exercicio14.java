/*
 * Crie um algoritmo que leia um valor e a partir disso fa?a: 1) se o valor dor 1 e 2,
 * mostre o valor elevado ao cubo; 2) se o valor dor multiplo de 3 mostre o fatorial desse numero
 * 3) se o valor for os valores 4, 5, 7 ou 8, mostre o valor dividido por 9. Caso seja nenhum dos
 * valores, informe como "valor invalido" 
 */


package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int n1 = teclado.nextInt();
		
		if(n1 == 1 || n1 == 2) {
			n1 = n1*n1*n1;
			System.out.println("Seu numero elevado ao cubo ? "+n1);
		} else if(n1 % 3 == 0){
			double i = n1;
			double f = n1;
			while( i  > 1) {
				f = f*(i-1);
				i--;		
				
			}
			System.out.println("O fatorial do numero "+n1+" ? "+f);
		
		} else if (n1 >= 4 && n1 <= 5 || n1 >= 7 && n1<=8){
			double div = (double) n1/ 9;
			System.out.println("Seu numero dividido por 9 ? "+div);
		} else {
			System.out.println("Valor Invalido");
		}
		

	}

}
