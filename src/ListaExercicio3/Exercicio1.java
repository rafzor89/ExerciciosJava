/**
 * 
 */
package ListaExercicio3;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int matri = 1, matriP = 0, menorP = 0;
		String nome = "";
		double peso = 0, maiorP = 0, menorP1 = 1000;
		char sex;
		int idade = 0, mediaI = 0, i = 0, mediaIdade = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		while(matri != 0){
			if(matri != 0) {
			System.out.println("Digite a matricula:");
			matri = teclado.nextInt();
			System.out.println("Digite o nome:");
			nome = teclado.nextLine();
			nome = teclado.nextLine();
			System.out.println("Digite o peso do Atleta:");
			peso = teclado.nextDouble();
			System.out.println("Digite o sexo (M ou F:");
			sex = teclado.next().charAt(0);
			System.out.println("Digite a idade do atleta:");
			idade = teclado.nextInt();
			
			if (peso > maiorP && sex == 'M' || sex == 'm') {
				maiorP = peso;
				matriP = matri;				
			}else if(sex == 'F' || sex == 'f') {
				mediaI = idade+(idade);
				i++;
				mediaIdade = mediaI/i;
			}
			if(peso < menorP1 && sex == 'M' || sex == 'm') {
				menorP1 = peso;
				matriP = matri;
			}
			
			
			}
			
		}
		
		
		System.out.println("O peso e a matricula do atleta mais pesado ?: Peso: "+maiorP+" Matricula: "+matriP);
		System.out.println("A m?dia de idade dos atletas do sexo feminino ?: "+mediaIdade);
		System.out.println("A matricula e o peso do atleta masculino de menor peso ?: Peso: "+menorP1+" Matricula: "+matriP);

	}




	private static char charAt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
