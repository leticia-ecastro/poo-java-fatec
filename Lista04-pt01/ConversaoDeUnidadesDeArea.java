//Letícia Elaine de Castro


public class ConversaoDeUnidadesDeArea {
	private double metroQuadrado;
	private double peQuadrado;
	private double milhaQuadrada;
	private double acre;
	
	public ConversaoDeUnidadesDeArea() {
		this.metroQuadrado = metroQuadrado;
		this.peQuadrado = peQuadrado;
		this.milhaQuadrada = milhaQuadrada;
		this.acre = acre;
	}
	
	public void setMetroQuadrado(double metroQuadrado) {
		this.metroQuadrado = metroQuadrado;
	}
	
	public void setPeQuadrado(double peQuadrado) {
		this.peQuadrado = peQuadrado;
	}
	
	public void setMilhaQuadrada(double milhaQuadrada) {
		this.milhaQuadrada = milhaQuadrada;
	}
	
	public void setAcre(double acre) {
		this.acre = acre;
	}
	
	public double getMetroQuadrado() {
		return metroQuadrado;
	}
	
	public double getPeQuadrado() {
		return peQuadrado;
	}
	
	public double getMilhaQuadrada() {
		return milhaQuadrada;
	}
	
	public double getAcre() {
		return acre;
	}
	
	public double metroQuadradoParaPeQuadrado() {
		return metroQuadrado * 10.76;
	}
	
	public double peQuadradoParaCmQuadrado() {
		return peQuadrado * 929;
	}
	
	public double milhaQuadradaParaAcre() {
		return milhaQuadrada * 640;
	}
	
	public double acreParaPeQuadrado() {
		return acre * 43.560;
	}
}

