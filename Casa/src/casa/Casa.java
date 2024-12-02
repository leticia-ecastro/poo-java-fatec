
package casa;

public class Casa {
    private boolean porta1, porta2, porta3;
    private String corCasa;
    
    public Casa() {
        porta1 = porta2 = porta3 = false;
        corCasa = "branca";
    }
    //true = aberta;  false = fechada
    public boolean setPorta1 (boolean porta1) {
        if (this.porta1 != porta1) { //se this.porta1 = fechado, porta1 = aberto, ou vice-versa
            this.porta1 = porta1;
            return true; //muda estado
        }
        return false; //não muda o estado
    }
    
    public boolean setPorta2 (boolean porta2) {
        if (this.porta2 != porta2) { //se this.porta2 = fechado, porta2 = aberto, ou vice-versa
            this.porta2 = porta2;
            return true; //muda estado
        }
        return false; //não muda o estado
    }
    
    public boolean setPorta3 (boolean porta3) {
        if (this.porta3 != porta3) { //se this.porta3 = fechado, porta3 = aberto, ou vice-versa
            this.porta3 = porta3;
            return true; //muda estado
        }
        return false; //não muda o estado
    }

    public boolean setCorCasa(String corCasa) {
        if ( (corCasa.equalsIgnoreCase("branca") ||  
                corCasa.equalsIgnoreCase("azul") || 
                corCasa.equalsIgnoreCase("vermelha")) && 
                (!this.corCasa.equalsIgnoreCase(corCasa)) ) { //se a cor não for igual a cor atual
                this.corCasa = corCasa; //consigo pintar
                return true;
            }
        return false;
    }

    public boolean isPorta1() {
        return porta1;
    }

    public boolean isPorta2() {
        return porta2;
    }

    public boolean isPorta3() {
        return porta3;
    }

    public String getCorCasa() {
        return corCasa;
    }
    
    //Abrir Porta
    public boolean abrirPorta(int porta) {
        return manipularPorta(porta, true);
    }
    
    //Fechar Porta
    public boolean fecharPorta(int porta) {
        return manipularPorta(porta, false);
    }
    
    //Abrir porta (true) ou Fechar porta (false)
    private boolean manipularPorta(int porta, boolean acao) {
        switch (porta) {
            case 1:
                return setPorta1(acao);
            case 2:
                return setPorta2(acao);
            case 3:
                return setPorta3(acao);
            default: //se a porta for inválida
                return false;
        }
    }
    
    //Pintar
    public boolean pintarCasa (String corCasa) {
        return setCorCasa(corCasa);
    }
    
    //Quantas portas estão abertas?
    public int quantasPortasEstaoAbertas() { //true = aberta
        return (porta1 ? 1 : 0) + (porta2 ? 1 : 0) + (porta3 ? 1 : 0);
    }
            
    @Override
    public String toString() {
        return "";
    }
}
