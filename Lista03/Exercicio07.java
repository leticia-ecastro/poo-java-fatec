/*
 * Letícia Elaine de Castro
 * 
 * Crie um programa que solicite ao usuario dois numeros inteiros. Atraves de um metodo que receba esses dois numeros inteiros como parametro de entrada, calcule e retorne o MDC (Maximo Divisor Comum) destes numeros fornecidos.
 */


import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		int numero1, numero2;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo numero: ");
		numero2 = entrada.nextInt();
		
		entrada.close();
		
		int mdc = calcularMdc(numero1,numero2);
		System.out.print("MDC: " + mdc);
	}
	
	static int calcularMdc(int n1, int n2){
		return (n2 == 0) ? n1 : calcularMdc(n2, n1 % n2);
    }
}
