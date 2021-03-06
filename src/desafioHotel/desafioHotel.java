/**
 * Criar um sistema de hotel onde permita:
 * 
 *  -Cadastrar, Editar, Listar e Excluir Clientes;
 *  -Cadastrar, Editar, Listar e Excluir Quartos;
 *  -Verificar os quartos disponiveis para aloca??o;
 *  -Realizar o check-in e o check-out
 *  
 *  O cadastro dos quartos devem ter Nome, Posi??o, Fumante?, Valor da Di?ria,
 *  qtd quarto e disponibilidade de pessoas por quarto.
 *  J? o cadastro dos clientes dever? constar: Nome, data de nascimento,
 *  e-mail, telefone, cidade, UF e Fumante?
 *  
 *  Escopo a ser abordado no trabalho:
 *  	-Uso de arrays e matrizes,
 *  	-Fun??es,
 *  	-La?os de decis?o e repita??o,
 *  	-Estrutura de Dados e
 *  	-Introdu??o a l?gica de programa??o.
 */
package desafioHotel;

import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class desafioHotel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int cod, codC, codQ;
		String[][] cliente = new String[5][7];
		String[][] quarto = new String[5][6];

		do {
			System.out.println("======================================");
			System.out.println("          MENU DO HOTEL");
			System.out.println("======================================");
			System.out.println("                                      ");
			System.out.println("1 - CADASTRAR CLIENTE");
			System.out.println("2 - CADASTRAR QUARTO");
			System.out.println("3 - QUARTOS DISPONIVEIS");
			System.out.println("4 - CHECK-IN/CHECK-OUT");
			System.out.println("0 - SAIR");
			System.out.println("DIGITE O C?DIGO:");
			cod = teclado.nextInt();

			switch (cod) {
			case 1: {
				System.out.println("======================================");
				System.out.println("  		CADASTRO DO CLIENTE");
				System.out.println("======================================");
				System.out.println("                                      ");
				System.out.println("1 - CADASTRAR CLIENTE");
				System.out.println("2 - EDITAR CLIENTE");
				System.out.println("3 - LISTAR CLIENTES");
				System.out.println("4 - EXCLUIR CLIENTE");
				System.out.println("0 - SAIR");
				System.out.println("DIGITE O C?DIGO:");
				codC = teclado.nextInt();
				switch (codC) {
				case 1: {
					
					for(int i = 0; i<1; i++) {
						for (int j = 0; j < 1; j++) {					
					System.out.println("Digite o Nome do Cliente:");
					cliente[i][j] = teclado.nextLine();
					cliente[i][j] = teclado.nextLine();
					System.out.println("Digite a Data de Nascimento:");
					cliente[i][j] = teclado.nextLine();
					System.out.println("Digite o e-mail do Cliente:");
					cliente[i][j] = teclado.nextLine();
					System.out.println("Digite o telefone para contato:");
					cliente[i][j] = teclado.nextLine();
					System.out.println("Digite a cidade:");
					cliente[i][j] = teclado.nextLine();
					System.out.println("Digite o Estado:");
					cliente[i][j] = teclado.nextLine();
					System.out.println("Fumante?:");
					cliente[i][j] = teclado.nextLine();
						}
					}
					break;
				}
				case 2: {
					System.out.println("Qual cliente gostaria de Editar:");
					break;
				}
				case 3: {
					for(int i = 0; i < cliente.length; i++) {
					System.out.println("Lista dos Clientes:");
					System.out.printf("%d", cliente);
					}
					break;
				}
				case 4: {
					System.out.println("Qual cliente gostaria de Excluir:");
					break;
				}
				}
				break;
			}
			case 2: {
				System.out.println("======================================");
				System.out.println("  		CADASTRO DO QUARTO");
				System.out.println("======================================");
				System.out.println("                                      ");
				System.out.println("1 - CADASTRAR QUARTO");
				System.out.println("2 - EDITAR QUARTO");
				System.out.println("3 - LISTAR QUARTO");
				System.out.println("4 - EXCLUIR QUARTO");
				System.out.println("0 - SAIR");
				System.out.println("DIGITE O C?DIGO:");
				codQ = teclado.nextInt();

				switch (codQ) {
				case 1: {
					System.out.println("Digite o N? do Quarto:");
					System.out.println("Digite a Posi??o:");
					System.out.println("Fumante?:");
					System.out.println("Valor Diaria:");
					System.out.println("Quantidade de Quartos:");
					System.out.println("Quartos vagos:");
					break;
				}
				case 2: {
					System.out.println("Qual quarto gostaria de Editar:");
					break;
				}
				case 3: {
					System.out.println("Lista dos Clientes:");
					break;
				}
				case 4: {
					System.out.println("Qual quarto gostaria de Excluir:");
					break;
				}

				}
			}

			}

		}while(cod!=0);System.out.println("Programa Finalizado0");
}}
