import java.util.List;

public class Estação {
	
    private List<Ferrovia> linhas;
    private String sigla;
    private String descricao;

    public Estação(List<Ferrovia> linhas, String sigla, String descricao) {
        this.linhas = linhas;
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }
}