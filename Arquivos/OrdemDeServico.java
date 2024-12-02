/*
 * OrdemDeServico.java
 * 
 */

import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class OrdemDeServico {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		String desc, cli, dh, obs;
		
		System.out.print("Entre com a descricao do equipamento: ");
		desc = leia.nextLine();
		
		System.out.print("Entre com o nome do cliente: ");
		cli = leia.nextLine();
		
		System.out.print("Informe a data/hora: ");
		dh = leia.nextLine();
		
		System.out.print("Obs: ");
		obs = leia.nextLine();
		
		Equipamento equip = new Equipamento(desc, cli, dh, obs);
		
		System.out.println ( equip );
		
		if ( equip.gravaNoArquivo () ) {
			
			System.out.println("OS gravada com sucesso!");
			
		} else {
			
			System.out.println("Erro ao gravar a OS!");
		}
		
		System.out.println("\nLista de OS abertas:");
		equip.leDoArquivo();
	}
}

