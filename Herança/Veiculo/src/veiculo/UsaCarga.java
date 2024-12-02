
package veiculo;

public class UsaCarga {
   public static void main (String[] args) {
       Carga carga = new Carga(); //invoca o método construtor Carga
       
       carga.setKmInicial(0);
       carga.setKmFinal(10);
       carga.setValorKmRodado(10);
       
       System.out.println("Capacidade: " + carga.getCapacidade() + "T");
       System.out.println("Valor km inicial: " + carga.getKmInicial() + "km");
       System.out.printf("Valor de Locação: R$%.2f\n",carga.calculaValorLocacao());
       
       System.out.println("\n\n" + carga);
       //calculaValorLocacao() é invocado da Carga, e não do Veiculo
   }
}
