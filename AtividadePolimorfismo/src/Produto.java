
public class Produto {
    private String nome;
    private String descricao;
    private double preco;

    public Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
    	return nome;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }

    public String getDescricao() {
    	return descricao;
    }
    public void setDescricao(String descricao) {
    	this.descricao = descricao;
    }

    public double getPreco() {
    	return preco;
    }
    public void setPreco(double preco) {
    	this.preco = preco;
    }

    public boolean equals(Object o) {
        if(o instanceof Produto) {
        	Produto p = (Produto) o;
        	return nome.equals(p.nome) && descricao.equals(p.descricao) && preco == p.preco;
        }
        else {
        	return false;
        }
    }

    public String toString() {
        return "Produto: <"+this.nome+">, <"+this.descricao+">, <"+this.preco+">";
    }
}
