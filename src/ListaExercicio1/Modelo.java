// comentar uma linha
/**
 * comentar mais de uma linha
 */
package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Modelo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * OBJETO PARA LER DO TECLADO
		 */		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome1 = teclado.nextLine();
		
		System.out.println("Matricula: ");
		int matri1 = teclado.nextInt();
		
		System.out.println("Nota 1: ");
		float nota1 = teclado.nextFloat();
		
		System.out.println("Nota 2: ");
		float nota2 = teclado.nextFloat();
		
		float media = (nota1 + nota2) /2;
		
		if(media > 6) {
			System.out.println("Nome: " +nome1+", Matricula: " +matri1+", Média: " +media+", APROVADO!");
		} else {
			System.out.println("Nome: " +nome1+", Matricula: " +matri1+", Média: " +media+", Reprovado!");
		}
		
		
		


	}

}
