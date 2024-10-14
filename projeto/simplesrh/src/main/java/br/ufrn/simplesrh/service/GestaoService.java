package br.ufrn.simplesrh.service;

import br.ufrn.simplesrh.dao.FuncionarioDAO;
import br.ufrn.simplesrh.model.Funcionario;

import java.time.LocalDate;
import java.time.Period;

public class GestaoService {

    private FuncionarioDAO funcionarioDAO;

    public GestaoService(FuncionarioDAO funcionarioDAO) {
        this.funcionarioDAO = funcionarioDAO;
    }

    public double calcularBonusPorDesempenho(Funcionario funcionario) {
        double salario = funcionario.getSalario();
        int pontosDesempenho = funcionario.getPontosDesempenho();
        
        // Critérios de bônus baseados no desempenho
        double bonusPercentual = 0;
        if (pontosDesempenho >= 0 && pontosDesempenho <= 49) {
            bonusPercentual = 0.05; // 5% do salário
        } else if (pontosDesempenho >= 50 && pontosDesempenho <= 69) {
            bonusPercentual = 0.10; // 10% do salário
        } else if (pontosDesempenho >= 70 && pontosDesempenho <= 89) {
            bonusPercentual = 0.15; // 15% do salário
        } else if (pontosDesempenho >= 90 && pontosDesempenho < 100) {
            bonusPercentual = 0.20; // 20% do salário
        } else {
            System.out.println("Pontuação de desempenho inválida. A pontuação deve ser entre 0 e 100.");
        }

        return salario * bonusPercentual;
    }

    public double calcularReajusteSalarial(Funcionario funcionario, double percentual) {
        double salarioAtual = funcionario.getSalario();
        double reajuste = salarioAtual * (percentual / 100);
        return  salarioAtual + reajuste;
    }

    public void reajustarSalarioPorCargo(String cargo, double percentualReajuste) {
        LocalDate dataAtual = LocalDate.now();

        for (Funcionario funcionario : funcionarioDAO.todos()) {
            if (funcionario.getCargo().equalsIgnoreCase(cargo)) {

                Period periodoTrabalho = Period.between(funcionario.getDataAdmissao(), dataAtual);

                if (periodoTrabalho.getYears() >= 1) {
                    double salarioAtual = funcionario.getSalario();
                    double novoSalario = salarioAtual + (salarioAtual * (percentualReajuste / 100));
                    funcionario.setSalario(novoSalario);
                    System.out.printf("O salário de %s (%s) foi reajustado para: %.2f%n", 
                                      funcionario.getNome(), funcionario.getCargo(), novoSalario);
                } else {
                    System.out.printf("O funcionário %s (%s) tem menos de um ano de empresa. Nenhum reajuste aplicado.%n", 
                                      funcionario.getNome(), funcionario.getCargo());
                }
            }
        }
    }
}
