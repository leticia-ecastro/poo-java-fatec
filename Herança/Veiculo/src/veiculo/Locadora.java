
package veiculo;

import java.util.Scanner;

public class Locadora {
    public static void main (String[] args) {
    /*
     * Passeio p[] = new Passeio[10]; //array de 10 posições de null
     * Carga c[] = new Carga[5]; //array de 5 posições de null
     */
     
    //Com polimorfismo:
    Veiculo[] v = new Veiculo[15];
    
    Scanner entrada = new Scanner (System.in);
    Scanner entradaStr = new Scanner (System.in);
    int quantidadeVeiculos = 0, opcao = 0;
    
        do {
            System.out.println("=== Locadora [" + quantidadeVeiculos + "/" + v.length + "] ===");
            System.out.println("1) Add Veículo de Passeio");
            System.out.println("2) Add Veículo de Carga");
            System.out.println("3) Mostrar todos os veículos cadastrados");
            System.out.println("4) Valor de Locação");
            System.out.println("5) Veículo com Ar Condicionado");
            System.out.println("6) Sair");
            System.out.println("-----");
            System.out.println("Informe a opção:");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1: //Add Veículo de Passeio
                
					if (quantidadeVeiculos == v.length) {
						System.out.println("\n\tCapacidade Máxima de cadastro atingida!");
						break;
					}
					
                    v[quantidadeVeiculos] = new Passeio();
                    System.out.print("Placa: ");
                    v[quantidadeVeiculosPasseio].setPlaca(entradaStr.nextLine()); //seta o valor da placa que o usuário informar
                    
                    System.out.print("Marca: ");
                    v[quantidadeVeiculos].setMarca(entradaStr.nextLine());
                    
                    System.out.print("Ano: ");
                    v[quantidadeVeiculos].setAno(entrada.nextInt());
                    
                    System.out.print("Km Inicial: ");
                    v[quantidadeVeiculos].setKmInicial(entrada.nextInt());
                    
                    System.out.print("Km Final: ");
                    v[quantidadeVeiculos].setKmFinal(entrada.nextInt());
                    
                    System.out.print("Valor do Km rodado: ");
                    v[quantidadeVeiculos].setValorKmRodado(entrada.nextDouble());
                    
                    System.out.print("Quantidade de Portas: ");
                    //Converte o objeto do tipo Veiculo para o tipo Passeio, pq setPortas só existe dentro de Passeio
                    ((Passeio) v[quantidadeVeiculos]).setPortas(entrada.nextInt());
                    
                    System.out.print("Ar Condicionado [S/N]: ");
                    //Converte o objeto do tipo Veiculo para o tipo Passeio, pq setArCondicionado só existe dentro de Passeio
                    ((Passeio) v[quantidadeVeiculos]).setArCondicionado(entradaStr.nextLine().equalsIgnoreCase("s"));
                    
                    System.out.print("\n---> Os dados estão corretos? [S/N]: ");
                    if (entradaStr.nextLine().equalsIgnoreCase("s")) {
                        quantidadeVeiculos++; //incrementa. Add uma posição
                    } else {
                        v[quantidadeVeiculos] = null; //não incrementa. Continua na mesma posição
                    }
                    break;
                    
                case 2: //Add Veículo de Carga
					if (quantidadeVeiculos == v.length) {
						System.out.println("\n\tCapacidade Máxima de cadastro atingida!");
						break;
					}
					
                    v[quantidadeVeiculos] = new Carga();
                    
                    //Para converter o tipo Veículo para o tipo Carga:
                    Carga carga = (Carga) v[quantidadeVeiculos]; //Ao invés de ficar digitando "v[quantidadeVeiculos]", agora posso usar só "carga"
                    
                    System.out.print("Placa: ");
                    carga.setPlaca(entradaStr.nextLine()); //seta o valor da placa que o usuário informar
                    
                    System.out.print("Marca: ");
                    carga.setMarca(entradaStr.nextLine());
                    
                    System.out.print("Ano: ");
                    carga.setAno(entrada.nextInt());
                    
                    System.out.print("Km Inicial: ");
                    carga.setKmInicial(entrada.nextInt());
                    
                    System.out.print("Km Final: ");
                    carga.setKmFinal(entrada.nextInt());
                    
                    System.out.print("Valor do Km rodado: ");
                    carga.setValorKmRodado(entrada.nextDouble());
                    
                    System.out.print("Capacidade: ");
                    carga.setCapacidade(entrada.nextInt()); 

                    System.out.print("\n---> Os dados estão corretos? [S/N]: ");
                    if (entradaStr.nextLine().equalsIgnoreCase("s")) {
                        quantidadeVeiculos++; //incrementa. Add uma posição
                    } else {
                        v[quantidadeVeiculos] = null; //não incrementa. Continua na mesma posição
                        
                        //ou
                        //carga = null;
                    }
                    break;

                case 3: //Mostrar todos os veículos cadastrados
                    for (int i = 0; i < v.length; i++) {
                        if (v[i] != null) {
                            System.out.println(v[i]);
                        }
                    }
                    
                    for (int i = 0; i < v.length; i++) {
                        if (v[i] != null) {
                            System.out.println(v[i]);
                        }
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;    
            }
        } while (opcao != 6);
    }
}
