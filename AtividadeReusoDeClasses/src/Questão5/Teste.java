package Questão5;

public class Teste {
    public static void main(String[] args) {
    	
        ObjetoGeometrico[] objetos = new ObjetoGeometrico[3];
        
        objetos[0] = new Circulo(0, 5);
        objetos[1] = new Retangulo(4, 6);
        objetos[2] = new Triangulo(3, 4, 5);
        
        System.out.println("");

        for (int i = 0; i < objetos.length; i++) {
        	
            objetos[i].mostrarDados();
            System.out.println("Área: " + objetos[i].calcularArea());
            System.out.println("Perímetro: " + objetos[i].calcularPerimetro());
            System.out.println();
        }
    }
}