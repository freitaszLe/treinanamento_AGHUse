public class Paciente {
    private int id;
    private String nome;
    private int idade;
    private String cpf;

    public Paciente(int id, String nome, int idade, String cpf) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void exibirDados() {
        System.out.println("Paciente ID: " + id + " | Nome: " + nome + " | Idade: " + idade + " | CPF: " + cpf);
    }
}
