package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FichaTreino {

    private int idTreino;
    private Professor professor;
    private Cliente cliente;
    private Date dataCriacao;
    private List<String> exercicios;
    private String tipoTreino;

    public FichaTreino(int idTreino, Professor professor, Cliente cliente, Date dataCriacao, String tipoTreino) {
        this.idTreino = idTreino;
        this.professor = professor;
        this.cliente = cliente;
        this.dataCriacao = dataCriacao;
        this.exercicios = new ArrayList<>();
        this.tipoTreino = tipoTreino;
    }
    public int getIdTreino() {
        return idTreino;
    }
    public Professor getProfessor() {
        return professor;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Date getDataCriacao() {
        return dataCriacao;
    }
    public List<String> getExercicios() {
        return exercicios;
    }
    public String getTipoTreino() {
        return tipoTreino;
    }
    public void adicionaExercicio(String exercicio) {
        this.exercicios.add(exercicio);
        //método pra adicionar um exercício na lista de exercícios
    }
    public void alteraExercicio(int indice, String novoExercicio) {
        if (indice >= 0 && indice < exercicios.size()) {
            this.exercicios.set(indice, novoExercicio);
        } else {
            System.out.println("XXXXXXXX");//dar ideias pra oq colocar aqui
        }
    }
    public void removeExercicio(int indice) {
        if (indice >= 0 && indice < exercicios.size()) {
            this.exercicios.remove(indice);
        } else {
            System.out.println("XXXXXXXXXXXXX");//dar ideias pra oq colocar aqui
        }
    }

    public static void main(String[] args) {
    	Professor professor1 = new Professor("Wendell Stronda", "874243252", "wendell.stronda@email.com", "515141414", 21, 78, "manhã", 98);
        Cliente cliente = new Cliente("Cliente Teste", "423423456", "cliente@email.com", "898444111-89", 97, "Rua robertinho", "treino", null, professor1, false);
        FichaTreino ficha = new FichaTreino(1, professor1, cliente, new Date(), "Perna");
        ficha.adicionaExercicio("Agachamento");//aqui a gente adiciona
                                              // os exercicios na ficha de treino
        ficha.adicionaExercicio("EXTENSORA BRABISSIMA");//.

        System.out.println("ID do Treino: " + ficha.getIdTreino());
        System.out.println("Professor: " + ficha.getProfessor().getNome());
        System.out.println("Cliente: " + ficha.getCliente().getNome());
        System.out.println("Data de Criação: " + ficha.getDataCriacao());
        System.out.println("Tipo de Treino: " + ficha.getTipoTreino());
        System.out.println("Exercícios: " + ficha.getExercicios());
        ficha.alteraExercicio(0, "Agachamento Livre");//altera o exercicio na ficha
        ficha.removeExercicio(1);//remove o exercicio

        System.out.println("Exercícios dps da alteração ou remoção: "
                + ficha.getExercicios());  //a gente vai atualizando isso no decorrer do código..
    }
}