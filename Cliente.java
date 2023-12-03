import java.util.Date;

public class Cliente extends Pessoa {
//atributos dos clientes
    private String endereco;
    private String treino;
    private Date dataMatricula;
    private Professor professor;
    private String statusMatricula;
//construtores
    public Cliente(String nome, int idade, String endereco, String treino, Date dataMatricula, Professor professor, String statusMatricula) {
        super();//chamamos a classe pessoa aqui
        this.endereco = endereco;
        this.treino = treino;
        this.dataMatricula = dataMatricula;
        this.professor = professor;
        this.statusMatricula = statusMatricula;
    }

    public Cliente(String clienteTeste, int idade, int i) {
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTreino() {
        return treino;
    }

    public void setTreino(String treino) {
        this.treino = treino;
    }

    public Date getDataMatricula() {//pegamos a data atual do procedimento feito com horário e tudo
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getStatusMatricula() {
        return statusMatricula;
    }
    public void setStatusMatricula(String statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public static void main(String[] args) {
        Professor professor = new Professor("teste", 20, 01,
                "Tarde", 1000.0);

        Cliente cliente = new Cliente("Cliente Teste", 25, "Rua UFRPE, 31231",
                "Treino de Pernas",
                new Date(), professor, "Ativa");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Treino: " + cliente.getTreino());
        System.out.println("Data de Matrícula: " + cliente.getDataMatricula());
        System.out.println("Professor: " + cliente.getProfessor().getNome());
        System.out.println("Status de Matrícula: " + cliente.getStatusMatricula());
    }
}