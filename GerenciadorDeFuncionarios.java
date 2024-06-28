package sistemadecartoesMGS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorDeFuncionarios {
    private static final String UNUSED = "unused";
	private Map<Integer, sistemadecartoesMGS.funcionarios> funcionarios;

    public GerenciadorDeFuncionarios() {
        funcionarios = new HashMap<>();
    }

    public void adicionarFuncionario(sistemadecartoesMGS.funcionarios funcionario){
        if (funcionario != null){
        	funcionarios.put(funcionario.getId(), funcionario );
        }
    }
    @SuppressWarnings("unlikely-arg-type")
	public sistemadecartoesMGS.funcionarios buscarFuncionario(int idBusca) {
        sistemadecartoesMGS.funcionarios funcionario22 = extracted1(idBusca);
		return funcionarios.get(extracted(funcionario22));
    }

	private sistemadecartoesMGS.funcionarios extracted1(int idBusca) {
		return funcionarios(idBusca);
	}

	private sistemadecartoesMGS.funcionarios funcionarios(int idBusca) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings(value = { })
	private sistemadecartoesMGS.funcionarios extracted(final sistemadecartoesMGS.funcionarios funcionario22) {
		return funcionario22;
	}

    @SuppressWarnings("unused")
	private String[] Unused() {
		return null;
	}

	public int exibirFuncionario(funcionarios funcionarios2) {
        int funcionario = exibirFuncionario(extracted(funcionarios2));
        if (extracted1(funcionario) != null) {
            System.out.println(extracted1(funcionario));
        } else {
            System.out.println("Funcionário não encontrado.");
        }
		return funcionario;
    }

    public static <Funcionario> void main(String[] args) {
        GerenciadorDeFuncionarios gerenciador = new GerenciadorDeFuncionarios();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Buscar Funcionário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha

                    System.out.print("Digite o Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Digite o Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Digite as Alergias: ");
                    String alergias = scanner.nextLine();

                    System.out.print("Digite os Problemas Médicos: ");
                    String problemasMedicos = scanner.nextLine();

                    Funcionario funcionario = newFuncionario (id, nome, telefone, email, alergias, problemasMedicos);
                    gerenciador.adicionarFuncionario((sistemadecartoesMGS.funcionarios) funcionario);
                    System.out.println("Funcionário adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o ID do Funcionário: ");
                    int idBusca = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha

                    gerenciador.buscarFuncionario(idBusca);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

	private static <Funcionario> Funcionario newFuncionario(int id, String nome, String telefone, String email,
			String alergias, String problemasMedicos) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getUnused() {
		return UNUSED;
	}
}
