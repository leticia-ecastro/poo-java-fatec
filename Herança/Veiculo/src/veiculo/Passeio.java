
package veiculo;

public class Passeio extends Veiculo { //1º) Carga herda todas as características de Veiculo
    
    private boolean arCondicionado;
    private int portas;
    
    public Passeio () {
        super(); //2º) invoca o método construtor da superclasse Veiculo()
        
        arCondicionado = false;
        portas = 2;
    }
    
    public void setArCondicionado (boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
    
    public void setPortas (int portas) {
        this.portas = portas;
    }
    
    public boolean hasArCondicionado () {
        return arCondicionado;
    }
    
    public int getPortas () {
        return portas;
    }
    
    //O método calculaValorLocacao() já é adicionado na subclasse Passeio() porque ele herda tudo da superclasse Veiculo() {
}
