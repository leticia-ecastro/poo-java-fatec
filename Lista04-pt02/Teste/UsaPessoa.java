/*
 * Letícia Elaine de Castro
 * 
 * Criar uma classe para representar uma Pessoa. A pessoa tem como características o nome, em formato String, a idade, em números inteiros e a altura, que pode ter casas decimais. Além dos métodos assessores de cada característica, temos um método que recebe como parâmetro de entrada um valor lógico, que quando verdadeiro, incrementa em um a idade da pessoa e esse método deve ser chamado por fazAniversario, não havendo retorno.
 */


public class UsaPessoa {
	
	public static void main (String[] args) {
		Pessoa pessoa = new Pessoa();
		System.out.println(pessoa);
		// ou System.out.println(pessoa.toString());
		pessoa.fazAniversario(false);
		System.out.println(pessoa);
		
		pessoa.fazAniversario(true);
		System.out.println(pessoa);
	}
}

