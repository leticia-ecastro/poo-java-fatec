/*
 * Letícia Elaine de Castro
 *  
 * Escrever uma classe ModeloDeComputador que encapsule valores que definam a configuração de um
microcomputador (tipo de processador, memória RAM, tamanho do disco rígido, tamanho do monitor, por
exemplo). Essa classe deve ter um método calcularPreco que calculará o preço do computador como sendo
a soma do custo de seus componentes:
* • Placa-mãe: R$800
* • Opções de processadores: 1600Mhz a R$700, 1800Mhz a R$830, 1900Mhz a R$910
* • Opções de memória: 1GB, 2GB, 4GB, 6GB ou 8GB, cada 1GB custa R$350.
* • Opções de disco rígido: 500 GB a R$300, 1 TB a R$420, 2TB a R$500.
* • Opções de monitor: 15 polegadas a R$320, 17 polegadas a R$520.
 */


public class ModeloDeComputador {
	private int placaMae;
	private int processador;
	private int memoria;
	private int discoRigido;
	private int monitor;
	//private char opcaoProcessador;
	
	public ModeloDeComputador() {
	}
	
	public int getPlacaMae() {
		return placaMae;
	}
	
	public void setPlacaMae(int placaMae) {
		this.placaMae = placaMae;
	}
	
	public int getProcessador() {
		return processador;
	}
	
	public void setProcessador(int procesador) {
		this.processador = processador;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	public int getDiscoRigido() {
		return discoRigido;
	}
	
	public void setDiscoRigido(int discoRigido) {
		this.discoRigido = discoRigido;
	}
	
	public int getMonitor() {
		return monitor;
	}
	
	public void setMonitor(int monitor) {
		this.monitor = monitor;
	}
	
	public double calcularPreco() {
		int precoTotal = this.placaMae + this.processador + this.memoria + this.discoRigido + this.monitor;
		return precoTotal;
	}
	
	public void exibirOpcoesProcessadores() {
		System.out.println(">>> PROCESSADORES <<<");
		System.out.println("[1] 1600Mhz: R$700,00");
		System.out.println("[2] 1800Mhz: R$830,00");
		System.out.println("[3] 1900Mhz: R$910,00");
	}
	 
	
	/*
	 * ----------------- REVER ------------------------
	public void setOpcaoProcessador(char opcaoProcessador) {
		System.out.println(">>> PROCESSADORES <<<");
		System.out.println("[1] 1600Mhz: R$700,00");
		System.out.println("[2] 1800Mhz: R$830,00");
		System.out.println("[3] 1900Mhz: R$910,00");
		if (opcaoProcessador == '1') {
			setProcessador(700);
		} else if (opcaoProcessador == '2') {
			setProcessador(830);
		} else if (opcaoProcessador == '3') {
			setProcessador(910);
		} else {
			System.out.println("Opcao invalida!");
		}
	}
	public char getOpcaoProcessador() {
		return opcaoProcessador;
	}
	*/
}

