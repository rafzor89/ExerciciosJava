package maquinaLavar;
import java.util.Scanner;

public class DesafioMaquina {

	public static void main(String[] args) throws InterruptedException {
		int cod;
		double lavP = 0, lavN = 0, lavR = 0, lavE = 0, lavC = 0;
		int nome = 0, est1 = 0, est2 = 0, est3 = 0, est4 = 0, est5 = 0;
		int volt = 0, tempo1 = 0, tempo2 = 0, tempo3 = 0, tempo4 = 0, tempo5 = 0;
		int kg = 0;
		double agua = 0;
		String marca = "";

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("======================================");
			System.out.println("          MENU DE SIMULA??O");
			System.out.println("======================================");
			System.out.println("                                      ");
			System.out.println("1 - Configurar a m?quina de lavar");
			System.out.println("2 - Simular a m?quina de lavar");
			System.out.println("0 - Sair");
			System.out.println("Digite o c?digo:");
			cod = teclado.nextInt();

			switch (cod) {
			case 1: {
				System.out.println("======================================");
				System.out.println("  CONFIGURA??O DA M?QUINA DE LAVAR");
				System.out.println("======================================");
				System.out.println("                                      ");
				System.out.println("Digite a Marca da M?quina:");
				marca = teclado.nextLine();
				marca = teclado.nextLine();
				while(nome != 5 && nome != 7 && nome != 10 && nome != 15) {
				System.out.println("Escolha o Modelo da M?quina: 5, 7, 10 ou 15");
				nome = teclado.nextInt();
				}
				while (volt != 220 && volt != 110) {
				System.out.println("Voltagem: (220v ou 110v: ");
				volt = teclado.nextInt();
				}
				if (nome == 5) {
					kg = 5;
				} else if (nome == 7) {
					kg = 7;
				}else if (nome == 10) {
					kg = 10;
				}else if (nome == 15) {
					kg = 15;
				}
				System.out.println("Quantos kg: " + kg);
				System.out.println("                                      ");
				System.out.println("Dura??o do Est?gio 1 - Lava??o Pesada:");
				est1 = teclado.nextInt();
				tempo1 = (est1*1000)/5;
				System.out.println("Dura??o do Est?gio 2 - Lava??o Normal:");
				est2 = teclado.nextInt();
				tempo2 = (est2*1000)/5;
				System.out.println("Dura??o do Est?gio 3 - Lava??o R?pida:");
				est3 = teclado.nextInt();
				tempo3 = (est3*1000)/5;
				System.out.println("Dura??o do Est?gio 4 - Enxague:");
				est4 = teclado.nextInt();
				tempo4 = (est4*1000)/5;
				System.out.println("Dura??o do Est?gio 5 - Centrifuga:");
				est5 = teclado.nextInt();
				tempo5 = (est5*1000)/5;
				break;
			}
			case 2: {	
				if(nome == 5 || nome == 7 || nome == 10 || nome == 15) {
					System.out.println("======================================");
					System.out.println("  SIMULA??O DA MAQUINA DE LAVAR");
					System.out.println("======================================");
					System.out.println("                                      ");
					System.out.println("Simulando o Modelo: "+marca+" - Top " + nome + "kg - " + kg + "kg - Voltagem: " + volt);
					System.out.println("                                      ");
					System.out.println("======================================");
					System.out.println("  QUAL EST?GIO VOC? DESEJA COME?AR?");
					System.out.println("======================================");
					System.out.println("1 - Lava??o Pesada");
					System.out.println("2 - Lava??o Normal");
					System.out.println("3 - Lava??o Leve");
					System.out.println("4 - Enxague");
					System.out.println("5 - Centrifuga");
					System.out.println("Selecione o est?gio inicial:");
					int est = teclado.nextInt();
					switch (est) {

					case 1: {
						for (int i = 0; i < 5; i++) {
							agua = agua + 20;
							System.out.println("Enchendo a Maquina com ?gua: " + agua + "%");							
							Thread.sleep(1000);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavP = lavP + 20;
							System.out.println("Est?gio 1 - Em Lava??o Pesada: " + lavP + "%");														
							Thread.sleep(tempo1);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavN = lavN + 20;
							System.out.println("Est?gio 2 - Em Lava??o Normal: " + lavN + "%");							
							Thread.sleep(tempo2);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavR = lavR + 20;
							System.out.println("Est?gio 3 - Em Lava??o Leve: " + lavR + "%");							
							Thread.sleep(tempo3);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavE = lavE + 20;
							System.out.println("Est?gio 4 - Em Enxague " + lavE + "%");							
							Thread.sleep(tempo4);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavC = lavC + 20;
							System.out.println("Est?gio 5 - Em Centrifuga: " + lavC + "%");							
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simula??o Finalizada");
						break;
					}
					case 2: {
						lavN = 0;
						lavR = 0;
						lavE = 0;
						lavC = 0;
						agua = 0;
						for (int i = 0; i < 5; i++) {
							agua = agua + 20;
							System.out.println("Enchendo a Maquina com ?gua: " + agua + "%");
							Thread.sleep(1000);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavN = lavN + 20;
							System.out.println("Est?gio 2 - Em Lava??o Normal: " + lavN + "%");
							
							Thread.sleep(tempo2);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavR = lavR + 20;
							System.out.println("Est?gio 3 - Em Lava??o Leve: " + lavR + "%");
							
							Thread.sleep(tempo3);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavE = lavE + 20;
							System.out.println("Est?gio 4 - Em Enxague " + lavE + "%");
							
							Thread.sleep(tempo4);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavC = lavC + 20;
							System.out.println("Est?gio 5 - Em Centrifuga: " + lavC + "%");
							
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simula??o Finalizada");
						break;
					}
					case 3: {
						lavR = 0;
						lavE = 0;
						lavC = 0;
						agua = 0;
						for (int i = 0; i < 5; i++) {
							agua = agua + 20;
							System.out.println("Enchendo a Maquina com ?gua: " + agua + "%");
							Thread.sleep(1000);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavR = lavR + 20;
							System.out.println("Est?gio 3 - Em Lava??o Leve: " + lavR + "%");
							
							Thread.sleep(tempo3);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavE = lavE + 20;
							System.out.println("Est?gio 4 - Em Enxague " + lavE + "%");
							
							Thread.sleep(tempo4);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavC = lavC + 20;
							System.out.println("Est?gio 5 - Em Centrifuga: " + lavC + "%");
							
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simula??o Finalizada");
						break;
					}
					case 4: {
						lavE = 0;
						lavC = 0;
						agua = 0;
						for (int i = 0; i < 5; i++) {
							agua = agua + 20;
							System.out.println("Enchendo a Maquina com ?gua: " + agua + "%");
							Thread.sleep(1000);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavE = lavE + 20;
							System.out.println("Est?gio 4 - Em Enxague " + lavE + "%");
							
							Thread.sleep(tempo4);

						}
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavC = lavC + 20;
							System.out.println("Est?gio 5 - Em Centrifuga: " + lavC + "%");
							
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simula??o Finalizada");
						break;
					}
					case 5: {						
						lavC = 0;						
						System.out.println("                                      ");
						for (int i = 0; i < 5; i++) {
							lavC = lavC + 20;
							System.out.println("Est?gio 5 - Em Centrifuga: " + lavC + "%");
							
							Thread.sleep(tempo5);
						}
						System.out.println("                                      ");
						System.out.println("Simula??o Finalizada");
						System.out.println("                                      ");
						break;
					}
					}
					break;
					
				}else {
					System.out.println("                                      ");
					System.out.println("                                      ");
					System.out.println("Por favor, escolha uma Maquina do cat?logo");
					System.out.println("                                      ");
					System.out.println("                                      ");
				}
				}				
			}		
		} while (cod != 0);
		System.out.println("Programa Finalizado!");
	}
}