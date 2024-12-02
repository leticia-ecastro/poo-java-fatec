public class Aluguel {
    private Cliente cliente;
    private Midia midia;
    private boolean pago;

    public Aluguel(Cliente cliente, Midia midia) {
        this.cliente = cliente;
        this.midia = midia;
        this.pago = false;
    }

    // getters e setters

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public double calcularValor() {
        return midia.getValor();
    }

    public void exibirInformacoes() {
        System.out.println("Informações do Aluguel:");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Mídia: " + midia.getDescricao());
        System.out.println("Valor do aluguel: R$" + midia.getValor());
        System.out.println("Pago: " + (pago ? "Sim" : "Não"));
    }
}
