package entidades;

import java.util.Date;

public class Cliente extends Pessoa {
//atributos dos clientes
    private String endereco;
    private String treino;
    private Date dataMatricula;
    private Professor professor;
    private boolean statusMatricula;
//construtores
    public Cliente(String nome, String telefone, String email, String cpf, int idade, 
    String endereco, String treino, Date dataMatricula, Professor professor, Boolean statusMatricula) {
        super(nome, telefone, email, cpf, idade);//chamamos a classe pessoa aqui
        this.endereco = endereco;
        this.treino = treino;
        this.dataMatricula = dataMatricula;
        this.professor = professor;
        this.statusMatricula = statusMatricula;
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

    public Boolean getStatusMatricula() {
        return statusMatricula;
    }
    public void setStatusMatricula(Boolean statusMatricula) {
        this.statusMatricula = statusMatricula;
    }
}