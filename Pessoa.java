public class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String telefone, String email, String cpf, int idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPrint() {
        return "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "E-mail: " + getEmail() + "\n" +
                "Idade: " + getIdade();
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Wendell",
                "81000000", "wendell@gmail.com",
                "000.000.000.00", 20);

        System.out.println(pessoa.getPrint());
    }
}
