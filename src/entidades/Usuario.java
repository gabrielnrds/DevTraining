package entidades;

public class Usuario {

    private int idUsuario;//ainda sem uso..
    private String nomeUsuario;
    private String senha;

    public Usuario(int idUsuario, String nomeUsuario, String senha) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public void login() {
        System.out.println("Usuário logado: " + nomeUsuario);//coloquei, mas talvez seja inútil.1
    }

    public void deslogar() {
        System.out.println("Usuário deslogado: " + nomeUsuario);//coloquei, mas talvez seja inútil.2
    }

    public void alterarLogin(String novoNomeUsuario, String novaSenha) {
        this.nomeUsuario = novoNomeUsuario;
        this.senha = novaSenha;
        System.out.println("Login alterado para: " + nomeUsuario);//coloquei, mas talvez seja inútil.3
    }

    public Object getId_usuariosRepositorio() {
        return null;
    }
}