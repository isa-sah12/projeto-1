package aulas.aula1508encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;
    
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("Valor invalido");
        }else{
            this.idade = idade;
        }
    }

}
