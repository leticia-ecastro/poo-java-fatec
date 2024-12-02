/*
 * Letícia Elaine de Castro
 * 
 * Criar uma classe para resolver a equação do segundo grau, sendo necessário passar os valores de a, b e c. Criar um método interno para o cálculo do delta e um público para mostrar o valor das raízes, ou da raiz ou ainda informar que não existem raízes reais. Lembre-se de validar para ver é uma equação do segundo grau.
 */


import java.util.Scanner;

public class TestaEquacao2Grau {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		Equacao2Grau equacao = new Equacao2Grau();
		
		System.out.print("Entre com o valor de a: ");
		equacao.setA(entrada.nextInt());
		System.out.print("Entre com o valor de b: ");
		equacao.setB(entrada.nextInt());
		System.out.print("Entre com o valor de c: ");
		equacao.setC(entrada.nextInt());
		entrada.close();
		
		System.out.println(equacao.verificarEquacao() ? "A equacao eh do 2 grau." : "A equacao nao eh do segundo grau.");
		equacao.calcularDelta();
		System.out.println("Delta = " + equacao.getDelta());
		equacao.calcularRaizes();
	}
}

