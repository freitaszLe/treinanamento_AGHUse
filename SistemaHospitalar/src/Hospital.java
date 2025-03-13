import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();
    private List<Consulta> consultas = new ArrayList<>();

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agendarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void listarPacientes() {
        System.out.println("\n--- Pacientes Cadastrados ---");
        for (Paciente p : pacientes) {
            p.exibirDados();
        }
    }

    public void listarMedicos() {
        System.out.println("\n--- Médicos Cadastrados ---");
        for (Medico m : medicos) {
            m.exibirDados();
        }
    }

    public void listarConsultas() {
        System.out.println("\n--- Consultas Agendadas ---");
        for (Consulta c : consultas) {
            c.exibirDetalhes();
        }
    }

    public Paciente buscarPacientePorCpf(String cpf) {
        for (Paciente p : pacientes) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }

    public Medico buscarMedicoPorCrm(String crm) {
        for (Medico m : medicos) {
            if (m.getCrm().equals(crm)) {
                return m;
            }
        }
        return null;
    }
}
