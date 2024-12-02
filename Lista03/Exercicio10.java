/*
 * Letícia Elaine de Castro
 * 
 * Crie um programa que solicite ao usuário um número inteiro, que representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um array. Através de um método que receba esse array de números inteiros como parâmetro de entrada, calcule e retorne o MMC (Mínimo Múltiplo Comum) desse conjunto de dados. Valide as entradas para aceitar apenas números positivos (pode ser um método). Utilize decomposição simultânea ou fatoração simultânea.
 */

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
		int n;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de termos: ");
		n = entrada.nextInt();
		
		int[] inteiros = new int[n];
		
		if (validarEntrada(n)) {
			for (int i = 0; i < inteiros.length; i++) {
				do {
					System.out.print("Digite o " + (i + 1) + "º numero: ");
					inteiros[i] = entrada.nextInt();
					if (inteiros[i] <= 0) {
						System.out.print("ERRO! Valor invalido!");
					}
				} while (inteiros[i] <= 0);
			}
			System.out.print("MMC = " + calcularMmc(inteiros));
		}
		
		entrada.close();
    }
    
    static boolean validarEntrada (int n) {
		if (n <= 1) {
			System.out.print("ERRO! Valor invalido!");
			return false;
		}
		return true;
	}
	
    //Algoritmo de Euclides iterativo para calcular MDC
    public static int mdc(int a, int b){        
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    //Calcula o MMC do array
    public static int calcularMmc(int[] inteiros){
        if(inteiros.length < 2){
            System.out.print("A lista deve conter pelo menos dois números");
        }
        int calcularMmc = inteiros[0];
        for(int i = 1; i < inteiros.length; i++){
            calcularMmc = calcularMmc * (inteiros[i] / mdc(calcularMmc, inteiros[i]));
        }
        return calcularMmc;
    }
}
