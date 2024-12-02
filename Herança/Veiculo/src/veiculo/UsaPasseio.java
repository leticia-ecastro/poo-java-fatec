
package veiculo;

public class UsaPasseio {
    public static void main (String[] args) {
       Passeio passeio = new Passeio(); //invoca o método construtor Passeio
       
       passeio.setPlaca("abc-1234");
       passeio.setMarca("VW");
       passeio.setKmFinal(10);
       passeio.setValorKmRodado(10);

       System.out.println("\n\n" + passeio);
       //calculaValorLocacao() é invocado do Veiculo
    }
}
