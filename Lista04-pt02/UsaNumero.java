/*
 * Letícia Elaine de Castro
 * 
 * Elabore um programa em java que contenha um método que aceite um valor inteiro e retorne o número com os dígitos invertidos. O valor deve ser solicitado ao usuário.
 */

import java.util.Scanner;

public class UsaNumero {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		Numero numero = new Numero();
		int valor = 0;
		
		do {
			System.out.print("Entre com um numero: ");
			valor = entrada.nextInt();
			if (valor >= 0) {
				numero.setNumero(valor);
				System.out.println("Numero invertido: " + numero.inverterNumero());
			} else {
				System.out.println("Fim do programa.");
				break;
			}
		} while (valor >= 0);
	}
}
