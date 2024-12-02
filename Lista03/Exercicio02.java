/*
 * Letícia Elaine de Castro
 * 
 */

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main (String[] args) {
		char resposta = ' ';
		Scanner entradaStr = new Scanner (System.in);
		Scanner entrada = new Scanner (System.in);
		double celsius, fahreinheit;
		
		do {
			do {
				System.out.print("Opcoes: [C] Celsius | [F] Fahreinheit | [S] Sair do programa\nSelecione uma das opcoes: ");
				resposta = entradaStr.nextLine().toUpperCase().charAt(0);
				if (resposta != 'C' && resposta != 'F' && resposta != 'S') {
					System.out.println("Resposta Inválida! Selecione apenas uma das opções apresentadas!");
				}
			} while (resposta != 'C' && resposta != 'F' && resposta != 'S');
			
			switch (resposta) {
				case 'C':
					System.out.print("Informe a temperatura em Celsius: ");
					celsius = entrada.nextDouble();
					System.out.println("Temperatura convertida para Fahreinheit: " + converterParaFahrenheit(celsius));
					break;
				case 'F':
					System.out.print("Informe a temperatura em Fahreinheit: ");
					fahreinheit = entrada.nextDouble();
					System.out.println("Temperatura convertida para Celsius: " + converterParaCelsius(fahreinheit));
					break;
				case 'S':
					System.out.print("Programa finalizado.");
					break;
			}
			
		} while (resposta != 'S');
		
		entrada.close();
		entradaStr.close();
	}
		static double converterParaFahrenheit (double celsius) {
			return (9 * celsius / 5) + 32;
		}
		
		static double converterParaCelsius (double fahreinheit) {
			return 5 * (fahreinheit - 32) / 9;
		}
}
