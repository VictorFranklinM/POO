package Questão3;

public class Teste {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.respirar();  a1.emitirSom();
        a2.respirar();  a2.emitirSom();
    }
}