import java.util.Date;
import java.util.List;

public class Trem {
    private String prefixo;
    private Date criacao;
    private List<Vagao> vagoes;
    private List<Locomotiva> locomotivas;
    private Estação origem;
    private Estação destino;

    public Trem(String prefixo, Date criacao, List<Vagao> vagoes, List<Locomotiva> locomotivas, Estação origem, Estação destino) {
        if (origem.equals(destino)) {
            System.out.println("A estação de origem e destino não podem ser iguais.");
        }
        if (vagoes.size() + locomotivas.size() > 150) {
        	System.out.println("Um trem não pode ter mais que 150 recursos.");
        }
        else {
        	this.prefixo = prefixo;
            this.criacao = criacao;
            this.vagoes = vagoes;
            this.locomotivas = locomotivas;
            this.origem = origem;
            this.destino = destino;
        }
    }

    public String getPrefixo() {
        return prefixo;
    }

    public Estação getOrigem() {
        return origem;
    }

    public Estação getDestino() {
        return destino;
    }

    public List<Locomotiva> getLocomotivas() {
        return locomotivas;
    }

    public List<Vagao> getVagoes() {
        return vagoes;
    }
}