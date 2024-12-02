/*
 * Letícia Elaine de Castro
 * 
 * Criar uma classe para representar uma lâmpada vendida em um supermercado. Além de marca, modelo e tipo, esta deve conter um atributo que indique um dos dois possíveis estados da lâmpada (acesa ou apagada).
 */


public class Lampada {
	private String modelo;
	private String tipo;
	private String marca;
	private int estado;
	
	public Lampada() {
		this.modelo = "";
		this.tipo = "";
		this.marca = "";
		this.estado = 1;
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public void mostrarEstado() {
		if (this.estado == 1) {
			System.out.println("Lampada acesa.");
		} else if (this.estado == 2) {
			System.out.println("Lampada apagada.");
		} else if (this.estado == 3){
			System.out.println("Lampada na meia luz.");
		} else {
			System.out.print("Opcao invalida.");
		}
	}
	
	@Override //é POLIMORFISMO = utilizo a mesma assinatura do método toString() mas modifico o comportamento dele (sobrescrita do método)
	public String toString () {
		return "Modelo: " + modelo + "\nTipo: " + tipo + "\nMarca: " + marca;
	}
}
