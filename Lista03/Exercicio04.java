/*
 * Letícia Elaine de Castro
 * 
 */

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio04 {
	
	public static void main (String[] args) {
		double notas[] = new double[3];
		Scanner entrada = new Scanner (System.in);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota da prova %d: ", (i + 1));
			notas[i] = entrada.nextDouble();
			if (notas[i] < 0 || notas[i] > 10) {
				notas[i] = 0;
			}
		}
		entrada.close();
		String resposta = calcularNotas(notas);
		System.out.println(resposta);
	}
	
	static String calcularNotas (double notas[]) {
		double somaNotas = 0, mediaAritmetica = 0, mediaMaioresNotas = 0, maiorNota = 0, menorNota = 0;
		for (int i = 0; i < notas.length; i++) {
			if (i == 0) {
				maiorNota = notas[i];
				menorNota = notas[i];
			}
			if (notas[i] > maiorNota) {
				maiorNota = notas[i];
			}
			if (notas[i] < menorNota) {
				menorNota = notas[i];
			}
			somaNotas += notas[i];
		}
		mediaAritmetica = somaNotas / 3;
		Arrays.sort(notas);
		mediaMaioresNotas = (notas[notas.length - 1] + notas[notas.length - 2]) / 2;
		
		return String.format("Media das maiores notas: %.1f  |  Media Aritmetica: %.1f  |  Maior nota: %.1f  |  Menor nota: %.1f", mediaMaioresNotas, mediaAritmetica, maiorNota, menorNota);
	}
}

