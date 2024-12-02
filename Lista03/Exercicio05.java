/* 
 * Letícia Elaine de Castro
 * 
 * Crie um programa que imprima na tela todos os números primos de 1 até 1000. Para tanto, crie um método que receba um número inteiro como parâmetro de entrada e verifique se este número é primo ou não retornando um boolean como resposta.
 */


public class Exercicio05 {
	
	public static void main (String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if (verificarPrimo(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	static boolean verificarPrimo (int numero) {
		int contador = 0;
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}
		return (contador == 2);
	}
}

