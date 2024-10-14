package br.ufrn.simplesrh.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import br.ufrn.simplesrh.model.Funcionario;

public class FuncionarioDAOImpl implements FuncionarioDAO {

    private List<Funcionario> funcionarios;
    private ObjectMapper objectMapper = new ObjectMapper();

    public FuncionarioDAOImpl() {
        this.funcionarios = new ArrayList<>();
        objectMapper.registerModule(new JavaTimeModule());
    }

    @Override
    public void adicionar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    @Override
    public void remover(String nome) {
        funcionarios.removeIf(f -> f.getNome().equalsIgnoreCase(nome));
    }

    @Override
    public List<Funcionario> todos() {
        return funcionarios;
    }

    @Override
    public void carregarDeJSON(String arquivoJSON) {

        try {
            funcionarios = objectMapper.readValue(new File(arquivoJSON), new TypeReference<List<Funcionario>>() {});
            System.out.println("Funcionários carregados do arquivo JSON.");
        } catch (IOException e) {
            System.err.println("Erro ao carregar o arquivo JSON: " + e.getMessage());
        }
    }

    @Override
    public void salvarEmJSON(String arquivoJSON) {
        try {
            objectMapper.writerWithDefaultPrettyPrinter()
                        .writeValue(new File(arquivoJSON), funcionarios);

            System.out.println("Funcionários salvos no arquivo JSON.");

        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo JSON: " + e.getMessage());
        }
    }
}
