package controller;

import model.Pessoa;
import model.PessoaDAO;

public class CtrlPessoa {

    public void salvar(Pessoa p) {
        if (p.getNome() == null || p.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome deve ser diferente de nulo ou vazio.");
        }
        PessoaDAO dao = new PessoaDAO();
        dao.salvar(p);
    }
}
