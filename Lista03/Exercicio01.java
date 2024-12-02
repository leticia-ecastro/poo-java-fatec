/*
 * Letícia Elaine de Castro
 * 
 * Crie um programa de conversão de temperaturas em Celsius para Fahrenheit. O usuário deverá informar a temperatura em Celsius e será apresentada a temperatura em Fahrenheit. O processo de conversão deverá ser feito através de um método que recebe a temperatura em Celsius como parâmetro de entrada e retorne a temperatura convertida para Fahrenheit. Para o cálculo da conversão, utilize a fórmula F= (9*C/5) + 32.
 */
 

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[] args) {
		double celsius;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Informe a temperatura em graus Celsius: ");
		celsius = entrada.nextDouble();
		entrada.close();
		
		System.out.print("Temperatura convertida para Fahrenheit: " + converterParaFahrenheit(celsius));
	}
	
	static double converterParaFahrenheit (double temperaturaCelsius) {
		return (9 * temperaturaCelsius / 5) + 32;
	}
}

