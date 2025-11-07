package aulas.aula0310.aula1710;

import java.util.UUID;

public class Pix extends MeioDePagamento{
    private String chaveAleatoria;

    public Pix(double valor) {
        super(valor);
        this.chaveAleatoria = UUID.randomUUID().toString();
    }

    @Override
    public boolean processarPagamento() {
        System.out.println("\nProcesando Pagamento");
        super.exibirDetalhes();
        System.out.println("Chave Aleatória: " + this.chaveAleatoria);
        
        return true;
    }
    
}
