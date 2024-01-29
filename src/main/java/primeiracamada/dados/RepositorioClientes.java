package primeiracamada.dados;

<<<<<<< HEAD:src/dados/RepositorioClientes.java
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import entidades.Cliente;
import entidades.Professor;
=======
import primeiracamada.entidades.Avaliacao;
import primeiracamada.entidades.Cliente;
>>>>>>> f02421abbcf261a3a7d80d7d9f074b078d9d6972:src/main/java/primeiracamada/dados/RepositorioClientes.java

public class RepositorioClientes {
    private Cliente[] clientes;
    private int proxima;
    private String arquivo = "clientes.txt";

    public RepositorioClientes(int tamanho) {
        this.clientes = new Cliente[tamanho];
        this.proxima = 0;
    }

    public void cadastrar(Cliente cliente) {
        if (existeClienteComCPF(cliente.getCpf())) {
            System.out.println("CPF já existe. Não é possível cadastrar o cliente.");
            return;
        }

        this.clientes[this.proxima] = cliente;
        this.proxima++;

        if (this.proxima == this.clientes.length) {
            this.duplicaArrayClientes();
            salvarDados();
        }
    }

    private boolean existeClienteComCPF(String cpf) {
        return buscar(cpf) != null;
    }

    private void duplicaArrayClientes() {
        if (this.clientes != null && this.clientes.length > 0) {
            Cliente[] arrayDuplicado = new Cliente[this.clientes.length * 2];
            System.arraycopy(this.clientes, 0, arrayDuplicado, 0, this.clientes.length);
            this.clientes = arrayDuplicado;
        }
    }

    public Cliente buscar(String cpf) {
        int i = 0;
        boolean achou = false;

        while ((!achou) && (i < this.proxima)) {
            if (cpf.equals(this.clientes[i].getCpf())) {
                achou = true;
            } else {
                i++;
            }
        }

        return achou ? this.clientes[i] : null;
    }

    public void remover(String cpf) {
        int i = 0;
        boolean achou = false;

        while ((!achou) && (i < this.proxima)) {
            if (cpf.equals(this.clientes[i].getCpf())) {
                achou = true;
            } else {
                i++;
            }
        }

        if (achou) {
            this.clientes[i] = this.clientes[this.proxima - 1];
            this.clientes[this.proxima - 1] = null;
            this.proxima--;

            salvarDados();
            System.out.println("Cliente " + cpf + " removido com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void alterar(String cpf, Cliente novoCliente) {
        int i = 0;
        boolean achou = false;

        while ((!achou) && (i < this.proxima)) {
            if (cpf.equals(this.clientes[i].getCpf())) {
                achou = true;
            } else {
                i++;
            }
        }

        if (achou) {
            this.clientes[i] = novoCliente;
            System.out.println("Cliente " + cpf + " alterado com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }

        salvarDados();
    }

    void salvarDados() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo), StandardCharsets.UTF_8))) {
            for (int i = 0; i < proxima; i++) {
                writer.write(clientes[i].toFormattedString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void carregarDados() {
        File file = new File(arquivo);

        if (!file.exists()) {
            System.out.println("Arquivo não encontrado. Criando um novo arquivo.");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                Cliente cliente = criarClienteAPartirDaLinha(linha, null);
                cadastrar(cliente);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Cliente criarClienteAPartirDaLinha(String linha, RepositorioProfessores repositorioProfessores) {
		try {
			// Adapte conforme o formato da sua classe Cliente
			String[] dados = linha.split("\\s+");
			if (dados.length >= 10) {
				String nome = dados[0].trim();
				String telefone = dados[1].trim();
				String email = dados[2].trim();
				String cpf = dados[3].trim();
				int idade = Integer.parseInt(dados[4].trim());
				String endereco = dados[5].trim();
				String treino = dados[6].trim();
				LocalDate dataMatricula = LocalDate.parse(dados[7].trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				int codigoProfessor = Integer.parseInt(dados[8].trim());
				boolean statusMatricula = Boolean.parseBoolean(dados[9].trim());
	
				// Obter o nome do professor do repositório
				Professor professor = repositorioProfessores.buscar(codigoProfessor);
				if (professor == null) {
					throw new IllegalArgumentException("Professor com código " + codigoProfessor + " não encontrado.");
				}
	
				return new Cliente(1, nome, telefone, email, cpf, endereco, idade, treino, dataMatricula, professor, statusMatricula);
			} else {
				throw new IllegalArgumentException("Formato de linha inválido: " + linha);
			}
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException | DateTimeParseException e) {
			throw new IllegalArgumentException("Erro ao converter dados da linha: " + linha, e);
		}
	}
	
}

