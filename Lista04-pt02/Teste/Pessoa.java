/*
 * Letícia Elaine de Castro
 * 
 * Criar uma classe para representar uma Pessoa. A pessoa tem como características o nome, em formato String, a idade, em números inteiros e a altura, que pode ter casas decimais. Além dos métodos assessores de cada característica, temos um método que recebe como parâmetro de entrada um valor lógico, que quando verdadeiro, incrementa em um a idade da pessoa e esse método deve ser chamado por fazAniversario, não havendo retorno.
 */


public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa () {
		this.nome = "Leticia";
		this.idade = 28;
		this.altura = 1.69;
	}
	
	public void setNome (String nome) {
		if (nome != null && nome.length() >= 2) {
			this.nome = nome;
		}
	}
	
	public void setIdade (int idade) {
		if (idade >= 0) {
			this.idade = idade;
		}
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public String getNome () {
		return nome;
	}
	
	public int getIdade () {
		return idade;
	}
	
	public double getAltura () {
		return altura;
	}
	
	public void fazAniversario (boolean faz) {
		if (faz) {
			this.idade++;
		}
	}
	
	@Override //é POLIMORFISMO = utilizo a mesma assinatura do método toString() mas modifico o comportamento dele (sobrescrita do método)
	public String toString () {
		return "Nome: " + nome + " | idade: " + idade + " | altura: " + altura;
	}
}

