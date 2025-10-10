package aulas.aula5;

public class App {
    public static void main(String[] args) {
        //invocando os métodos construtores
        //para criação dos objetos
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.id = 10;
        aluno1.nome = "Isabela";
        aluno1.matricula = "202310070025";
        aluno1.idade = 18;

        aluno2.id = 11;
        aluno2.nome = "Sabrina"; 
        aluno2.matricula = "202310070022";
        aluno2.idade = 17;

        aluno3.id = 12;
        aluno3.nome = "Maria";
        aluno3.matricula = "202310070024";
        aluno3.idade = 16;

        Aluno aluno4 = aluno3;
        Aluno aluno5 = aluno3;

       //imprimir dados
       aluno1.imprimirDados(1);
       aluno2.imprimirDados(2);
       aluno3.imprimirDados(3);
    }
    
}
