package Questão5;

public class Circulo extends ObjetoGeometrico {
	
    private double x, y, raio;

    public Circulo(double x, double raio) {
        super();
        this.x = x;
        this.raio = raio;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Círculo de centro "+x+" e raio "+raio);
    }

    @Override
    public double calcularArea() {
        return (Math.PI * raio * raio);
    }

    @Override
    public double calcularPerimetro() {
        return (2 * Math.PI * raio);
    }
}

