/**
 * Desenvolva um programa que pergunte a distancia de uma viagem em KM. Calcule o
 * pre�o da passagem, cobrando R$ 0,50 por KM para viagens de at� 200KM e R$ 0,45
 * para viagens mais longas. Exemplo: Dada a distancia 1000, o sistema deve mostrar a msg:
 * 
 * Voc� est� preste a come�ar uma viagem de 1000KM
 * 
 * O pre�o da sua passagem ser� de R$450,00
 */
package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio2 {

	

	

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
		System.out.println("Digite a Distancia da Viagem em KM:");
		float kilometro = teclado.nextFloat();
		
		if(kilometro <= 200) {
			float precoPassa = (float) (kilometro * 0.50);
			System.out.println("Voc� est� preste a come�ar uma viagem de "+kilometro+" KM");
			System.out.println("O pre�o da sua passagem ser� de R$ "+precoPassa);
		} else {
			float precoPassa = (float) (kilometro * 0.45);
			System.out.println("Voc� est� preste a come�ar uma viagem de "+kilometro+" KM");
			System.out.println("O pre�o da sua passagem ser� de R$ "+precoPassa);
		}

	}

}
