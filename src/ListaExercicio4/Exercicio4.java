/**
 * 
 */
package ListaExercicio4;

import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int[][] nota;
		nota = new int [4][4];
		int media = 0;
		
		int f = 0;
		
		
		for (int i = 0; i<4; i++) {
			for (int j = 0;j<4;j++) {
				System.out.println("Digite a Primeira Nota: ");
				nota[i][j] = teclado.nextInt();							
				media = (nota[i][0]+nota[i][1]+nota[i][2]+nota[i][3])/4;				
			}
			System.out.println("Media: "+media);
			if(media>=7) {
				f++;			
			}
		}
		System.out.println("Numero de alunos com media maior ou igual a 7 s?o de: "+f);
	}

}
