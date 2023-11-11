package repositorio_academia;

public class Aluno extends Pessoa{
	private int idade;
    private int matricula;
    private float peso;
    private float altura;
    private String treino;
    protected boolean ativo;

    public Aluno(String nome, String telefone, String email, String cpf, int idade, int matricula, float peso, float altura, String treino){
    	super(nome, telefone, email, cpf, idade);
        this.matricula = matricula;
        this.peso = peso;
        this.altura = altura;
        this.treino = treino;
        this.ativo = true;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public float getPeso(){
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setTreino(String treino) {
        this.treino = treino;
    }

    public String getTreino() {
        return treino;
    }

    // falta implementar esse metodo public void imprimiFicha(){

    }
