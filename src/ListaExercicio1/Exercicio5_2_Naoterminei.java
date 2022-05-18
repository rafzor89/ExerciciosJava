/**
 * A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Esta pesquisa
 * deseja coletar os dados sobre o salario e nunmero de filhos de cada habitante e apos as leitueas escrever:
 * 
 * a) media de salario da população
 * b)media do numero de filhos
 * c)maior salario dos habitantes
 * d)porcentual de pessoas com salario menor que R$150,00
 */


package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio5_2_Naoterminei {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o Salario do Primeiro Habitante:");
		float sal1 = teclado.nextFloat();
		
		System.out.println("Digite quantos filhos ele tem:");
		int filhos1 = teclado.nextInt();
		
		System.out.println("Qual o Salario do Segundo Habitante:");
		float sal2 = teclado.nextFloat();
		
		System.out.println("Digite quantos filhos ele tem:");
		int filhos2 = teclado.nextInt();
		
		System.out.println("Qual o Salario do Terceiro Habitante:");
		float sal3 = teclado.nextFloat();
		
		System.out.println("Digite quantos filhos ele tem:");
		int filhos3 = teclado.nextInt();
		
		float media1 = (sal1+sal2+sal3)/3;
		int mediaF = (filhos1+filhos2+filhos3)/3;
		
				
		if(sal1>sal2 && sal1>sal3) {
			float maiorSalario = sal1;
			
			System.out.println("a) Média de Salario: "+media1+" ,b) Media de filhos: "+mediaF+", c) Maior Salario: "+maiorSalario+" d)Percentual de Pessoas com salario Menor que R$150,00: ");
		}else if(sal2>sal1 && sal2>sal3) {
			float maiorSalario = sal2;
			
			System.out.println("a) Média de Salario: "+media1+" ,b) Media de filhos: "+mediaF+", c) Maior Salario: "+maiorSalario+" d)Percentual de Pessoas com salario Menor que R$150,00: ");
		}else {
			float maiorSalario = sal3;
			
			System.out.println("a) Média de Salario: "+media1+" ,b) Media de filhos: "+mediaF+", c) Maior Salario: "+maiorSalario+" d)Percentual de Pessoas com salario Menor que R$150,00: ");
		}
		

	}

}
