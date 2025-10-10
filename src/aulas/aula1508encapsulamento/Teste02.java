package aulas.aula1508encapsulamento;

public class Teste02 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setIdade(-1);
        p.setNome("Eliomar");

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());

    }
    
}
