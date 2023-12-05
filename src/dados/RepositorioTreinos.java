package dados;

import entidades.Cliente;
import entidades.FichaTreino;

public class RepositorioTreinos {
    private Cliente[] clientesRepositorio;
    private int proximo;
    public RepositorioTreinos(int tamanho){
        this.treino = new Cliente[tamanho];
        this.proximo = 0;
    }
    public void cadastrar(FichaTreino c) {
		this.FichaTreino[this.proxima] = c;
		this.proxima = this.proxima + 1;
	}
    public void buscar(int FichaTreino) {
		int i = 0;
		boolean achou = false;
		while ((!achou) && (i < this.proxima)) {
			if (FichaTreino.equals(this.treino[i].getId())) {
				achou = true;
			} else {
				i = i + 1;
			}
		}
		Cliente resultado = null;
		if (i != this.proxima) {
			resultado = this.treino[i];
		}
		return resultado;
	}
    public void remover(int id_treino) {
		int i = 0;
		boolean achou = false;
		while ((!achou) && (i < this.proxima)) {
			if (id_treino.equals(this.treino[i].getId())) {
				achou = true;
			} else {
				i = i + 1;
			}
		}
		if (i != this.proxima) {
			this.treino[i] = this.treino[this.proxima - 1];
			this.treino[this.proxima - 1] = null;
			this.treino = this.proxima - 1;
			System.out.println("Treino " + id_treino + " removido com sucesso.");
		} else {
			System.out.println("Treino não existe.");
		}
}
}