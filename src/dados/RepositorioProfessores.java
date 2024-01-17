package dados;

import entidades.Professor;
import entidades.Usuario;

public class RepositorioProfessores {
	private Professor[] professor;
	private int proxima;
	public RepositorioProfessores(int tamanho) {
		this.professor = new Professor[tamanho];
		this.proxima = 0;
	}
	
	public void cadastrar(Professor usuario) {
		this.professor[this.proxima] = usuario;
		this.proxima = this.proxima + 1;
	}
	
	
	public Professor buscar(String idUsuario) {
		int i = 0;
		boolean achou = false;
		while ((!achou) && (i < this.proxima)) {
			if (idUsuario.equals(this.professor[i].getId_professor())) {
				achou = true;
			} else {
				i = i + 1;
			}
		}
		Professor resultado = null;
		if (i != this.proxima) {
			resultado = this.professor[i];
		}
		return resultado;
	}
	/**
	 * @param idUsuario
	 */
	public void remover(int idUsuario) {
		int i = 0;
		boolean achou = false;
		while ((!achou) && (i < this.proxima)) {
			if (idUsuario.equals(this.professor[i].getId_professor())) {// mesmo problema do anterior
				achou = true;
			} else {
				i = i + 1;
			}
		}
		if (i != this.proxima) {
			this.professor[i] = this.professor[this.proxima - 1];
			this.professor[this.proxima - 1] = null;
			this.proxima = this.proxima - 1;
			System.out.println("Avaliação " + idUsuario + " removida com sucesso.");//editar
		} else {
			System.out.println("Avaliação não existe.");
		}
	}
}
// FAlta implementar o método alterar