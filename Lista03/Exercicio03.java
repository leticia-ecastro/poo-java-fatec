/*
 * Letícia Elaine de Castro
 * 
 * ===Desafio!!!=== Semelhante ao exercício [POO-015] Crie um programa de conversão de temperaturas, mas agora com três possibilidades de unidade de medida: Celsius, Fahrenheit e Kelvin. A saída deverá ser as outras duas temperaturas, exemplo: entrada em Celsius, a saída deve ser em Fahrenheit e Kelvin. O processo de conversão deverá ser feito através de um ou mais métodos que recebe a temperatura fornecida como parâmetro de entrada e retorne as temperaturas convertidas. Para os cálculos de conversão, utilize as fórmulas C = 5 * (F - 32) / 9, F = (9 * C / 5) + 32 e K = C + 273. O programa deve ser executado enquanto o usuário desejar.
 */
 

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main (String[] args) {
		char resposta = ' ';
		Scanner entradaStr = new Scanner (System.in);
		Scanner entrada = new Scanner (System.in);
		double celsius, fahreinheit, kelvin;
		
		do {
			do {
				System.out.print("Opcoes: [C] Celsius | [F] Fahreinheit | [K] Kelvin | [S] Sair do programa\nSelecione uma das opcoes: ");
				resposta = entradaStr.nextLine().toUpperCase().charAt(0);
				if (resposta != 'C' && resposta != 'F' && resposta != 'K' && resposta != 'S') {
					System.out.println("Resposta Inválida! Selecione apenas uma das opções apresentadas!");
				}
			} while (resposta != 'C' && resposta != 'F' && resposta != 'K' && resposta != 'S');
			
			switch (resposta) {
				case 'C':
					System.out.print("Informe a temperatura em Celsius: ");
					celsius = entrada.nextDouble();
					System.out.printf("Temperatura convertida para Fahreinheit: %.2f", converterCelsiusParaFahrenheit(celsius));
					System.out.printf("\nTemperatura convertida para Kelvin: %.2f", converterCelsiusParaKelvin(celsius));
					System.out.println();
					break;
				case 'F':
					System.out.print("Informe a temperatura em Fahreinheit: ");
					fahreinheit = entrada.nextDouble();
					System.out.printf("Temperatura convertida para Celsius: %.2f", converterFahreinheitParaCelsius(fahreinheit));
					System.out.printf("\nTemperatura convertida para Kelvin: %.2f", converterFahreinheitParaKelvin(fahreinheit));
					System.out.println();
					break;
				case 'K':
					System.out.print("Informe a temperatura em Kelvin: ");
					kelvin = entrada.nextDouble();
					System.out.printf("Temperatura convertida para Celsius: %.2f", converterKelvinParaCelsius(kelvin));
					System.out.printf("\nTemperatura convertida para Fahreinheit: %.2f", converterKelvinParaFahreinheit(kelvin));
					System.out.println();
					break;
				case 'S':
					System.out.print("Programa finalizado.");
					break;
			}
			
		} while (resposta != 'S');
		
		entrada.close();
		entradaStr.close();
	}
		static double converterCelsiusParaFahrenheit (double celsius) {
			return (9 * celsius / 5) + 32;
		}
		
		static double converterCelsiusParaKelvin (double celsius) {
			return celsius + 273;
		}
		
		static double converterFahreinheitParaCelsius (double fahreinheit) {
			return 5 * (fahreinheit - 32) / 9;
		}
		
		static double converterFahreinheitParaKelvin (double fahreinheit) {
			return (fahreinheit - 32) * (5/9) + 273.15;
		}
		
		static double converterKelvinParaCelsius (double kelvin) {
			return kelvin - 273;
		}
		
		static double converterKelvinParaFahreinheit (double kelvin) {
			return (9 * (kelvin - 273)/5) + 32;
		}
}
