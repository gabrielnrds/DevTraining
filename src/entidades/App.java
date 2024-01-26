package entidades;
import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		var professor = new Professor(2L, "Wendell Stronda", "874243252", 
        		"wendell.stronda@email.com", "515141414","rua blabla", 21, "manhã", 98);
		LocalDate dataMatricula = LocalDate.now();
		var cliente = new Cliente(1L, "Paulo", "(81)99991-6758", "paulomigueldasilva@hotmail.com", "058983294-70", 
				"rua vicente adolfo da silva, 2000", 39, "peito e ombro", dataMatricula , professor, true);

		System.out.println(cliente.getId());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getEmail());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getEndereco());
		System.out.println(cliente.getIdade());
		System.out.println(cliente.getTreino());
		System.out.println(cliente.getDataMatricula());
		System.out.println(cliente.getProfessor());
		System.out.println(cliente.getStatusMatricula());
	}

}
