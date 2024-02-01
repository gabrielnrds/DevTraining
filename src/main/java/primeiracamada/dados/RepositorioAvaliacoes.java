package main.java.primeiracamada.dados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

import main.java.primeiracamada.entidades.Avaliacao;
import main.java.primeiracamada.entidades.Cliente;
import main.java.primeiracamada.entidades.Medidas;
import main.java.primeiracamada.entidades.Professor;

public class RepositorioAvaliacoes {
    private Avaliacao[] avaliacoes;
    private int proxima;
    private String arquivo = "avaliacoes.txt";

    public RepositorioAvaliacoes(int tamanho) {
        this.avaliacoes = new Avaliacao[tamanho];
        this.proxima = 0;
    }

    // Método para cadastrar uma avaliação
    public void cadastrar(Avaliacao avaliacao) {
        this.avaliacoes[this.proxima] = avaliacao;
        this.proxima++;

        if (this.proxima == this.avaliacoes.length) {
            this.duplicaArrayAvaliacoes();
        }
        salvarDados();
    }

    // Método para buscar uma avaliação pelo ID (a implementação do método depende da estrutura da sua classe Avaliacao)
    public Avaliacao procurar(String id_avaliacao) {
        int i = 0;
        while (i < this.proxima) {
            String idAvaliacaoWrapper = String.valueOf(this.avaliacoes[i].getId_avaliacao());
            if (id_avaliacao.equals(idAvaliacaoWrapper)) {
                return this.avaliacoes[i];
            }
            i++;
        }
        return null;
    }

    // Método para remover uma avaliação pelo ID (a implementação do método depende da estrutura da sua classe Avaliacao)
    public void remover(String id_avaliacao) {
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < this.proxima)) {
            String idAvaliacaoWrapper = String.valueOf(this.avaliacoes[i].getId_avaliacao());
            if (id_avaliacao.equals(idAvaliacaoWrapper)) {
                achou = true;
            } else {
                i++;
            }
        }

        if (achou) {
            this.avaliacoes[i] = this.avaliacoes[this.proxima - 1];
            this.avaliacoes[this.proxima - 1] = null;
            this.proxima--;
            salvarDados();
            System.out.println("Avaliação " + id_avaliacao + " removida com sucesso.");
        } else {
            System.out.println("Avaliação não encontrada.");
        }
    }

    // Método para salvar os dados no arquivo
    public void salvarDados() {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(arquivo), StandardCharsets.UTF_8))) {

            for (int i = 0; i < proxima; i++) {
                writer.write(avaliacoes[i].toFormattedString());
                writer.newLine();
            }

            System.out.println("Dados salvos com sucesso.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para carregar os dados do arquivo
    public void carregarDados() {
        File file = new File(arquivo);

        if (!file.exists()) {
            System.out.println("Arquivo não encontrado. Não há dados para carregar.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {

            String linha;
            while ((linha = reader.readLine()) != null) {
                Avaliacao avaliacao = criarAvaliacaoAPartirDaLinha(linha);
                cadastrar(avaliacao);
            }

            System.out.println("Dados carregados com sucesso.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para duplicar o array de avaliações
    private void duplicaArrayAvaliacoes() {
        if (this.avaliacoes != null && this.avaliacoes.length > 0) {
            Avaliacao[] arrayDuplicado = new Avaliacao[this.avaliacoes.length * 2];
            System.arraycopy(this.avaliacoes, 0, arrayDuplicado, 0, this.avaliacoes.length);
            this.avaliacoes = arrayDuplicado;
        }
    }

    private Avaliacao criarAvaliacaoAPartirDaLinha(String linha) {
		try {
			String[] dados = linha.split(";"); // Use ponto e vírgula como separador
			if (dados.length >= 7) {
				int idAvaliacao = Integer.parseInt(dados[0].trim());
				long idProfessor = Long.parseLong(dados[1].trim());
				long idCliente = Long.parseLong(dados[2].trim());
				LocalDateTime dataHora = LocalDateTime.parse(dados[3].trim()); // Certifique-se de ajustar o formato conforme necessário
				String objetivo = dados[4].trim();
	
				// Dados de Medidas
				double altura = Double.parseDouble(dados[5].trim());
				double peso = Double.parseDouble(dados[6].trim());
				Medidas medidas = new Medidas(altura, peso, peso, peso, peso, peso, peso, peso, peso, peso, peso); // Certifique-se de ter um construtor adequado em Medidas
	
				// Dados de IMC
				double imc = Double.parseDouble(dados[7].trim());
	
				// Obtenha instâncias de Professor e Cliente usando seus repositórios, não sei fazer, problema com long algo assim
				Professor professor = RepositorioProfessores.procurar(idProfessor);
				Cliente cliente = RepositorioClientes.procurar(idCliente);
	
				if (professor != null && cliente != null) {
					return new Avaliacao(professor, cliente, objetivo, medidas);
				} else {
					throw new IllegalArgumentException("Professor ou Cliente não encontrado para a Avaliação: " + idAvaliacao);
				}
			} else {
				throw new IllegalArgumentException("Formato de linha inválido: " + linha);
			}
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException | DateTimeParseException e) {
			throw new IllegalArgumentException("Erro ao converter dados da linha: " + linha, e);
		}
	}
	


}
