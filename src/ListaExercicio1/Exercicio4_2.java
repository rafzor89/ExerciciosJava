/**
 * Uma empresa quer verificar se um empregado esta qualificado para a aposentadoria ou nao
 * para estar em condições, um dos seguintes requisitos deve ser satisfeito.
 * -Ter no minimo 65 anos
 * -ter trabalhado no minimo 30 anos
 * -Ter no minimo 60 anos e ter trabalhado no minimo 25 anos.
 * 
 * Com base nas informações acima:numero do empregado(codigo), ano de nascimento e ano de ingresso 
 * na empresa. O prgrama devera escrever a idade e o tempo de trabalho do empregado e a mensagem
 * 'Requerer aposentadoria' ou 'Não requerer'
 * 
 */


package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio4_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o Código do Funcionário:");
		int cod = teclado.nextInt();
		
		System.out.println("Digite o ano de Nasimento do Funcionário:");
		int idade = teclado.nextInt();
		idade = 2022-idade;
		
		System.out.println("Digite o Ano de ingresso na Empresa:");
		int ano = teclado.nextInt();
		ano = 2022-ano;
		
		
		if(idade>60 && ano>25) {
			System.out.println("O Funcionário com a idade "+idade+" e com o "+ano+" trabalhado deve Requerer Aposentadoria");
		}else {
			System.out.println("O Funcionário com a idade "+idade+" e com o "+ano+" trabalhado não Requerer Aposentadoria");
		}
		
		
	}

}
