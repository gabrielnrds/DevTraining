package dados;

import entidades.FichaTreino;

public class RepositorioTreinos {
    private FichaTreino[] fichasTreino;
    private int proximo;

    public RepositorioTreinos(int tamanho) {
        this.fichasTreino = new FichaTreino[tamanho];
        this.proximo = 0;
    }

    public void cadastrar(FichaTreino fichaTreino) {
        if (this.proximo < this.fichasTreino.length) {
            this.fichasTreino[this.proximo] = fichaTreino;
            this.proximo++;
            System.out.println("Ficha de treino cadastrada com sucesso.");
        } else {
            System.out.println("Não é possível cadastrar mais fichas. Repositório cheio.");
        }
    }

    public FichaTreino buscar(int idTreino) {
        for (int i = 0; i < this.proximo; i++) {
            if (idTreino == this.fichasTreino[i].getIdTreino()) {
                return this.fichasTreino[i];
            }
        }
        System.out.println("Ficha de treino não encontrada.");
        return null;
    }

    public void remover(int idTreino) {
        int indiceRemover = -1;
        for (int i = 0; i < this.proximo; i++) {
            if (idTreino == this.fichasTreino[i].getIdTreino()) {
                indiceRemover = i;
                break;
            }
        }

        if (indiceRemover != -1) {
            this.proximo--;
            this.fichasTreino[indiceRemover] = this.fichasTreino[this.proximo];
            this.fichasTreino[this.proximo] = null;
            System.out.println("Ficha de treino removida com sucesso.");
        } else {
            System.out.println("Ficha de treino não encontrada.");
        }
    }

    // Método alterar - Adicione a lógica necessária
    public void alterar(int idTreino, FichaTreino novaFichaTreino) {
        // Implemente a lógica para alterar o treino com o ID fornecido
    }
}
