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
			System.out.println("Digite a M�dia da temperatura do m�s: ");
			temp[i] = teclado.nextFloat();
			
		}
		for(int i = 0; i<1;i++) {
			System.out.println("1 - Janeiro: "+temp[i]+", 2 - Fevereiro: "+temp[i]+", 3 - Mar�o: "+temp[i]+", 4 - Abril: "+temp[i]
					+", 5 - Maio: "+temp[i]+", 6 - Junho: "+temp[i]+", 7 - Julho: "+temp[i]+", 8 - Agosto: "+temp[i]+", 9 - Setembro: "+temp[i]+
					", 10 - Outubro: "+temp[i]+", 11 - Novembro: "+temp[i]+", 12 - Dezembro: "+temp[i]);
		}
		
		media = (temp[0]+temp[1]+temp[2]+temp[3]+temp[4]+temp[5]+temp[6]+temp[7]+temp[8]+temp[9]+temp[10]+temp[11])/12;
		System.out.println("A media da temperatura anual � de: "+media);
	}

}
