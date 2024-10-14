package br.ufrn.simplesrh.dao;

import java.util.List;

import br.ufrn.simplesrh.model.Funcionario;

public interface FuncionarioDAO {
    void adicionar(Funcionario funcionario);
    void remover(String nome);
    List<Funcionario> todos();
    void carregarDeJSON(String arquivoJSON);
    void salvarEmJSON(String arquivoJSON);
}
