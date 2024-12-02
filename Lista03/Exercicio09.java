/*
 * Letícia Elaine de Castro
 * 
 * Crie um programa que solicite ao usuário dois números inteiros. Através de um método que receba esses dois números inteiros como parâmetro de entrada, calcule e retorne o MMC (Mínimo Múltiplo Comum) destes números fornecidos. Utilize decomposição simultânea ou fatoração simultânea.
 */


import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		int numero1, numero2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um valor: ");
		numero1 = entrada.nextInt();
		System.out.print("Entre com outro valor: ");
		numero2 = entrada.nextInt();
		
		entrada.close();
		
		int mmc = calcularMmc (numero1, numero2);
		System.out.print("MMC: " + mmc);
	}
	
	static int calcularMmc (int n1, int n2){
		int mmc = 1;
		for (int i = 2; n1 != 1 || n2!= 1; i++) {
			boolean isPrimo = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimo = false;
				}
			}
			if (isPrimo) {
				while (n1 % i == 0 || n2 % i == 0){
					mmc *= i;
					if (n1 % i == 0) n1 /= i;
					if (n2 % i == 0) n2 /= i;
				}
			}
		}
		return mmc;
	}
}
