/*
 * Letícia Elaine de Castro
 * 
 * Criar uma classe para representar uma Pessoa. A pessoa tem como características o nome, em formato String, a idade, em números inteiros e a altura, que pode ter casas decimais. Além dos métodos assessores de cada característica, temos um método que recebe como parâmetro de entrada um valor lógico, que quando verdadeiro, incrementa em um a idade da pessoa e esse método deve ser chamado por fazAniversario, não havendo retorno.
 */

import java.util.Scanner;

public class UsaPessoa {
	
	public static void main (String[] args) {
		Pessoa pessoa = new Pessoa();
		Scanner entrada = new Scanner (System.in);
		Scanner entradaStr = new Scanner (System.in);
		char resposta = ' ';
		
		System.out.print("Entre com o nome: ");
		pessoa.setNome(entrada.next());
		System.out.print("Entre com a idade: ");
		pessoa.setIdade(entrada.nextInt());
		System.out.print("Entre com a altura: ");
		pessoa.setAltura(entrada.nextDouble());
		System.out.print("Hoje eh seu aniversario? [S] = sim, [N] = nao: ");
		resposta = entradaStr.nextLine().toLowerCase().charAt(0);
		if (resposta == 's') {
			pessoa.fazAniversario(true);
		}
		
		entrada.close();
		System.out.println();
		System.out.println(pessoa);
		//ou System.out.println(pessoa.toString());
	}
}

