package Questão5;

public class Carro implements Motorizado, Conduzivel {

    @Override
    public void ligarMotor() {
        System.out.println("Motor do carro ligado.");
    }

    @Override
    public void abastecer(int numLitros) {
        System.out.println("Carro abastecido com " + numLitros + " litros.");
    }

    @Override
    public void curvar(float angulo) {
        System.out.println("Carro curvou " + angulo + " graus.");
    }
}