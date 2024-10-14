package br.ufrn.simplesrh.command;

import java.util.concurrent.Callable;

import br.ufrn.simplesrh.service.GestaoService;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "reajustar-salarios", description = "Reajusta o salário de funcionários por cargo")
public class ReajustarCommand implements Callable<Integer> {

    private final GestaoService gestaoService;

    public ReajustarCommand(GestaoService gestaoService) {
        this.gestaoService = gestaoService;
    }

    @Option(names = {"-c", "--cargo"}, description = "Cargo dos funcionários para aplicar o reajuste", required = true)
    private String cargo;

    @Option(names = {"-p", "--percentual"}, description = "Percentual de reajuste (positivo)", required = true)
    private double percentualReajuste;

    @Override
    public Integer call() throws Exception {
        gestaoService.reajustarSalarioPorCargo(cargo, percentualReajuste);
        return 0;
    }
}
