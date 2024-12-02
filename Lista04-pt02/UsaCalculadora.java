/*
 * Letícia Elaine de Castro
 * 
 * Crie uma classe para representar uma calculadora com as quatro operações básicas da aritmética e, após, uma classe que teste essa implementação.
 */


import java.util.Scanner;

public class UsaCalculadora {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		Calculadora calculadora = new Calculadora();
		int opcao = 0;
		
		System.out.print("Informe o primeiro numero: ");
		calculadora.setNumero1(entrada.nextInt());
		System.out.print("Informe o segundo numero: ");
		calculadora.setNumero2(entrada.nextInt());
		
		do {
			System.out.println("\n\n>>> OPCOES <<<");
			System.out.println("1) Somar");
			System.out.println("2) Subtrair");
			System.out.println("3) Multiplicar");
			System.out.println("4) Dividir");
			System.out.println("5) Resumo");
			System.out.println("6) Sair");
			System.out.print("\n\nDigite a opcao desejada: ");
			opcao = entrada.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.println("Soma: " + calculadora.somar() + "\n");
					break;	
				case 2:
					System.out.println("Subtracao: " + calculadora.subtrair() + "\n");
					break;
				case 3:
					System.out.println("Produto: " + calculadora.multiplicar() + "\n");
					break;
				case 4:
					System.out.println("Divisao: " + calculadora.dividir() + "\n");
					break;
				case 5:
					System.out.println(">>> Todas as Operacoes <<<:");
					System.out.println("Numero 1: " + calculadora.getNumero1());
					System.out.println("Numero 2: " + calculadora.getNumero2());
					System.out.println("Soma: " + calculadora.somar());
					System.out.println("Subtracao: " + calculadora.subtrair());
					System.out.println("Produto: " + calculadora.multiplicar());
					System.out.println("Divisao: " + calculadora.dividir() + "\n");
					break;
				case 6:
					System.out.println("\nFim do programa.\n");
					break;
				default:
					System.out.println("\nOpcao invalida!\n");
			}
		} while (opcao != 6);
	}
}

