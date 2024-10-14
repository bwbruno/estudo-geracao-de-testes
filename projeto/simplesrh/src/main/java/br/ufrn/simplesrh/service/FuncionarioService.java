package br.ufrn.simplesrh.service;

import java.util.List;
import java.util.Optional;

import br.ufrn.simplesrh.dao.FuncionarioDAO;
import br.ufrn.simplesrh.model.Funcionario;

public class FuncionarioService {
  private FuncionarioDAO funcionarioDAO;

    public FuncionarioService(FuncionarioDAO funcionarioDAO) {
        this.funcionarioDAO = funcionarioDAO;
    }

    public void adicionar(Funcionario funcionario) {
        funcionarioDAO.adicionar(funcionario);
        System.out.println("Funcionário adicionado: " + funcionario);
    }

    public void remover(String nome) {
        funcionarioDAO.remover(nome);
        System.out.println("Funcionário removido: " + nome);
    }

    public void listar() {
        List<Funcionario> funcionarios = funcionarioDAO.todos();

        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário encontrado.");
        } else {
            System.out.println("Lista de Funcionários:");
            for (Funcionario f : funcionarios) {
                System.out.println(f);
            }
        }
    }

    public List<Funcionario> todos() {
        return funcionarioDAO.todos();
    }

    public Optional<Funcionario> buscarPorNome(String nome) {
        return todos().stream()
                      .filter(f -> f.getNome().equalsIgnoreCase(nome))
                      .findFirst();
    }
}