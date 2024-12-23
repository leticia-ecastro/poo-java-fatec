/*
 * Letícia Elaine de Castro
 * 
 * Crie uma classe para representar uma calculadora com as quatro operações básicas da aritmética e, após, uma classe que teste essa implementação.
 */


public class Calculadora {
	private int numero1;
	private int numero2;
	
	public Calculadora () {
		this.numero1 = 1;
		this.numero2 = 1;
	}
	
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public int getNumero1() {
		return numero1;
	}
	
	public int getNumero2() {
		return numero2;
	}
	
	public int somar() {
		return numero1 + numero2;
	}
	
	public int subtrair() {
		return numero1 - numero2;
	}
	
	public int multiplicar() {
		return numero1 * numero2;
	}
	
	public double dividir() {
		return (double) numero1 / numero2;
	}
}

