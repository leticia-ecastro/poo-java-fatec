//Letícia Elaine de Castro


import java.util.Scanner;

public class UsaConversaoDeUnidadesDeArea {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		ConversaoDeUnidadesDeArea conversao = new ConversaoDeUnidadesDeArea();
		int opcao = 0;
		
		do {
			System.out.println("Opcoes de Conversao:\n[1] Metro quadrado para Pe quadrado\n[2] Pe quadrado para centimetro quadrado\n[3] Milha quadrada para acre\n[4] Acre para pe quadrado\n");
			System.out.print("Entre com uma opcao: ");
			opcao = entrada.nextInt();
			if (opcao <= 0 || opcao > 4) {
				System.out.println("\nValor invalido! Selecione uma das opcoes apresentadas.\n");
			}
		} while (opcao <= 0 || opcao > 4);
		
		System.out.print("Entre com o valor a ser convertido: ");
		double valor = entrada.nextDouble();
		
		switch (opcao) {
			case 1:
				conversao.setMetroQuadrado(valor);
				System.out.println("Valor convertido: " + conversao.metroQuadradoParaPeQuadrado());
				break;
			case 2:
				conversao.setPeQuadrado(valor);
				System.out.println("Valor convertido: " + conversao.peQuadradoParaCmQuadrado());
				break;
			case 3:
				conversao.setMilhaQuadrada(valor);
				System.out.println("Valor convertido: " + conversao.milhaQuadradaParaAcre());
				break;
			case 4:
				conversao.setAcre(valor);
				System.out.println("Valor convertido: " + conversao.acreParaPeQuadrado());
				break;
			default:
				System.out.println("\nOpcao invalida!\n");
		}
		
	}
}
