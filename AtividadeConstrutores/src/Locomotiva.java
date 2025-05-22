
public class Locomotiva {
	
    private int numSerie;
    private int tracao;
    private int comprimento;

    public Locomotiva(int numSerie, int tracao, int comprimento) {
        this.numSerie = numSerie;
        this.tracao = tracao;
        this.comprimento = comprimento;
    }

    public Locomotiva(int numSerie) {
        this(numSerie, 0, 0);
    }

    public int getNumSerie() {
        return numSerie;
    }
}