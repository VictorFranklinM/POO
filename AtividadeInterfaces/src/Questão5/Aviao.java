package Questão5;

public class Aviao implements Motorizado, Conduzivel {

    @Override
    public void ligarMotor() {
        System.out.println("Motor do avião ligado.");
    }

    @Override
    public void abastecer(int numLitros) {
        System.out.println("Avião abastecido com " + numLitros + " litros.");
    }

    @Override
    public void curvar(float angulo) {
        System.out.println("Avião curvou " + angulo + " graus.");
    }
}