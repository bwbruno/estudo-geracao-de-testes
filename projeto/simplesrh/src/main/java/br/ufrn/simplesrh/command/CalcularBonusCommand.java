package br.ufrn.simplesrh.command;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;

import br.ufrn.simplesrh.model.Funcionario;
import br.ufrn.simplesrh.service.FuncionarioService;
import br.ufrn.simplesrh.service.GestaoService;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "calcular-bonus", description = "Calcula bônus para um ou todos os funcionários")
public class CalcularBonusCommand implements Callable<Integer> {

    private final FuncionarioService funcionarioService;
    private final GestaoService gestaoService;

    public CalcularBonusCommand(FuncionarioService funcionarioService, GestaoService gestaoService) {
        this.funcionarioService = funcionarioService;
        this.gestaoService = gestaoService;
    }

    @Option(names = {"-t", "--todos"}, description = "Calcular bônus para todos os funcionários")
    private boolean calcularParaTodos;

    @Option(names = {"-n", "--nome"}, description = "Nome do funcionário para calcular o bônus (opcional)")
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
                double bonus = gestaoService.calcularBonusPorDesempenho(funcionario);
                System.out.printf("O bônus de %s é: %.2f%n", funcionario.getNome(), bonus);
            }
        } else if (nomeFuncionario != null) {
            Optional<Funcionario> funcionarioOptional = funcionarioService.buscarPorNome(nomeFuncionario);
            if (funcionarioOptional.isPresent()) {
                Funcionario funcionario = funcionarioOptional.get();
                double bonus = gestaoService.calcularBonusPorDesempenho(funcionario);
                System.out.printf("O bônus de %s é: %.2f%n", funcionario.getNome(), bonus);
            } else {
                System.out.println("Funcionário não encontrado.");
            }
        } else {
            System.out.println("Nenhum funcionário especificado e --todos não foi usado. Nenhuma ação foi realizada.");
        }
        return 0;
    }
}
