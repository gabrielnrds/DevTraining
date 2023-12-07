package dados;

import entidades.Professor;
import entidades.Usuario;

public class RepositorioUsuarios {
    private Usuario[] usuariosRepositorio;
    private int proxima;
	public RepositorioUsuarios(int tamanho) {
		this.usuarios = new Usuario[tamanho];
		this.proxima = 0;
	}
	
	public void cadastrar(Usuario usuario) {
		this.usuariosRepositorio[this.proxima] = usuario;
		this.proxima = this.proxima + 1;
	}
	
	
	public Professor buscar(int idUsuario) {//talvez seja String e não do tipo int
		int i = 0;
		boolean achou = false;
		while ((!achou) && (i < this.proxima)) {
			if (idUsuario.equals(this.usuariosRepositorio[i].getId_usuariosRepositorio())) {
				achou = true;
			} else {
				i = i + 1;
			}
		}
		Usuario resultado = null;
		if (i != this.proxima) {
			resultado = this.usuarios[i];
		}
		return resultado;
	}
	public void remover(int idUsuario) {
		int i = 0;
		boolean achou = false;
		while ((!achou) && (i < this.proxima)) {
			if (idUsuario.equals(this.usuariosRepositorio[i].getId_usuariosRepositorio())) {// mesmo problema do anterior
				achou = true;
			} else {
				i = i + 1;
			}
		}
		if (i != this.proxima) {
			this.usuariosRepositorio[i] = this.usuariosRepositorio[this.proxima - 1];
			this.usuariosRepositorio[this.proxima - 1] = null;
			this.proxima = this.proxima - 1;
			System.out.println("Avaliação " + idUsuario + " removida com sucesso.");//editar
		} else {
			System.out.println("Avaliação não existe.");
		}
	}
}
// FAlta implementar o método alterar


