package aulas.aula1508encapsulamento;

import java.awt.Color;
import java.time.LocalDateTime;

public class Teste {
    public static void main(String[] args) {
        // so posso atribuir valores a atributos 
        //quando instancio o objeto
        Pessoa p = new Pessoa();
       // P.nome = "Eliomar";

        // com exceção de atributos
        //ou métodos estáticos
       // Pessoa.nome = "Marcos";
        
       // System.out.println("Nome: " + p.nome);
        //System.out.println("Nome: " + Pessoa.nome );
    }
}
