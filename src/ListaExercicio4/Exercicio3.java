/*
 * 
 */
package ListaExercicio4;

import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int[] notas;
		int media = 0;
		notas = new int [4];		
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite a nota:");
			notas[i] = teclado.nextInt();
			System.out.println("Nota : "+notas[i]);
		}		
		media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
		
		System.out.println("M?dia: "+media);
		}

}
