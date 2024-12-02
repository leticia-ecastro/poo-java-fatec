/*
 * Letícia Elaine de Castro
 * 
 * Crie um programa que solicite ao usuario um numero inteiro. Atraves de um metodo que receba esse numero inteiro como parametro de entrada, inverta digito-a-digito e retorne um valor inteiro com o numero invertido.
 */


import java.util.Scanner;

public class Exercicio14 {
	
	public static void main (String[] args) {
		long numero, max = Long.MAX_VALUE;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Numero maximo: " + max);
		
		System.out.print("\nDigite o número que será invertido: ");
		numero = entrada.nextLong();
		
		entrada.close();
		
		inverterDigitos(numero);
	}
	
	static void inverterDigitos(long num) {
		long modulo = 0, inversor = 0, numCopia = num;
		boolean negativo;
		
		if (num < 0) {
			negativo = true;
			num *= -1;
		} else {
			negativo = false;
		}		
		
		while (num > 0) {
			modulo = num % 10;
			inversor = (inversor * 10) + modulo;
			num /= 10;
		}

		if (negativo) {
			inversor *= -1;
			System.out.printf("%d | %d", numCopia, inversor);
		} else {
			System.out.printf("%d | %d", numCopia, inversor);	
		}
	}
}

