package entidades;

import java.util.Map;

public class Administrador extends Usuario {//tenho que mexer em muita coisa aqui ainda.

    private Map<String, Cliente> clientes;

    public Administrador(int idUsuario, String nomeUsuario, String senha) {
        super(idUsuario, nomeUsuario, senha);
        //this.clientes = new HashMap<>(); ainda tenho que saber oq fazer aqui pra rodar..
    }

    //public void cadastrarCliente(Cliente cliente) {
     //   clientes.put(cliente.getNome(), cliente);
      //  System.out.println("Cliente cadastrado: " + cliente.getNome());
   // }

    public void deletarCliente(String nomeCliente) {
        if (clientes.containsKey(nomeCliente)) {
            clientes.remove(nomeCliente);
            System.out.println("Cliente deletado: " + nomeCliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}