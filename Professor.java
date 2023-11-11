import java.util.Scanner;


public class Professor extends Pessoa {
	
	private int codigoDeFuncionario;
	private String turno;
	private double salario;

	public Professor(String nome,String telefone, String email, String cpf, int idade, int codigoDeFuncionario, String turno, Double salario) {
		super(nome,telefone, email, cpf, idade);
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
        Professor professor1 = new Professor("João Silva", "9991-6757", "paulo@email.com", "058.973.285-78", 30, 1, "Manhã", 2000.00);

        professor1.criarTreino("Treino de Pernas");

        System.out.println("Nome: " + professor1.getNome());
        System.out.println("Telefone: " + professor1.getTelefone());
        System.out.println("E-mail: " + professor1.getEmail());
        System.out.println("CPF: " + professor1.getCpf());
        System.out.println("Idade: " + professor1.getIdade());
        System.out.println("Codigo: " + professor1.getCodigoDeFuncionario());
        System.out.println("Turno: " + professor1.getTurno());
        System.out.println("Salario: " + professor1.getSalario());
    }

}
