/**
 * calcule a media dos alunos e indique se ele esta aprovado ou reprovado. permita que este aluno fa?a
 * exame para poder ser aprovado.
 * 
 * 4 notas bimestrais
 * 
 * m?dia para aprova??o = 7,0
 * 
 * m?dia para aprova??o para Exame = 6,0
 */
package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio6 {

	

	

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
		System.out.println("Digite a Primeira nota:");
		float n1 = teclado.nextFloat();
		System.out.println("Digite a Segunda nota:");
		float n2 = teclado.nextFloat();
		System.out.println("Digite a Terceira nota:");
		float n3 = teclado.nextFloat();
		System.out.println("Digite a Quarta nota:");
		float n4 = teclado.nextFloat();
		
		float media = (n1+n2+n3+n4)/4;
		
		if(media > 7) {
			System.out.println("Sua m?dia foi "+media+", Parab?ns voc? foi Aprovado!");
		} else {
			System.out.println("Nota da prova de Recupera??o:");
			float n5 = teclado.nextFloat();
			if(n5>6) {
				System.out.println("Parab?ns sua nota na recupera??o foi "+n5+", voc? passou na Recupera??o!");
			} else {
				System.out.println("Mesmo com a Recupera??o voc? n?o passou");
			}
		}

	}

}
