package br.ufrn.simplesrh.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.ufrn.simplesrh.dao.FuncionarioDAO;
import br.ufrn.simplesrh.model.Funcionario;
import br.ufrn.simplesrh.stub.FuncionarioDAOStub;

public class FuncionarioServiceTest {

    @Test
    public void testAdicionarFuncionario() {
        FuncionarioDAO daoStub = new FuncionarioDAOStub();
        FuncionarioService service = new FuncionarioService(daoStub);

        // Adiciona um funcionário
        Funcionario funcionario = new Funcionario("Maria", "Desenvolvedora", 2000, 0);
        service.adicionar(funcionario);

        // Verifica se o funcionário foi adicionado
        List<Funcionario> lista = daoStub.todos();
        Assert.assertEquals("Deveria haver 1 funcionário na lista.", 1, lista.size());
        Assert.assertEquals("O nome do funcionário deveria ser Maria.", "Maria", lista.get(0).getNome());
    }

    @Test
    public void testRemoverFuncionario() {
        FuncionarioDAO daoStub = new FuncionarioDAOStub();
        FuncionarioService service = new FuncionarioService(daoStub);

        // Adiciona dois funcionários
        Funcionario funcionario1 = new Funcionario("Maria", "Desenvolvedora", 2000, 0);
        Funcionario funcionario2 = new Funcionario("Joaquina", "Desenvolvedora", 2000, 0);
        service.adicionar(funcionario1);
        service.adicionar(funcionario2);

        // Remove um funcionário pelo nome
        service.remover("Joaquina");

        // Verifica se o funcionário foi removido
        List<Funcionario> lista = daoStub.todos();
        Assert.assertEquals("Deveria haver apenas 1 funcionário após remoção.", 1, lista.size());
        Assert.assertEquals("O funcionário restante deveria ser Maria.", "Maria", lista.get(0).getNome());
    }

    @Test
    public void testListarFuncionarios() {
        FuncionarioDAO daoStub = new FuncionarioDAOStub();
        FuncionarioService service = new FuncionarioService(daoStub);

        // Adiciona três funcionários
        Funcionario funcionario1 = new Funcionario("Maria", "Desenvolvedora", 2000, 0);
        Funcionario funcionario2 = new Funcionario("Joaquina", "Desenvolvedora", 2000, 0);
        Funcionario funcionario3 = new Funcionario("Mario", "Desenvolvedor", 2000, 0);
        service.adicionar(funcionario1);
        service.adicionar(funcionario2);
        service.adicionar(funcionario3);

        // Verifica se todos os funcionários foram listados corretamente
        List<Funcionario> lista = daoStub.todos();
        Assert.assertEquals("Deveria haver 3 funcionários na lista.", 3, lista.size());
    }
}