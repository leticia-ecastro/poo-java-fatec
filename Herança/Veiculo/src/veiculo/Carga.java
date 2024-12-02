
package veiculo;

public class Carga extends Veiculo { //1º) Carga herda todas as características de Veiculo
    private int capacidade;
    
    public Carga () {
        super(); //2º) invoca o método construtor da superclasse Veiculo()
        
        capacidade = 15;
    }
    
    public void setCapacidade (int capacidade) {
        this.capacidade = capacidade;
    }
    
    public int getCapacidade () {
        return capacidade;
    }
    
    //Para acessar os atributos privados da superclasse Veiculo:
    public double calculaValorLocacao() {
        //1ª FORMA POSSÍVEL: (Usando os métodos get das variáveis na superclasse Veiculos)
        //return (getKmFinal() - getKmInicial()) * getValorKmRodado();
        
        
        /*
        2ª FORMA: (Usando "protected" nas variáveis kmFinal, kmInicial e valorKmRodado na superclasse Veiculo()
        return (kmFinal - kmInicial) * valorKmRodado;
        */
        
        //3ª FORMA: (Chamando o método da superclasse e acrescentando os 10% n cálculo)
        return super.calculaValorLocacao() * 1.1;
    }
}
