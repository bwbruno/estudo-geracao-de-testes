package br.ufrn.simplesrh;

import java.util.concurrent.Callable;

import br.ufrn.simplesrh.command.CalcularBonusCommand;
import br.ufrn.simplesrh.command.CalcularReajusteCommand;
import br.ufrn.simplesrh.command.ReajustarCommand;
import br.ufrn.simplesrh.dao.FuncionarioDAO;
import br.ufrn.simplesrh.dao.FuncionarioDAOImpl;
import br.ufrn.simplesrh.model.Funcionario;
import br.ufrn.simplesrh.service.FuncionarioService;
import br.ufrn.simplesrh.service.GestaoService;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "SimplesRH",
    description = "Sistema de RH simples para concessão de bônus e reajustes salariais",
    version = "SimplesRH versão alfa1.0.0",
    mixinStandardHelpOptions = true
)
public class SimplesRH implements Callable<Integer> {

    private FuncionarioService funcionarioService;

    @Option(names = {"-a", "--adicionar"}, description = "Adicionar um novo funcionário (formato: nome,cargo,salario,desempenho)", split = ",")
    private String[] adicionarFuncionario;

    @Option(names = {"-r", "--remover"}, description = "Remover um funcionário pelo nome")
    private String removeFuncionario;

    @Option(names = {"-l", "--listar"}, description = "Listar todos os funcionários")
    private boolean listarFuncionarios;

    @Option(names = {"-j", "--json"}, description = "Arquivo JSON para carregar funcionários")
    private static String fileJSON;

    public SimplesRH(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    public static void main(String[] args) { 
        FuncionarioDAO funcionarioDAO = new FuncionarioDAOImpl();
        FuncionarioService funcionarioService = new FuncionarioService(funcionarioDAO);
        GestaoService gestaoService = new GestaoService(funcionarioDAO);

        SimplesRH app = new SimplesRH(funcionarioService);
        CommandLine cmd = new CommandLine(app);
        cmd.addSubcommand(new CalcularBonusCommand(funcionarioService, gestaoService));
        cmd.addSubcommand(new CalcularReajusteCommand(funcionarioService, gestaoService));
        cmd.addSubcommand(new ReajustarCommand(gestaoService));

        try {
            cmd.parseArgs(args);
            funcionarioDAO.carregarDeJSON(fileJSON);
            int exitCode = cmd.execute(args);
            funcionarioDAO.salvarEmJSON(fileJSON);
            System.exit(exitCode);
        } catch (CommandLine.ParameterException e) {
            System.err.println("Erro de argumento: " + e.getMessage());
            System.out.println("Use --help para mais informações.");
            System.exit(1);
        } catch (CommandLine.ExecutionException e) {
            System.err.println("Erro durante a execução do comando: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    public Integer call() throws Exception {
        String acao = (listarFuncionarios) ? "listar" : 
                        (adicionarFuncionario != null && adicionarFuncionario.length == 3) ? "adicionar" : 
                        (removeFuncionario != null) ? "remover" : "invalido";

        switch (acao) {
            case "listar":
                funcionarioService.listar();
                break;

            case "adicionar":
                String nome = adicionarFuncionario[0];
                String cargo = adicionarFuncionario[1];
                double salario = Double.parseDouble(adicionarFuncionario[2]);
                int pontosDesempenho = Integer.parseInt(adicionarFuncionario[3]);
                Funcionario novoFuncionario = new Funcionario(nome, cargo, salario, pontosDesempenho);
                funcionarioService.adicionar(novoFuncionario);
                break;

            case "remover":
                funcionarioService.remover(removeFuncionario);
                break;

            default:
                System.out.println("Nenhuma ação válida foi fornecida. Use --help para mais informações.");
                return 1;
        }

        return 0;
    }
}
