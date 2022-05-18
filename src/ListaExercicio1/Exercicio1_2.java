/**
 * Calcule a media dos alunos e indique se ele esta aprovado ou reprovado.
 * Permita que este aluno faça exame para poder ser aprovado.
 * 
 * 4 notas bimestrais
 * media para aprovacao 7
 * media para aprovacao para exame 6
 */


package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a nota 1:");
		float n1 = teclado.nextFloat();
		
		System.out.println("Digite a nota 2:");
		float n2 = teclado.nextFloat();
		
		System.out.println("Digite a nota 3:");
		float n3 = teclado.nextFloat();
		
		System.out.println("Digite a nota 4:");
		float n4 = teclado.nextFloat();
		
		float media1 = (n1+n2+n3+n4)/4;
		
		if(media1>7) {
			System.out.println("Parabéns você foi aprovado");
		}else {
			System.out.println("Digite a nota da prova de recuperação");
			float exame = teclado.nextFloat();
			if(exame>6) {
				System.out.println("Você passou na recuperação");
			}else {
				System.out.println("Você foi reprovado");
			}
		}
		
		
	}

}
