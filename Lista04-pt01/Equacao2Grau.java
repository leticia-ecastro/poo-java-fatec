/*
 * Letícia Elaine de Castro
 * 
 * Criar uma classe para resolver a equação do segundo grau, sendo necessário passar os valores de a, b e c. Criar um método interno para o cálculo do delta e um público para mostrar o valor das raízes, ou da raiz ou ainda informar que não existem raízes reais. Lembre-se de validar para ver é uma equação do segundo grau.
 */


public class Equacao2Grau {
	private int a;
	private int b;
	private int c;
	private double delta;
	
	public Equacao2Grau() {
		setA(a);
		setB(b);
		setC(c);
	}
	
	public void setA(int a) {
		if (a != 0) {
			this.a = a;
		}
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public int getC() {
		return this.c;
	}
	
	public double getDelta() {
		return this.delta;
	}
	
	public boolean verificarEquacao() { 
		if (a != 0) {
			return true;
		}
		return true;
	}
	
	public void calcularDelta() {
		if (a != 0) {
			this.delta = Math.pow(this.b, 2) - (4 * this.a * this.c);
		} else {
			System.out.println("Para ter delta, a equacao precisa ser de segundo grau!");
		}
	}
	
	public void calcularRaizes() {
		if (delta >= 0){
			double x1 = (-this.b + Math.sqrt (this.delta)) / ( 2 * this.a );
			double x2 = (-this.b - Math.sqrt (this.delta)) / ( 2 * this.a );

			System.out.println("Raizes: x1 = " + x1 + ", x2 = " + x2); 
		} else {
			System.out.println("A equacao nao tem raizes reais."); 
		}
	}
}

