/*
 * Letícia Elaine de Castro 
 * 
 * Crie um programa que solicite ao usuário dois números inteiros. Estes, devem ser passados como parâmetros de entrada para um método que irá gerar todos os números primos existentes no intervalo fechado desses dois valores e retornar uma array com a resposta. O programa principal ficará com a responsabilidade de imprimir o array de primos retornado pelo método. O método deve aceitar e entender como sendo a mesma coisa passar, por exemplo, os valores 1 e 100 ou 100 e 1.
 */


import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        numero1 = entrada.nextInt();
        System.out.print("Informe o segundo numero: ");
        numero2 = entrada.nextInt();

		entrada.close();
		
        int[] primos = gerarPrimos(numero1, numero2);
		System.out.println("Numeros primos existentes dentro desse intervalo:");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
        }

    }

    static int[] gerarPrimos(int n1, int n2) {
        int[] listaPrimos;
        int quantidadePrimos = 0;

        for (int i = Math.min(n1,n2); i < Math.max(n1,n2); i++) {
            int divisores = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 0) {
                quantidadePrimos++;
            }
        }

		listaPrimos = new int[quantidadePrimos];
        
        quantidadePrimos = 0;

        for (int i = Math.min(n1,n2); i <= Math.max(n1,n2); i++) {
            int divisores = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 0) {
                listaPrimos[quantidadePrimos] = i;
                quantidadePrimos++;
            }
        }
        
        return listaPrimos;
    }
}
