/**
 * Ler o nome, 2 notas e a frequencia
 * de um aluno em uma disciplina e verificar
 * se o aluno foi aprovado ou n�o,
 * sabendo que para ser aprovado um aluno precisa ter m�dia
 * >=6,0 e frequencia 70%
 */


package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do Aluno:");
		String nome = teclado.nextLine();
		
		System.out.println("Digite a Primeira Nota:");
		float n1 = teclado.nextFloat();
		
		System.out.println("Digite a Segunda Nota:");
		float n2 = teclado.nextFloat();
		
		float media = (n1+n2)/2;
		
		System.out.println("Digite a frequencia do Aluno:");
		float freq1 = teclado.nextFloat();
		
		if(media >= 6 && freq1 >70){
			System.out.println("Parab�ns "+nome+" Voc� foi aprovado!");
		}else {
			System.out.println(nome+" infelizmente voc� foi reprovado!");
		}
		
	}

}
