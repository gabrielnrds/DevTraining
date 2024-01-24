package dados;

import entidades.Professor;

public class RepositorioProfessores {
    private Professor[] professores;
    private int proxima;

    public RepositorioProfessores(int tamanho) {
        this.professores = new Professor[tamanho];
        this.proxima = 0;
    }

    // Método para cadastrar
    public void cadastrar(Professor professor) {
        this.professores[this.proxima] = professor;
        this.proxima++;
    }

    // Método para buscar
    public Professor buscar(int id_funcionario) {
        Integer idWrapper = Integer.valueOf(id_funcionario); // Convertendo para Integer

        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < this.proxima)) {
            Integer codigoFuncionarioWrapper = this.professores[i].getCodigoDeFuncionario();
            if (idWrapper.equals(codigoFuncionarioWrapper)) {
                achou = true;
            } else {
                i++;
            }
        }

        return achou ? this.professores[i] : null;
    }

    // Método para remover
    public void remover(int id_funcionario) {
        Integer idWrapper = Integer.valueOf(id_funcionario); // Convertendo para Integer

        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < this.proxima)) {
            Integer codigoFuncionarioWrapper = this.professores[i].getCodigoDeFuncionario();
            if (idWrapper.equals(codigoFuncionarioWrapper)) {
                achou = true;
            } else {
                i++;
            }
        }

        if (achou) {
            this.professores[i] = this.professores[this.proxima - 1];
            this.professores[this.proxima - 1] = null;
            this.proxima--;
            System.out.println("Professor " + id_funcionario + " removido com sucesso.");
        } else {
            System.out.println("Professor não encontrado.");
        }
    }

    // Método para alterar as informações de um professor
    public void alterar(int id_funcionario, Professor novoProfessor) {
        Integer idWrapper = Integer.valueOf(id_funcionario); // Convertendo para Integer

        int i = 0;
        boolean achou = false;

        // Procura o professor com o ID fornecido
        while ((!achou) && (i < this.proxima)) {
            Integer codigoFuncionarioWrapper = this.professores[i].getCodigoDeFuncionario();
            if (idWrapper.equals(codigoFuncionarioWrapper)) {
                achou = true;
            } else {
                i++;
            }
        }

        // Se encontrou o professor, realiza a alteração
        if (achou) {
            this.professores[i] = novoProfessor;
            System.out.println("Professor " + id_funcionario + " alterado com sucesso.");
        } else {
            System.out.println("Professor não encontrado.");
        }
    }
}
