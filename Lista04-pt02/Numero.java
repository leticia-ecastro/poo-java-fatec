/*
 * Letícia Elaine de Castro
 * 
 * Elabore um programa em java que contenha um método que aceite um valor inteiro e retorne o número com os dígitos invertidos. O valor deve ser solicitado ao usuário.
 */


public class Numero {
	private int numero;
	
	public Numero() {
		this.numero = 10;
	}
	
	public void setNumero (int numero) {
		if (numero >= 0) {
			this.numero = numero;
		}
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int inverterNumero() {
		String numeroStr = "" + numero;
		String inverso = "";
		for (int i = 0; i < numeroStr.length(); i++) {
			inverso = numeroStr.charAt(i) + inverso;
		}
		return Integer.parseInt(inverso); //converte a string para int
	}

}
