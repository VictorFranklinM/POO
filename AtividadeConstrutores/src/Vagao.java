
public class Vagao {
	
    private int numSerie;
    private String tipo;
    private int cargaKg;
    private int compTesteiras;
    private int compEngate;

    public Vagao(int numSerie, String tipo, int cargaKg, int compTesteiras, int compEngate) {
        this.numSerie = numSerie;
        this.tipo = tipo;
        this.cargaKg = cargaKg;
        this.compTesteiras = compTesteiras;
        this.compEngate = compEngate;
    }

    public Vagao(int numSerie, String tipo) {
        this(numSerie, tipo, 0, 0, 0);
    }

    public int getNumSerie() {
        return numSerie;
    }
}