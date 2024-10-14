package br.ufrn.simplesrh.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Funcionario {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("cargo")
    private String cargo;

    @JsonProperty("salario")
    private double salario;

    @JsonProperty("dataAdmissao")
	private LocalDate dataAdmissao;

    @JsonProperty("pontosDesempenho")
	private int pontosDesempenho;

    public Funcionario() {}

    public Funcionario(String nome, String cargo, double salario, int pontosDesempenho) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = LocalDate.now();
    }

    public Funcionario(String nome, String cargo, double salario, LocalDate dataAdmissao, int pontosDesempenho) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.pontosDesempenho = pontosDesempenho;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Nome: " + nome + ", " + 
               "Cargo: " + cargo + ", " + 
               "Salário: " + salario + ", " + 
               "Admissao: " + dataAdmissao + ", " + 
               "Desempenho: " + pontosDesempenho;
    }

    public int getPontosDesempenho() {
        return pontosDesempenho;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }
}
