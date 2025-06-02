
class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("O cachorro late!");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro corre.");
    }
}