
abstract class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void fazerSom();
    
    public abstract void mover();

    public void exibirNome() {
        System.out.println("Nome do animal: " + nome);
    }
}