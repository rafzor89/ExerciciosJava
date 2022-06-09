/**
 * 
 */
package ListaExercicio4;

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
		float[] temp;
		temp = new float [12];
		float media = 0;
		
		
		for(int i = 0; i < temp.length; i++) {
			System.out.println("Digite a Média da temperatura do mês: ");
			temp[i] = teclado.nextFloat();
			
		}
		for(int i = 0; i < 1; i++) {
			System.out.println("1 - Janeiro: "+temp[0]+", 2 - Fevereiro: "+temp[1]+", 3 - Março: "+temp[2]+", 4 - Abril: "+temp[3]
					+", 5 - Maio: "+temp[4]+", 6 - Junho: "+temp[5]+", 7 - Julho: "+temp[6]+", 8 - Agosto: "+temp[7]+", 9 - Setembro: "+temp[8]+
					", 10 - Outubro: "+temp[9]+", 11 - Novembro: "+temp[10]+", 12 - Dezembro: "+temp[11]);
		}
		
		media = (temp[0]+temp[1]+temp[2]+temp[3]+temp[4]+temp[5]+temp[6]+temp[7]+temp[8]+temp[9]+temp[10]+temp[11])/12;
		System.out.println(" A media da temperatura anual é de: "+media);
	}

}
