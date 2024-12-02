//Escreva um programa em Java para gerar uma matriz quadrada K de dimensão N. Imprimir os elementos da abaixo da diagonal secundária (exclusa). 

import java.util.Scanner;
import java.util.Random;

public class Exercicio13 {
	
	public static void main (String[] args) {
		int n;
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();
        
        do {
            System.out.print("Informe as dimensões da matriz quadrada: ");
            n = entrada.nextInt();
            if (n <= 0) {
                System.out.println("ERRO! Informe apenas valores válidos!");
            }
        } while (n <= 0);
        
        entrada.close();
        int matriz[][] = new int[n][n];
        
        System.out.println();
        
        System.out.println("Gerando a Matriz K:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(10);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        
        System.out.print("Elementos abaixo da Diagonal Secundária (exclusa): ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i > j) {
					System.out.print(matriz[i][j] + " ");
				}
            }
        }
    }
}
