package Questão4;

import java.io.IOException;

class Exceção {
	
	// Throws é usado para declarar que um método pode lançar uma exceção para quem o chamou tratar.
    public static void exceptionThrows() throws IOException {
    	// Throw é usado para lançar manualmente uma exceção.
        throw new IOException("Arquivo não reconhecido.");
    }

    public static void main(String[] args) {
    	// Try executa o bloco de código marcado entre { }
        try {
            exceptionThrows();
        }
        // Catch captura quaisquer exceções que possam ter ocorrido dentro do try e as trata (caso haja tratamento)
        catch (IOException e) {
            System.out.println("Exceção lançada pelo método: "+e.toString());
        }
        
        try {
        	// Exceção lançada manualmente fora de um método.
        	throw new IOException("Formato inválido.");
        } catch (IOException e) {
        	System.out.println("Exceção lançada fora do método: "+e.toString());
        }
    }
}
