package dados;

import entidades.Professor;

public class MainTeste {

    public static void main(String[] args) {
        // Criação do repositório com tamanho 10
        RepositorioProfessores repositorio = new RepositorioProfessores(10);

        // Cadastrando alguns professores
        Professor professor1 = new Professor("Wendell Stronda", "874243252", "wendell.stronda@email.com", "515141414", 21, 78, "manhã", 98);
        Professor professor2 = new Professor("Outro Professor", "987654321", "outro.professor@email.com", "123456789", 30, 79, "tarde", 1200);

        repositorio.cadastrar(professor1);
        repositorio.cadastrar(professor2);

        // Testando o método buscar
        System.out.println("Teste do método buscar:");
        int idBusca = 79;
        Professor professorEncontrado = repositorio.buscar(idBusca);

        if (professorEncontrado != null) {
            System.out.println("Professor encontrado: " + professorEncontrado.getNome());
            System.out.println("Turno: " + professorEncontrado.getTurno());
            System.out.println("Salário: " + professorEncontrado.getSalario());
        } else {
            System.out.println("Professor não encontrado.");
        }
    }
}
