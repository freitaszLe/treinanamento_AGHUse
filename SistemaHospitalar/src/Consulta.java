public class Consulta {
    private int id;
    private Paciente paciente;
    private Medico medico;
    private String dataHora;

    public Consulta(int id, Paciente paciente, Medico medico, String dataHora) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
    }

    public void exibirDetalhes() {
        System.out.println("Consulta ID: " + id);
        System.out.println("Paciente: " + paciente.getCpf());
        System.out.println("Médico: " + medico.getCrm());
        System.out.println("Data e Hora: " + dataHora);
    }
}
