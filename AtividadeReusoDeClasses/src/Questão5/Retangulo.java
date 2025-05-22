package Questão5;

public class Retangulo extends ObjetoGeometrico {
	
    private double l1, l2;

    public Retangulo(double l1, double l2) {
        super();
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Retângulo de lados "+l1+" e "+l2);
    }

    @Override
    public double calcularArea() {
        return (l1 * l2);
    }

    @Override
    public double calcularPerimetro() {
        return (2 * (l1 + l2));
    }
}