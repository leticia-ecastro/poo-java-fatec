/*
 * Letícia Elaine de Castro
 * 
 * Crie um programa que solicite ao usuário um número inteiro. Utilizando métodos, exiba a sequência dos números perfeito até o número informado.
 */
 
 
import java.util.Scanner;

public class Exercicio12{
	
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Informe um número inteiro: ");
			n = entrada.nextInt();
			if (n < 0)
			{
				System.out.print("ERRO! Valor inválido!");
			}
		} while (n < 0);
		
		if (n > 0){
			System.out.print("--> ");
			sequenciarNumerosPerfeitos(n);
		} else {
			System.out.print("ERRO! Valor inválido.");
		}
	}
	
	static void sequenciarNumerosPerfeitos(int n){
		for (int i = 6; i <= n; i++){
			int soma = 1;
			for (int j = 2; j <= i / 2; j++){
				if (i % j == 0){
					soma += j;
				}
			}
			if (soma == i){
				System.out.printf("%d ", i);
			}
		}
	}
}
