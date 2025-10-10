package aulas.aula0310;

import java.util.UUID;

public class Obra {
    private UUID id;
    private String titulo;
    private String isbn;
    private double valor;

    public Obra () {
    }

    public Obra(UUID id, String titulo, String isbn, double valor) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.valor = valor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean aplicarDesconto(double porcentagem){
        if (porcentagem > 0.5){
            return false; // sai da função e não continua
        }
        double desconto  = this.valor + porcentagem;
        this.valor -= desconto + this.valor;
        return true;
    }
    
}
