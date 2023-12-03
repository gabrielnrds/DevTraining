public class UsuarioComum extends Usuario {

    private Cliente cliente;

    public UsuarioComum(int idUsuario, String nomeUsuario, String senha, Cliente cliente) {
        super(idUsuario, nomeUsuario, senha);
        this.cliente = cliente;
    }

    public void modificarTreino(String novoTreino) {
        cliente.setTreino(novoTreino);
        System.out.println("Treino modificado pra: " + novoTreino);
    }
}