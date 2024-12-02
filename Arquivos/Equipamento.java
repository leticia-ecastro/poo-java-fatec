/*
 * Equipamento.java
 * 
 */
 
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class Equipamento {
	
	private static String descricao, cliente, dataHora, observacao;
	private static String arquivo = "dados.txt",
	               separador = ";";
	
	public Equipamento () {
		setDescricao  ( "" );
		setCliente    ( "" );
		setDataHora   ( "" );
		setObservacao ( "" );
	}
	
	public Equipamento ( String descricao, String cliente, String dataHora, String observacao ) {
		setDescricao  ( descricao );
		setCliente    ( cliente );
		setDataHora   ( dataHora );
		setObservacao ( observacao );
	}
	
	public void setDescricao ( String descricao ) {
		this.descricao = descricao;
	} 
	
	public void setCliente ( String cliente ) {
		this.cliente = cliente;
	} 
	
	public void setDataHora ( String dataHora ) {
		this.dataHora = dataHora;
	} 
	
	public void setObservacao ( String observacao ) {
		this.observacao = observacao;
	} 
	
	public String getDescricao () {
		
		return descricao;
	}
	
	public String getCliente () {
		
		return cliente;
	}
	
	public String getDataHora () {
		
		return dataHora;
	}
	
	public String getObservacao () {
		
		return observacao;
	}
	
	@Override
	public String toString () {
		
		return "[Equipamento: " + descricao + 
			   ", Cliente: " + cliente + 
			   ", Data/Hora: " + dataHora + 
			   ", Observacao: " + observacao + "]\n";
	}
	
	public static boolean gravaNoArquivo () {
		
		try {
			FileWriter fw = new FileWriter ( arquivo, true ); //Se o arquivo não existe, cria
			
				BufferedWriter bw = new BufferedWriter ( fw );
				
					bw.write ( descricao );
					bw.write ( separador );
					bw.write ( cliente );
					bw.write ( separador );
					bw.write ( dataHora );
					bw.write ( separador );
					bw.write ( observacao );
					bw.newLine(); //enter ao final da linha
					
				bw.close();
				
			fw.close(); //fecha do último aberto até o primero aberto
			
			return true;
			
		} catch ( IOException e ) {
			
			e.printStackTrace();
			
			return false;
		}
	}
	
	public static boolean leDoArquivo () {
		
		try { 
			
			FileReader fr = new FileReader ( arquivo );
			
				BufferedReader br = new BufferedReader ( fr );
				
					while ( br.ready() ) {
						
						String linha = br.readLine ();
						System.out.println ( linha );
					}
					
				br.close();
				
			fr.close();
			
			return true;
			
		} catch ( IOException e) {
			
			return false;
		}
	}
	
	public static Equipamento[] leDoArquivoEGeraUmVetor () {
		
		int qtde = 10, contador = 0;
		
		Equipamento[] equipos = new Equipamento[qtde];
		
		try {
			
			FileReader fr = new FileReader ( arquivo );
			
				BufferedReader br = new BufferedReader ( fr );
					
					while ( contador < qtde && br.ready() ) {
						
						String linha = br.readLine ();
						
						//System.out.println ( linha );
						
						String campos[] = linha.split ( separador );
						
						equipos[contador++] = new Equipamento (campos[0], campos[1], campos[2], campos[3] );
					}
					
				br.close();
			fr.close();
			
			return equipos;
			
		} catch ( IOException e) {
			
			return null;
		}
	}
}

