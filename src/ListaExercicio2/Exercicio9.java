/**
 * Com base nas informa��es acima leia: O numero do empregado (codigo), o ano de seu nascimento e o ano de seu ingresso
 * na empresa. O Programa dever� escrever a idade e o tempo de trabalho do empregado e a mensagem "Requerer aposentadorai"
 * ou "N�o requerer".
 */
package ListaExercicio2;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o c�digo do funcionario:");
		int cod = teclado.nextInt();
		System.out.println("Digite o ano de nascimento do Trabalhador 4 digitos:");
		int ano = teclado.nextInt();
		System.out.println("Digite o ano de entrada na empresa 4 digitos:");
		int emp = teclado.nextInt();
		
		int nasc = (2022 - ano);
		int temp = (2022 - emp);
		
		if(nasc >= 65 || temp >=30) {
			System.out.println("Este trabalhador de c�digo "+cod+" j� pode se aposentar!");
		} else if (nasc >=60 && temp >=25) {
			System.out.println("Este trabalhador de c�digo "+cod+" j� pode se aposentar!");
		} else {
			System.out.println("Este trabalhador de c�digo "+cod+" ainda n�o pode se aposentar!");
		}
		
		
		

	}

}
