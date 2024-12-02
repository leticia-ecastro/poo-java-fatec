/*
 * Letícia Elaine de Castro
 * 
 * Elabore um programa em java que contenha um método booleano que teste se um ano é ou não bissexto. Anos divisíveis por 4 são bissextos, exceto para aqueles divisíveis por 100, ao menos que sejam também divisíveis por 400.
 */


public class Ano {
	private int ano;
	
	public Ano() {
		this.ano = 2023;
	}
	
	public void setAno (int ano) {
		if (ano >= 1) {
			this.ano = ano;
		}
	}
	
	public int getAno() {
		return ano;
	}
	
	public boolean isBissexto () {
		//return (ano % 4 == 0);
		return (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0);
	}
}

