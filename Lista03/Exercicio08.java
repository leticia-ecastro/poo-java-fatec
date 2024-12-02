/*
 * Letícia Elaine de Castro
 * 
 * Crie um programa que solicite ao usuário um número inteiro, que representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um array. Através de um método que receba esse array de números inteiros como parâmetro de entrada, calcule e retorne o MDC (Máximo Divisor Comum) desse conjunto de dados. Valide as entradas para aceitar apenas números positivos (pode ser um método).
 */


import java.util.Scanner;

public class Exercicio08 {
	
	public static void main (String[] args) {
		int quantidadeTermos;
		Scanner entrada = new Scanner(System.in);
        do {
			System.out.print("Digite a quantidade de termos: ");
			quantidadeTermos = entrada.nextInt();
			if(quantidadeTermos < 1) {
				System.out.println("ATENÇÃO! A quantidade de termos deve ser maior que 0.");
			}
		} while(quantidadeTermos < 1);
		
		int[] numeros = new int[quantidadeTermos];
		for (int i = 0; i < quantidadeTermos; i++) {
			do {
				System.out.print("Entre com " + (i + 1) + "º numero: ");
				numeros[i] = entrada.nextInt();
				if (numeros[i] <= 0) {
					System.out.println("ATENÇÃO! Informe um numero maior que 0.");
				}
			} while (numeros[i] <= 0);
		}
		entrada.close();
		
		int mdc = calcularMdc(numeros);
		System.out.println("MDC dos numeros digitados = " + mdc);
	}
    
    public static int calcularMdc (int[] numeros) {
        int mdc = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            int resto;
            do {
				resto = mdc % numeros[i];
				mdc = numeros[i];
				numeros[i] = resto;
			} while (numeros[i] != 0);
        }
        return mdc;
    }
}
