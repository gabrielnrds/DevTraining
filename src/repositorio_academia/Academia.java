package repositorio_academia;

import java.time.LocalDateTime;

public class Academia {
	private String local;
	private LocalDateTime horario;
	
	public Academia(String local, LocalDateTime horario) {
		setLocal(local);
		setHorario(horario);
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	public String getLocal() {
		return this.local;
	}
	
	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}
	
	public LocalDateTime getHorario() {
		return this.horario;
	}
	
	public void matricular() {
		//Esse método será responsável instanciar um objeto da classe aluno/professor.
	}
	
	public void excluir() {
		//Esse método ira excluir um registro da classe aluno/professor.
	}
	
	public boolean verificar(Aluno aluno) {
		/*Aqui será feita a verificação do status de um objeto de tipo aluno/professor,
		  tendo duas possibilidades: Ativo(True) ou Inativo(False). 
		*/
		return aluno.ativo;
	}
	
}
