import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistema Hospitalar ===");
            System.out.println("1 - Cadastrar Paciente");
            System.out.println("2 - Cadastrar Médico");
            System.out.println("3 - Agendar Consulta");
            System.out.println("4 - Listar Pacientes");
            System.out.println("5 - Listar Médicos");
            System.out.println("6 - Listar Consultas");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("\nID do Paciente: ");
                    int idPaciente = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome do Paciente: ");
                    String nomePaciente = scanner.nextLine();

                    System.out.print("Idade do Paciente: ");
                    int idadePaciente = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("CPF do Paciente: ");
                    String cpfPaciente = scanner.nextLine();

                    Paciente novoPaciente = new Paciente(idPaciente, nomePaciente, idadePaciente, cpfPaciente);
                    hospital.cadastrarPaciente(novoPaciente);
                    System.out.println("✅ Paciente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("\nID do Médico: ");
                    int idMedico = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome do Médico: ");
                    String nomeMedico = scanner.nextLine();

                    System.out.print("Especialidade: ");
                    String especialidade = scanner.nextLine();

                    System.out.print("CRM do Médico: ");
                    String crm = scanner.nextLine();

                    Medico novoMedico = new Medico(idMedico, nomeMedico, especialidade, crm);
                    hospital.cadastrarMedico(novoMedico);
                    System.out.println("✅ Médico cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.print("\nID da Consulta: ");
                    int idConsulta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("CPF do Paciente: ");
                    String cpfConsulta = scanner.nextLine();
                    Paciente pacienteConsulta = hospital.buscarPacientePorCpf(cpfConsulta);

                    if (pacienteConsulta == null) {
                        System.out.println("❌ Paciente não encontrado!");
                        break;
                    }

                    System.out.print("CRM do Médico: ");
                    String crmConsulta = scanner.nextLine();
                    Medico medicoConsulta = hospital.buscarMedicoPorCrm(crmConsulta);

                    if (medicoConsulta == null) {
                        System.out.println("❌ Médico não encontrado!");
                        break;
                    }

                    System.out.print("Data e Hora (YYYY-MM-DD HH:MM): ");
                    String dataHora = scanner.nextLine();

                    Consulta novaConsulta = new Consulta(idConsulta, pacienteConsulta, medicoConsulta, dataHora);
                    hospital.agendarConsulta(novaConsulta);
                    System.out.println("✅ Consulta agendada com sucesso!");
                    break;

                case 4:
                    hospital.listarPacientes();
                    break;

                case 5:
                    hospital.listarMedicos();
                    break;

                case 6:
                    hospital.listarConsultas();
                    break;

                case 7:
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Opção inválida! Tente novamente.");
            }
        }
    }
}
