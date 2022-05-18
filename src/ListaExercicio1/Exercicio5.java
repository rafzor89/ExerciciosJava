/**
 * Escreva um programa que leia a
 * velocidade de um carro. Se ele
 * ultrapassar 80km/h, mostre uma mensagem dizendo
 * que ele foi multado. A multa vai custa R$7,00
 * por cada km acima do limite.
 */


package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a velocidade do veiculo:");
		float velo1 = teclado.nextFloat();
		
		if(velo1 > 80) {
			float multa = (velo1 - 80)*7;
			System.out.println("Você foi multado e deverá pagar o valor de "+multa);
		}else {
			System.out.println("Boa Viagem!");
		}
		
		
	}

}
