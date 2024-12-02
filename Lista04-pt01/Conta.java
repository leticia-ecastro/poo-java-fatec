/*
 * Letícia Elaine de Castro
 * 
 * 
 */


public class Conta {
	private double valorConta;
	private int quantidadePessoas;
	private boolean taxaGarcom;
	
	public Conta() {
		valorConta = 1;
		quantidadePessoas = 1;
		taxaGarcom = true;
	}
	
	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}
	
	public double getValorConta() {
		return valorConta;
	}
	
	public void setQuantidadePessoas (int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}
	
	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}
	
	public void setTaxaGarcom (boolean taxaGarcom) {
		this.taxaGarcom = taxaGarcom;
	}
	
	public boolean isTaxaGarcom() {
		return taxaGarcom;
	}
	
	public double pagarConta () {
		double valorPagar;
		if (taxaGarcom) {
			valorPagar = (valorConta / quantidadePessoas) * 0.1;
		} else {
			valorPagar = valorConta / quantidadePessoas;
		}
		return valorPagar;
	}
}

