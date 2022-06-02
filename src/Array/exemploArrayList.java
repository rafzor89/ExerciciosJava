/**
 * 
 */
package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author guest01
 *
 */
public class exemploArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String texto1 = "Joao";
		String texto2 = "text saushauhsua";
		String texto3 = "jaisjiajsijas";
		
		ArrayList<String> textos = new ArrayList<>();
		//adicionar na variavel textos mais itens
		textos.add(texto1);
		textos.add(texto2);
		textos.add(texto3);
		textos.add("coisas");
		System.out.println(textos);
		//remover um item
		textos.remove(3);
		System.out.println(textos);
		//trocar um item
		textos.set(2, "adaisfhaijbaiu");
		System.out.println(textos);
		//mostrar o tamanho do array
		for(int pos = 0; pos < textos.size();pos++) {
			System.out.println("Texto: " +textos.get(pos));
		}
		//Organizar por ordem 
		Collections.sort(textos);
		System.out.println(textos);
		
		

	}

}
