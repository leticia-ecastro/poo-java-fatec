
import java.util.Scanner;

public class TestaModeloDeComputador {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		ModeloDeComputador computador = new ModeloDeComputador();
		
		char opcaoProcessador = ' ';
		
		System.out.println("TABELA DE PRECOS");
		System.out.println(">>> Placa Mae <<<");
		System.out.println("Placa Mae: R$800,00");
		computador.setPlacaMae(800);
		
		computador.exibirOpcoesProcessadores();
		System.out.print("Digite a opcao desejada: ");
		opcaoProcessador = entrada.next().charAt(0);
		if (opcaoProcessador == '1') {
			computador.setProcessador(700);
		} else if (opcaoProcessador == '2') {
			computador.setProcessador(830);
		} else if (opcaoProcessador == '3') {
			computador.setProcessador(910);
		} else {
			System.out.println("Opcao invalida!");
		}
		
		System.out.println(computador.calcularPreco());

	}
}

