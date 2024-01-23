package controle;

import java.util.Date;  
import java.util.Scanner;

import entidades.FichaTreino;
import entidades.Professor;
import entidades.Cliente;

public class Main {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        int resp1 = 0;

        System.out.println("Olá! Bem-vindo ao DevTraining!");
        System.out.println("Digite '1' se você é aluno ou '2' se você é professor.");
        resp1 = resposta.nextInt();

        if (resp1 == 1) {
            System.out.println("Olá aluno!\n");
            System.out.println("Digite o tipo de treino que você deseja:");
            System.out.println("1 - Inferior");
            System.out.println("2 - Costas");
            System.out.println("3 - Peito");
            int TipoTreinoResposta1 = 0;
            Scanner TipoTreinoResposta = new Scanner(System.in);
            TipoTreinoResposta1 = TipoTreinoResposta.nextInt();

            if(TipoTreinoResposta1 == 1) {
                Professor professor1 = new Professor("Wendell", "874243252", "wendell.stronda@email.com", "515141414", 21, 78, "manhã", 98);
                Cliente cliente = new Cliente("Cliente Teste", "423423456", "cliente@email.com", "898444111-89", 97, "Rua robertinho", "treino", null, professor1, false);
                FichaTreino ficha = new FichaTreino(1, professor1, cliente, new Date(), "Inferior");

                ficha.adicionaExercicio("Agachamento 3x8\n");
                ficha.adicionaExercicio("Extensora 3x8\n");
                ficha.adicionaExercicio("Hack Articulado 3x8\n");
                ficha.adicionaExercicio("Mesa Flexora 3x8\n");

                System.out.println("Detalhes do Treino:");
                System.out.println("ID do Treino: " + ficha.getIdTreino());
                System.out.println("Professor: " + ficha.getProfessor().getNome());
                System.out.println("Cliente: " + ficha.getCliente().getNome());
                System.out.println("Data de Criação: " + ficha.getDataCriacao());
                System.out.println("Tipo de Treino: " + ficha.getTipoTreino());
                System.out.println("Exercícios:");
                for (String exercicio : ficha.getExercicios()) {
                    System.out.println(exercicio);
                }
                System.out.println("BOM TREINO!");

            } else if (TipoTreinoResposta1 == 2) {
                Professor professor1 = new Professor("Wendell", "874243252", "wendell.stronda@email.com", "515141414", 21, 78, "manhã", 98);
                Cliente cliente = new Cliente("Cliente Teste", "423423456", "cliente@email.com", "898444111-89", 97, "Rua robertinho", "treino", null, professor1, false);
                FichaTreino ficha = new FichaTreino(1, professor1, cliente, new Date(), "Costas");

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
                }
                System.out.println("BOM TREINO!");

            } else if (TipoTreinoResposta1 == 3) {
                Professor professor1 = new Professor("Wendell", "874243252", "wendell.stronda@email.com", "515141414", 21, 78, "manhã", 98);
                Cliente cliente = new Cliente("Cliente Teste", "423423456", "cliente@email.com", "898444111-89", 97, "Rua robertinho", "treino", null, professor1, false);
                FichaTreino ficha = new FichaTreino(1, professor1, cliente, new Date(), "Peito");

                ficha.adicionaExercicio("Supino reto 3x8\n");
                ficha.adicionaExercicio("Supino inclinado 3x8\n");
                ficha.adicionaExercicio("Crossover 3x8\n");
                ficha.adicionaExercicio("Voador 3x8\n");

                System.out.println("Detalhes do Treino:");
                System.out.println("ID do Treino: " + ficha.getIdTreino());
                System.out.println("Professor: " + ficha.getProfessor().getNome());
                System.out.println("Cliente: " + ficha.getCliente().getNome());
                System.out.println("Data de Criação: " + ficha.getDataCriacao());
                System.out.println("Tipo de Treino: " + ficha.getTipoTreino());
                System.out.println("Exercícios:");
                for (String exercicio : ficha.getExercicios()) {
                    System.out.println(exercicio);
                }
                System.out.println("BOM TREINO!");
            }

        } else if (resp1 == 2) {
            System.out.println("Olá professor!");
        
        } else {
            System.out.println("Opção inválida!");
        }
    }
}