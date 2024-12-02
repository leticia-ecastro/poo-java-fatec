/*
 * Letícia Elaine de Castro
 * 
 * Criar uma classe para representar uma lâmpada vendida em um supermercado. Além de marca, modelo e tipo, esta deve conter um atributo que indique um dos dois possíveis estados da lâmpada (acesa ou apagada).
 */
 

import java.util.Scanner;

public class TestaLampada {
	
	public static void main (String[] args) {
		Lampada lampada = new Lampada();
		Scanner entrada = new Scanner (System.in);
		char estado = ' ';
		System.out.print("Entre com o modelo: ");
		lampada.setModelo(entrada.next());
		System.out.print("Entre com a marca: ");
		lampada.setMarca(entrada.next());
		System.out.print("Entre com o tipo: ");
		lampada.setTipo(entrada.next());
		System.out.print("Estado: [1] = acesa ou [2] apagada: ");
		estado = entrada.next().charAt(0);
		if (estado == '1') {
			lampada.setEstado(1);
		} else {
			lampada.setEstado(2);
		}
		entrada.close();
		System.out.println();
		
		System.out.println(lampada);
		lampada.mostrarEstado();		
	}
}
