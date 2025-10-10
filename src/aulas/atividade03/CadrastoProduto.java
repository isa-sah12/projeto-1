package aulas.atividade03;

public class CadrastoProduto {
    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        p1.id = 258647;
        p1.nome = "Caneta";
        p1.descricao = "azul";
        p1.codigoBarras = "84746644";
        p1.valor = 1.50;

        Produto p2 = new Produto(647889, "lápis", "gráfite", "7644878", 1.0);
        Produto p3 = new Produto(7746567, "Borracha", "rosa", "7484366", 0.5);

        p1.imprimirDados();
        p2.imprimirDados();
        p3.imprimirDados();
        
    }
}
