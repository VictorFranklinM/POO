package Questão5;

public class Triangulo extends ObjetoGeometrico {
	
    private double a, b, c;

    public Triangulo(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Triângulo com lados "+a+", "+b+", "+c);
    }

    @Override
    public double calcularPerimetro() {
        return (a+b+c);
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}