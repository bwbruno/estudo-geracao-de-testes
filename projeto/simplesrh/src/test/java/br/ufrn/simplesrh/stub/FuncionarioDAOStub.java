package br.ufrn.simplesrh.stub;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.simplesrh.dao.FuncionarioDAO;
import br.ufrn.simplesrh.model.Funcionario;

public class FuncionarioDAOStub implements FuncionarioDAO {

    private List<Funcionario> funcionarios;

    public FuncionarioDAOStub() {
        this.funcionarios = new ArrayList<>();
    }

    @Override
    public void adicionar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    @Override
    public void remover(String nome) {
        funcionarios.removeIf(funcionario -> funcionario.getNome().equals(nome));
    }

    @Override
    public List<Funcionario> todos() {
        return new ArrayList<>(funcionarios);
    }

    @Override
    public void carregarDeJSON(String arquivoJSON) {
        System.out.println("Carregando de JSON (simulado): " + arquivoJSON);
    }

    @Override
    public void salvarEmJSON(String arquivoJSON) {
        System.out.println("Salvando em JSON (simulado): " + arquivoJSON);
    }
}
