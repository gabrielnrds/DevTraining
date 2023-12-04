import java.util.Scanner;


public class Professor extends Pessoa {
	
	private int codigoDeFuncionario;
	private String turno;
	private double salario;

	public Professor(String nome,int idade, int codigoDeFuncionario, String turno, Double salario) {
		super();
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
        System.out.print("Digite o treino: ");
        String treino1 = scanner.nextLine();
        System.out.println("Treino criado: " + treino1);
        scanner.close();
	}
	
	public static void main(String[] args) {
        Professor professor1 = new Professor("João Silva", 30, 1, "Manhã", 2000.0);

        // Criar treino
        professor1.criarTreino("Treino de Pernas");

        // Acessar atributos herdados da classe Pessoa
        System.out.println("Nome: " + professor1.getNome());
        System.out.println("Idade: " + professor1.getIdade());
    }

}
