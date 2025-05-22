import java.util.ArrayList;
import java.util.List;

public class Ferrovia {
	
    private int numero;
    private int extensao;
    private String descricao;
    private List<Estação> estações = new ArrayList<>();
    private List<Vagao> vagoes = new ArrayList<>();
    private List<Locomotiva> locomotivas = new ArrayList<>();
    private List<Trem> trens = new ArrayList<>();

    public Ferrovia(int numero, int extensao, String descricao) {
        this.numero = numero;
        this.extensao = extensao;
        this.descricao = descricao;
    }

    public void adicionarEstacao(Estação estacao) {
        estações.add(estacao);
    }

    public void adicionarTrem(Trem trem) {
        trens.add(trem);
    }
}