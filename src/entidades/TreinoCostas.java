package entidades;

import java.util.Date; 



public class TreinoCostas extends FichaTreino {
    public TreinoCostas(int idTreino, Professor professor, Cliente cliente, Date dataCriacao, String tipoTreino) {
        super(idTreino, professor, cliente, dataCriacao, tipoTreino);
        
    }

    public static void executarTreino(String tipoTreino) {
        Professor professor1 = new Professor("Wendell", "874243252", "wendell.stronda@email.com", "515141414", 21, 78, "manhã", 98);
        Cliente cliente = new Cliente("Cliente Teste", "423423456", "cliente@email.com", "898444111-89", 32, "Rua robertinho", "treino", null, professor1, false);
        FichaTreino ficha = new FichaTreino(1, professor1, cliente, new Date(), tipoTreino);
            ficha.adicionaExercicio("Remada Unilateral com Halteres 3x8\n");
            ficha.adicionaExercicio("Puxada alta na polia 3x8\n");
            ficha.adicionaExercicio("Remada com barra 3x8\n");
            ficha.adicionaExercicio("Barra fixa 3x8\n");
            System.out.println("Detalhes do Treino:");
            System.out.println("ID do Treino: " + ficha.getIdTreino());
            System.out.println("Professor: " + ficha.getProfessor().getNome());
            System.out.println("Cliente: " + ficha.getCliente().getNome());
            System.out.println("Data de Criação: " + ficha.getDataCriacao());
            System.out.println("Tipo de Treino: " + ficha.getTipoTreino());
            System.out.println("Exercícios:");
            for (String exercicio : ficha.getExercicios()) {
                System.out.println(exercicio);
                System.out.println("BOM TREINO!");
    }
        }
                


}