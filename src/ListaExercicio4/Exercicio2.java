package ListaExercicio4;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] numero;
		numero = new double[10];
		

		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite um numero:");
			numero[i] = teclado.nextInt();

		}
		for (int i = 9; i >= 0; i--) {
			System.out.println(numero[i]);
		}
	}
}
