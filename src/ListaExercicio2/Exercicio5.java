/**
 * Uma empresa faz uma pesquisa para saber se as pessoas gostaram ou n�o de um
 * novo produto lan�ado no mercado. A resposta, portanto, era "sim" ou "n�o".]
 * Calcule e escreva o numero de pessoas que responderam "sim" e o numero de pessoas
 * que responderam "n�o". Simule 5 pessoas.
 */
package ListaExercicio2;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio5 {

	/**
	 * @param args
	 * @param salario 
	 * @param filho 
	 * @param salar 
	 * @param filh 
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		int pessoas1 = 0;
		int pessoass1 = 0;
		char pesq;
		
			
		
		Scanner teclado = new Scanner(System.in);
		
		
		for(int i = 0 ; i<5; i++) {
			System.out.println("Voc� gostou do novo Produto (S ou N):");
			pesq = teclado.next().charAt(0);
			if((pesq == 'S') || (pesq == 's')) {
				pessoas1 = pessoas1+1;
			} else {
				pessoass1 = pessoass1+1;
				
			}
			
		}
		System.out.println(pessoas1+" responderam Sim e "+pessoass1+" responderam N�o!");

	}

}
