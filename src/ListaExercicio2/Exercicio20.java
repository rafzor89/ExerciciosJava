/*
 * Desenvolver um programa que calcule o salario bruto e o salario liquido de um
 * funcionario:
 * - Dados de entrada: O nome do Funcionario; a Quantidade de hora extra trabalhada;
 * -Constantes: o Salario munimo = R$1.025,00; o Valor da hora - extra = R$10,00
 * 
 * sabe-se que:
 * 
 * Salario hora-extra = hora-extra*valor da hora-extra;
 * SAlario bruto = 3*Salario minimo + salario hora extra;
 * Desconto INSS = 12% do salario bruto, se o salario bruto for maior que R$2.000,00;
 * Desconto do Imposto de renda = conforme a faixa salario abaixo:
 * 
 * Salario R$ - Percentual do Imposto de Renda
 * Salario <=1.500,00 - Isento
 * Salario 1500 > Salario <= 2500 = 15% do salario
 * Salario 2500 > Salario <= 4000 = 27,5 do salario
 * Salario 4000 > salario = 35% do salario
 */


package ListaExercicio2;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class Exercicio20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do Funcionario");
		String nome = teclado.nextLine();
		
		double salario = 1025;
		System.out.println("Digite quando de Hora Extra o Funcionario fez");
		double extra = teclado.nextDouble();
		
		double horae = extra*10;
		double salarioB = (salario)+horae;
		if(salarioB > 2000) {
		 salarioB = salarioB-(salarioB*0.12);
		} 
		if (salarioB <= 1500) {
			System.out.println("Isento, seu salario liquido fica R$ "+salarioB);
		} else if (salarioB > 1500 && salarioB <= 2500) {
			salarioB = salarioB-(salarioB*0.15);
			System.out.println("Com o desconto de 15% IR seu salario liquido fica R$ "+salarioB);
		} else if (salarioB > 2500 && salarioB <= 4000) {
			salarioB = salarioB-(salarioB*0.27);
			System.out.println("Com o desconto de 27,5% IR seu salario liquido fica R$ "+salarioB);
		} else {
			salarioB = salarioB-(salarioB*0.35);
			System.out.println("Com o desconto de 35% IR seu salario liquido fica R$ "+salarioB);
		}
	}

}
