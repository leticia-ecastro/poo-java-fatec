import java.util.ArrayList;
import java.util.List;

public class Floresta {
    private List<Planta> plantas;

    public Floresta() {
        plantas = new ArrayList<>();
    }

    public void cadastrarPlanta(Planta planta) {
        plantas.add(planta);
    }

    public void listarPlantas() {
        System.out.println("Lista de plantas na floresta:");
        for (Planta planta : plantas) {
            System.out.print(planta.getNome() + " - " + planta.getTipo());

            if (planta instanceof Arvore) {
                Arvore arvore = (Arvore) planta;
                System.out.print(", Frutífera: " + (arvore.isFrutifera() ? "Sim" : "Não"));
            } else if (planta instanceof Flor) {
                Flor flor = (Flor) planta;
                System.out.print(", Cor: " + flor.getCor());
            } else if (planta instanceof Carnivora) {
                Carnivora carnivora = (Carnivora) planta;
                System.out.print(", Venenosa: " + (carnivora.isVenenosa() ? "Sim" : "Não"));
            }

            System.out.println();
        }
    }

    public int getQuantidadeTotalPlantas() {
        return plantas.size();
    }

    public int getQuantidadePlantasPorTipo(String tipo) {
        int quantidade = 0;
        for (Planta planta : plantas) {
            if (planta.getTipo().equals(tipo)) {
                quantidade++;
            }
        }
        return quantidade;
    }
}
