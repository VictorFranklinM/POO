package Questão5;

public class Bicicleta implements Conduzivel {

    @Override
    public void curvar(float angulo) {
        System.out.println("Bicicleta curvou " + angulo + " graus.");
    }
}
