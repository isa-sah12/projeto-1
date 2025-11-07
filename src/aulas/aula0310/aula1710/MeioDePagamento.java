package aulas.aula0310.aula1710;

public abstract class MeioDePagamento {
     protected double valor;

    public MeioDePagamento (double valor) {
        this.valor = valor;
    }
        public abstract boolean processarPagamento();

        public void exibirDetalhes () {
            System.out.printf("Valor da Transição: R$ %.2f\n", this.valor);
    }
}
