/**
 * Leia o n�mero da conta do cliente, seu saldo
 * d�bito e cr�dito. calcular e escrever o saldo
 * atual utlizando a dormula saldo atual = saldo
 * -debito + credito. Testar se saldo atual for
 * maior ou igual a zero escrever a mensagem "saldo positivo"
 * , se n�o escrever a mensagem "Saldo Negativo"
 */


package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o n�mero da conta:");
		int conta = teclado.nextInt();
		
		System.out.println("Digite o Saldo da conta:");
		float saldo = teclado.nextFloat();
		
		System.out.println("Digite valor de D�bitos do cliente:");
		float debit = teclado.nextFloat();
		
		System.out.println("Digite valor de Cr�dito do cliente:");
		float cred = teclado.nextFloat();
		
		float saldoAtual = (saldo - debit + cred);
		
		if(saldoAtual >= 0) {
			System.out.println("Saldo Positivo!");
		}else {
			System.out.println("Saldo Negativo!");
		}
	}

}
