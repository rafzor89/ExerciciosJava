/**
 * A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Esta
 * pesquisa deseja coletar os dados sobre o salario e numero de filhos de cada habitante e apos
 * as leituras, escrever:
 * 
 * a) m?dia de salario da popula??o
 * b)media de filhos
 * c)maior salario dos habitantes
 * d)percentual de pessoas com salario menor que R$150,00
 */
package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float salario = 0;
		int filho = 0;
		float mSalario = 0;
		int porcentagem = 0;
		int qtt = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o Sal?rio do Habitante:");
			float salarioo = 0;
			
			salarioo =	teclado.nextFloat();
			salario = salario + salarioo;
			System.out.println("Digite quantos filhos o Habitante tem:");
			int filhoo = teclado.nextInt();
			filho = filho + filhoo;
			if(salarioo > mSalario) {
				mSalario = salario;
			}
			if(salarioo < 150) {
				porcentagem++;
			}
			qtt++;
		}
		float mediaSalario = salario/5;
		int mediaFilho = filho/5;
		double porce = (porcentagem*100)/qtt;
		
		System.out.println("a)m?dia do salario dos Habitante ? "+mediaSalario+" b)m?dia de filhos ? "+mediaFilho+" c)maior salario ? de R$ "+mSalario+" e)Porcentagem de pessoas com salario menor que R$ 150,00: "+porce+"%");

	}

}
