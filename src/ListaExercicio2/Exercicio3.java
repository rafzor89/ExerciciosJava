/**
 * Leo o nome, 2 notas e a frequencia de um aluno em uma disciplina e verificar se o aluno foi aprovado ou n�o,
 * sabendo que para ser aprovado um aluno precisa ter m�dia >=6,0 e frequencia > 70%
 */
package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio3 {

	

	

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
		System.out.println("Digite o nome do Aluno:");
		String nome = teclado.nextLine();
		
		System.out.println("Digite a Primeira nota do Aluno:");
		float n1 = teclado.nextFloat();
		
		System.out.println("Digite a Segunda nota do Aluno:");
		float n2 = teclado.nextFloat();
		
		float media = (n1+n2)/2;
		
		System.out.println("Digite a Frequencia do Aluno:");
		int freq = teclado.nextInt();
		
		if (media >= 6 && freq > 70) {
			System.out.println("Parab�ns "+nome+" sua m�dia foi "+media+" Voc� est� APROVADO!");
		} else {
			System.out.println(nome+" sua m�dia foi "+media+", por�m, infelizmente voc� foi REPROVADO");
		}

	}

}
