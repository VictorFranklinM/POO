
public class Teste {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex");
        Animal passaro = new Passaro("PiuPiu");

        cachorro.exibirNome();
        cachorro.fazerSom();
        cachorro.mover();

        System.out.println();

        passaro.exibirNome();
        passaro.fazerSom();
        passaro.mover();
    }
}