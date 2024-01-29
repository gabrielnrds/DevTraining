package main.java.primeiracamada.dados;

import main.java.primeiracamada.entidades.Professor;

public class TesteRepositorioProfessores {

    public static void main(String[] args) {
        // Criar uma instância do RepositorioProfessores
        RepositorioProfessores repositorio = new RepositorioProfessores(5);

        // Criar alguns professores para teste
        Professor professor1 = new Professor(1, "João", "123456", "joao@email.com", "123.456.789-00", "5000.00", 30, "Manhã", 5000.00);
        Professor professor2 = new Professor(2, "Maria", "987654", "maria@email.com", "987.654.321-00", "6000.00", 35, "Tarde", 6000.00);
        Professor professor3 = new Professor(3, "Carlos", "111222", "carlos@email.com", "111.222.333-00", "7000.00", 40, "Noite", 7000.00);

        // Cadastrar professores
        repositorio.cadastrar(professor1);
        repositorio.cadastrar(professor2);
        repositorio.cadastrar(professor3);

        // Exibir lista de professores
        System.out.println("Lista de Professores:");
        

        // Buscar um professor pelo ID
        long idBusca = 2;
        Professor professorEncontrado = repositorio.buscar(idBusca);
        if (professorEncontrado != null) {
            System.out.println("Professor encontrado com o ID " + idBusca + ": " + professorEncontrado);
        } else {
            System.out.println("Professor não encontrado com o ID: " + idBusca);
        }

        // Remover um professor
        long idRemover = 1;
        repositorio.remover(idRemover);
        System.out.println("Lista de Professores após remoção: ");
        

        // Alterar informações de um professor
        long idAlterar = 3;
        Professor novoProfessor = new Professor(3, "Carlos Atualizado", "999888", "carlos_atualizado@email.com", "111.222.333-00", "8000.00", 45, "Noite", 8000.00);
        repositorio.alterar(idAlterar, novoProfessor);
        System.out.println("Lista de Professores após alteração: ");
        
    }
}
