package model;

import java.io.FileWriter;
import java.io.IOException;

public class PessoaDAO {
	
	// Não é necessário importar a classe Pessoa por ela estar no mesmo pacote que PessoaDAO.
    public void salvar(Pessoa p) {
        try (FileWriter writer = new FileWriter("pessoas.txt", true)) {
            writer.write(p.getNome() + "\n");
            writer.write("\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar pessoa: " + e.getMessage());
        }
    }
}
