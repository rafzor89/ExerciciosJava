/**
 * A prefeitura de uma cidade deseja fazer uma pesquisa entre os 5 habitantes. Esta
 * pesquisa deseja coletar os dados sobre o salario e numero de filhos de cada habitante e apos a leitura escrever
 * a) m?dia de salario da popula??o
 * b) media de numero de filhos
 */


package ListaExercicio1;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio1_7 {

	

	

	/**
	 * @param args
	 * @param salario 
	 * @param filho 
	 * @param salar 
	 * @param filh 
	 */
	public static void main(String[] args) {
		
		float salario = 0;
		int filho = 0;
		
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
				
		
		for(int i = 0; i<5; i++) {
			
			System.out.println("Digite o Salario do Habitante:");
			float salarioo = teclado.nextFloat();
			salario = salarioo+salarioo;		
			
			System.out.println("Digite a Quantidade de Filho:");
			int filhoo = teclado.nextInt();				
			filho = filhoo+filhoo;
		
							
		}
		
		
		float mediaSalario = (salario/5);
		
		int mediaFilho = (filho/5);
		 
		
		System.out.println("a) A m?dia Salarial dos habitantes ? de "+mediaSalario+", b) Media de Filhos ? de "+mediaFilho);

	}

}
