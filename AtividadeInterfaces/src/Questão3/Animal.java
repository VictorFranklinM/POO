package Questão3;

interface Animal {
    default void respirar() {
        System.out.println("Respirando...");
    }

    void emitirSom();
}