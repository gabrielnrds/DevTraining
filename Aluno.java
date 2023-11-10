public class Aluno {

    private int matricula;
    private int idade;
    private float peso;
    private float altura;
    private String treino;

    public Aluno(int matricula, int idade, float peso, float altura, String treino){
        this.matricula = matricula;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.treino = treino;
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
}
