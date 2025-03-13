public class Medico {
    private int id;
    private String nome;
    private String especialidade;
    private String crm;

    public Medico(int id, String nome, String especialidade, String crm) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void exibirDados() {
        System.out.println("Médico ID: " + id + " | Nome: " + nome + " | Especialidade: " + especialidade + " | CRM: " + crm);
    }
}
