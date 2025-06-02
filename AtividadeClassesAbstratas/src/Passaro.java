
class Passaro extends Animal {
    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("O pássaro canta!");
    }

    @Override
    public void mover() {
        System.out.println("O pássaro voa.");
    }
}