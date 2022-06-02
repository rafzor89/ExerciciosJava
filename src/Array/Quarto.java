/**
 * 
 */
package Array;

/**
 * @author guest01
 *
 */
public class Quarto {

	private int numero;
	private int qtd_pessoas;
	private int fumante;
	
	public Quarto(int num, int qtd, int fuma) {
		this.numero = num;
		this.qtd_pessoas = qtd;
		this.fumante = fuma;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQtd_pessoas() {
		return qtd_pessoas;
	}

	public void setQtd_pessoas(int qtd_pessoas) {
		this.qtd_pessoas = qtd_pessoas;
	}

	public int getFumante() {
		return fumante;
	}

	public void setFumante(int fumante) {
		this.fumante = fumante;
	}
	
	@Override
	public String toString() {
		return "[Quarto: "+this.numero+" Pessoas: "+this.qtd_pessoas+" Fumante: "+this.fumante+" ]";
	}

}
