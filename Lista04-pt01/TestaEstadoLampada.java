/*
 * Letícia Elaine de Castro
 * 
 * Escrever uma classe que implemente uma lâmpada de três estados: apagada, acesa ou meia-luz.
 */
 

import java.util.Scanner;

public class TestaEstadoLampada {
	
	public static void main (String[] args) {
		Lampada lampada = new Lampada();
		Scanner entrada = new Scanner (System.in);
		int opcao = 0;
		
		System.out.println(">>> ESTADO DA LAMPADA <<<");
		System.out.println("[1] Acesa | [2] Meia Luz | [3] Apagada");
		System.out.print("\nInforme o estado atual da lampada: ");
		lampada.setEstado(entrada.nextInt());
		
		/*
		do {
			
		} while (estado > 3);
		*/
		
		lampada.mostrarEstado();
	}
}

