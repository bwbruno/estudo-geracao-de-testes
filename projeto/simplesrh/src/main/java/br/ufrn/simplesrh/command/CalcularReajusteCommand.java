package br.ufrn.simplesrh.command;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;

import br.ufrn.simplesrh.model.Funcionario;
import br.ufrn.simplesrh.service.FuncionarioService;
import br.ufrn.simplesrh.service.GestaoService;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "calcular-reajuste", description = "Calcula resjuste de salário para um ou todos os funcionários")
public class CalcularReajusteCommand implements Callable<Integer> {

    private final FuncionarioService funcionarioService;
    private final GestaoService gestaoService;

    public CalcularReajusteCommand(FuncionarioService funcionarioService, GestaoService gestaoService) {
        this.funcionarioService = funcionarioService;
        this.gestaoService = gestaoService;
    }

    @Option(names = {"-p", "--percentual"}, description = "Percentual de reajuste (positivo ou negativo)", required = true)
    private double percentualReajuste;

    @Option(names = {"-t", "--todos"}, description = "Calcular reajuste salarial para todos os funcionários")
    private boolean calcularParaTodos;

    @Option(names = {"-n", "--nome"}, description = "Nome do funcionário para calcular o reajuste salarial (opcional)")
    private String nomeFuncionario;

    @Override
    public Integer call() throws Exception {
        // Se nem --nome nem --todos forem passados, calcular para todos
        if (nomeFuncionario == null && !calcularParaTodos) {
            calcularParaTodos = true;  // Definir a opção como true se nenhum nome for passado
        }

        // Se a opção --todos estiver definida ou --nome não for passado, calcular para todos
        if (calcularParaTodos) {
            List<Funcionario> funcionarios = funcionarioService.todos();
            for (Funcionario funcionario : funcionarios) {
                double reajuste = gestaoService.calcularReajusteSalarial(funcionario, percentualReajuste);
                System.out.printf("O reajuste salarial de %s é: %.2f%n", funcionario.getNome(), reajuste);
            }
        } else if (nomeFuncionario != null) {
            Optional<Funcionario> funcionarioOptional = funcionarioService.buscarPorNome(nomeFuncionario);
            if (funcionarioOptional.isPresent()) {
                Funcionario funcionario = funcionarioOptional.get();
                double reajuste = gestaoService.calcularReajusteSalarial(funcionario, percentualReajuste);
                System.out.printf("O reajuste salarial de %s é: %.2f%n", funcionario.getNome(), reajuste);
            } else {
                System.out.println("Funcionário não encontrado.");
            }
        } else {
            System.out.println("Nenhum funcionário especificado e --todos não foi usado. Nenhuma ação foi realizada.");
        }
        return 0;
    }
}
