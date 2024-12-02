/*
 * Letícia Elaine de Castro
 * 
 * Criar uma classe para representar uma Data, onde teremos dia, mês e ano. Criar um método booleano que indicará se uma data inserida é válida ou não. Outro método necessário é o mostrar data.
 */


import java.util.Scanner;

public class UsaData {
	
	public static void main (String[] args) {
		Data data = new Data();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o ano: ");
		data.setAno(entrada.nextInt());
		System.out.print("Entre com o mes: ");
		data.setMes(entrada.nextInt());
		System.out.print("Entre com o dia: ");
		data.setDia(entrada.nextInt());
		
		System.out.print(data);
		System.out.print(data.verificar() ? " (data valida)" : " (data nao eh valida)");
	}
}

