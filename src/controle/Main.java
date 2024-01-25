package controle;

import java.util.Scanner;

import entidades.FichaTreino;


public class Main {
    public static void main(String[] args) {
        try (Scanner resposta = new Scanner(System.in)) {
            int resp1;

            System.out.println("Olá! Bem-vindo ao DevTraining!");
            System.out.println("Digite '1' se você é aluno ou '2' se você é professor.");
            resp1 = resposta.nextInt();

            if (resp1 == 1) {
                System.out.println("Olá aluno!");
                System.out.println("Digite o tipo de treino que você deseja:");
                System.out.println("1 - Inferior");
                System.out.println("2 - Costas");
                System.out.println("3 - Peito");

                int tipoTreinoResposta = resposta.nextInt();

                if (tipoTreinoResposta == 1) {
                    FichaTreino.executarTreinoInferior("Inferior");
                } else if (tipoTreinoResposta == 2) {
                    FichaTreino.executarTreinoCostas("Costas");
                } else if (tipoTreinoResposta == 3) {
                    FichaTreino.executarTreinoPeito("Peito");
                } else {
                    System.out.println("Opção inválida!");
                }
            } else if (resp1 == 2) {
                System.out.println("Olá professor!");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}