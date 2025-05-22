import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Ferrovia f1 = new Ferrovia(1, 5000, "Linha Principal");

        Estação Origem = new Estação(List.of(f1), "EST1", "Estação Inicial");
        Estação Destino = new Estação(List.of(f1), "EST2", "Estação Final");

        f1.adicionarEstacao(Origem);
        f1.adicionarEstacao(Destino);

        Locomotiva l1 = new Locomotiva(1001, 5000, 20);

        Vagao v1 = new Vagao(2001, "Carga", 30000, 10, 2);
        Vagao v2 = new Vagao(2002, "Carga", 32000, 10, 2);
        Vagao v3 = new Vagao(2003, "Carga", 28000, 10, 2);

        List<Vagao> vagoes = Arrays.asList(v1, v2, v3);
        List<Locomotiva> locomotivas = Arrays.asList(l1);

        Trem t1 = new Trem("NAG1010", new Date(), vagoes, locomotivas, Origem, Destino);

        f1.adicionarTrem(t1);

        System.out.println("Trem " + t1.getPrefixo() + " criado.");
        System.out.println("Origem: " + t1.getOrigem().getSigla() + " -> Destino: " + t1.getDestino().getSigla());
        System.out.println("Locomotivas no trem:");
        for (Locomotiva l : t1.getLocomotivas()) {
            System.out.println("- Locomotiva Nº Série: " + l.getNumSerie());
        }
        System.out.println("Vagões no trem:");
        for (Vagao v : t1.getVagoes()) {
            System.out.println("- Vagão Nº Série: " + v.getNumSerie());
        }
    }
}
