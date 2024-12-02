
package veiculo;

public class Veiculo {

    private String placa, marca;
    private double modelo;
    private int ano;
    
    protected double valorKmRodado;
    protected int kmInicial, kmFinal;
    //Permite que as classes herdeiras visualizem esses atributos
    
    public Veiculo () {
        kmInicial = 1000;
    }
    
    public void setPlaca (String placa) {
        this.placa = placa;
    }
    
    public void setMarca (String marca) {
        this.marca = marca;
    }
    
    public void setModelo (double modelo) {
        this.modelo = modelo;
    }
    
    public void setValorKmRodado (double valorKmRodado) {
        this.valorKmRodado = valorKmRodado;
    }
    
    public void setAno (int ano) {
        this.ano = ano;
    }
    
    public void setKmInicial (int kmInicial) {
        this.kmInicial = kmInicial;
    }
    
    public void setKmFinal (int kmFinal) {
        this.kmFinal = kmFinal;
    }
    
    public String getPlaca () {
        return placa;
    }
    
    public String getMarca () {
        return marca;
    }
    
    public double getModelo () {
        return modelo;
    }
    
    public int getAno () {
        return ano;
    }
    
    public double getValorKmRodado () {
        return valorKmRodado;
    }
    
    public int getKmInicial () {
        return kmInicial;
    }
    
    public int getKmFinal () {
        return kmFinal;
    }
    
    public double calculaValorLocacao() {
        return (getKmFinal() - getKmInicial()) * getValorKmRodado();
    }
    
    @Override
    public String toString() {
        return "Placa: " + placa + "\nMarca: " + marca + 
                "\nValor Km: " + valorKmRodado + "\nKm Inicial: " + kmInicial + 
                "\nKm Final: " + kmFinal + "\nValor total: " + calculaValorLocacao();
    }
}
