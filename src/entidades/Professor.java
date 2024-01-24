package entidades;

import java.util.Scanner;


public class Professor extends Pessoa {
	
	private int codigoDeFuncionario;
	private String turno;
	private double salario;

	public Professor(String nome, String telefone, String email,
	 String cpf, int idade, int codigoDeFuncionario, String turno, double salario) {
		super(nome, telefone, email, cpf, idade);
		this.codigoDeFuncionario = codigoDeFuncionario;
		this.turno = turno;
        this.salario = salario;
	}
	
	public int getCodigoDeFuncionario() {
		return codigoDeFuncionario;
	}

	public void setCodigoDeFuncionario(int codigoDeFuncionario) {
		this.codigoDeFuncionario = codigoDeFuncionario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void criarTreino(String treino) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o treino: ");//Funcionará no GUI
        String treino1 = scanner.nextLine();
        System.out.println("Treino criado: " + treino1);
        scanner.close();
	}
	
	public void print(String[] args) {
        Professor professor1 = new Professor("Wendell", "874243252", 
		"wendell.silva@email.com", "515141414",
		 21, 10, "manhã", 2.300);

        //criar treino
        professor1.criarTreino("Treino de Pernas");

        // acessar atributos herdados da classe Pessoa
        System.out.println("Nome: " + professor1.getNome());
        System.out.println("Idade: " + professor1.getIdade());
    }

    public Object getId_professor() {
        return null;
    }

    public Object getId_avaliacao() {
        return null;
    }

}