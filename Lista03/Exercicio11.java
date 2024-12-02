/*
 * Letícia Elaine de Castro
 * 
 * Crie um programa que solicite ao usuário um número inteiro. Através de um método que receba esse número inteiro como parâmetro de entrada, verifique e retorne um valor boolean, que indicará, caso true que ele é um número perfeito, caso false, que não é.
 */

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n;
		
		System.out.print("Informe um número inteiro: ");
		n = entrada.nextInt();
		entrada.close();
		
		if (validarEntrada(n)) {
			System.out.print("O numero " + n + (verificarNumeroPerfeito(n) ? " é perfeito!" : " não é perfeito!"));
		}
	}
	
	static boolean validarEntrada (int n){
			if (n <= 1) {
			System.out.print("ERRO! Valor invalido!");
			return false;
		}
		return true;
	}
	
	static boolean verificarNumeroPerfeito (int n) {
		int soma = 0;
		for (int i = 1; i <= (n / 2); i++) {
			if (n % i == 0) {
				soma += i;
			}
		}
		return (soma == n);
	}
}

