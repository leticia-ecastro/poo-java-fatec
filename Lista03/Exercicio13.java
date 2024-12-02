/*
 * Letícia Elaine de Castro
 * 
 * Crie um programa que solicite ao usuário um número inteiro, que representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um array. Através de um método que receba esse array de números inteiros como parâmetro de entrada. Este método deverá retornar, apenas, os números perfeitos existentes no conjunto recebido.
 */


import java.util.Scanner;

public class Exercicio13 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n;

		do {
			System.out.print("Informe a quantidade de termos: ");
			n = entrada.nextInt();
			if (n <= 0) {
				System.out.print("ERRO! Digite um valor positivo.");
			}
		} while (n <= 0);
		
		long[] numeros = new long[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + " numero: ");
			numeros[i] = entrada.nextLong();
		}
		entrada.close();
		
		verificarNumeroPerfeito(numeros);
	}
	
	static void verificarNumeroPerfeito(long[] numeros) {
		long contador = 0, soma = 0;

		for(int i = 0; i < numeros.length; i++) {
			contador = 1;
			soma = 0;
			while (contador < numeros[i]) {
				if (numeros[i] % contador == 0) {
					soma += contador;
				}
				contador++;
			}
			if (soma == numeros[i]) {
				System.out.print(soma + " ");
			}
		}
	}
}
