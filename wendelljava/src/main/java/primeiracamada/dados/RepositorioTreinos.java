package primeiracamada.dados;

import primeiracamada.entidades.Cliente;
import primeiracamada.entidades.Avaliacao;

public class RepositorioTreinos {
    private static final FichaTreino[] FichaTreino = null;
	private Cliente[] clientesRepositorio;
    private int proximo;
	private Cliente[] treino;
	private Object proxima;
    public RepositorioTreinos(int tamanho){
        this.treino = new Cliente[tamanho];
        this.proximo = 0;
    }
    public void cadastrar(FichaTreino c) {
		this.FichaTreino[this.proxima] = c;
		this.proxima = this.proxima + 1;
	}
    /**
     * @param id_treino
     */
    public void buscar(int id_treino) {
		int i = 0;
		boolean achou = false;
		while ((!achou) && (i < this.proxima)) {
			if (id_treino.equals(this.clientesRepositorio[i].getId())) {
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
//// FAlta implementar o método alterar, refazer lógica