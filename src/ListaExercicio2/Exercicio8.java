/**
 * Uma empresa quer verificar se um empregado esta qualificado para a aposentadoria
 * ou n�o. Para estar em condi��es, um dos seguintes requisitos deve ser satisfeito.
 * Ter no minimo 65 anos de idade.
 * Ter trabalhado no minimo 30 anos
 * Ter no minimo 60 anos e ter trabalhardo no mimo 25 anos
 */
package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a idade do Trabalhador:");
		int idade = teclado.nextInt();
		
		System.out.println("Digite quanto tempo o trabalhador est� na empresa:");
		int temp = teclado.nextInt();
		
		if(idade >= 65 || temp >=30) {
			System.out.println("Este trabalhador j� pode se aposentar!");
		} else if (idade >=60 && temp >=25) {
			System.out.println("Este trabalhador j� pode se aposentar!");
		} else {
			System.out.println("Este trabalhador ainda n�o pode se aposentar!");
		}

	}

}
