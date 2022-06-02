/**
 * Escreva um programa que leia a velocidade de um carro. Se ele ultrapassar 80km/h,
 * mostre uma mensagem dizendo que ele foi multado.A multa vai custar R$7,00 por cada km acima do limite. Exemplo
 * Dado o numero 100, o sistema deve mostrar a msg:
 * 
 * MULTADO! Você excedeu o limite permitido que é de 80km/h.
 * Você deve pagar uma multa de R$140,00!
 * 
 * Caso o usuario digite a velocidade, 78 km/h o sistema deve mostrar a msg:
 * Muito bem! Tudo certo! Dirija com segurança!
 * 
 */
package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio1 {

	

	

	/**
	 * @param args
	 * @param salario 
	 * @param filho 
	 * @param salar 
	 * @param filh 
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Digite a Velocidade do carro:");
		int velocidade = teclado.nextInt();
		
		System.out.println("RADAR!!!");
				
		if(velocidade > 80) {
			float valorMulta = (velocidade - 80)*7; 
			System.out.println("MULTADO! Você excedeu o limite permitido que é de 80km/h");
			System.out.println("Você deve pagar uma multa de R$ "+valorMulta);
		} else {
			System.out.println("Muito bem! Tudo certo! Dirija com segurança!");
		}

	}

}
