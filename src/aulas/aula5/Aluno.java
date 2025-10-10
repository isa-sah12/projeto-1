package aulas.aula5;

//classe DNA
//Objetivo: Definir a etrutura
public class Aluno {

    public int id;
    public String nome;
    public String matricula;
    public int idade;

    public Aluno(int id, String nome, String matricula, int idade) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    //declarando explicitamente o método contrutor vazio
    // alem de criar objeto, executa o código contido no bloco
    public Aluno(){
        System.out.println("chamou o construtor vazio");
    }

    public Aluno (String nome){
        this.nome = nome;
    }

    //assinatura
    //proteção + retorno + nome + parâmetros
    public void imprimirDados(){
        System.out.println("ID:" + id);
        System.out.println("Nome:" + nome);
        System.out.println("Matricula:" + matricula);
        System.out.println("Idade:" + idade);
    }

    // sobrecarga de métodos = repetição da mesma assinatura
    // mudando somente o parâmetro
    public void imprimirDados(int ordem){
        System.out.println("Aluno: " + ordem);
       imprimirDados();
    }
}
