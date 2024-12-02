/*
 * Letícia Elaine de Castro
 * 
 * Criar uma classe para representar uma Data, onde teremos dia, mês e ano. Criar um método booleano que indicará se uma data inserida é válida ou não. Outro método necessário é o mostrar data.
 */


public class Data {
	private int dia;
	private int mes;
	private int ano;
	private boolean data;
	
	public Data() {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public void setDia(int dia) {
        this.dia = dia;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
        
	public boolean verificar() {
		if (!(ano >= 1900 && ano <= 2100)) {
			return false;
		}
		
		if (!(mes >= 1 && mes <= 12)) {
			return false;
		}
		
		if (dia >= 1 || dia <= 31) {
			if (mes == 1 | mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (dia <= 31) {
					return true;
				}
			} else if (mes == 4 | mes == 6 || mes == 9 || mes == 11) {
				if (dia <= 30) {
					return true;
				}
			} else if (mes == 2 && ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
				if (dia <= 29) {
					return true;
				}
			} else if (mes == 2 && !(ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0)) {
					if (dia <= 28) {
						return true;   
					}
			}
		}
		return false;
	}
}
