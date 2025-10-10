package aulas.aula0310;

import java.util.UUID;

public class Teste {
    public static void main(String[] args) {
        //VANTAGENS / POSSIBILIDADES DA HERANÇA//

        // obstracao??
        // nao é possível instanciar uma classe abstrata
        // Obra obra = new Obra();

        //Polimorfismo
          //possibilica generalização, ou seja, compatibilidade entre filhos e a mãe
        //Obra obraEbook = new Ebook();// tem desvantagem na hora de pegar (Cadê a marca dágua)
        //Obra obraLivro = new Livro();

        Ebook ebook = new Ebook();
        ebook.setId(UUID.randomUUID());
        ebook.setIsbn("445678");
        ebook.setTitulo("Triunfo do nerds");
        ebook.setUrlMarcaDagua("https:\\localho:8080\f");
        ebook.setValor(45);

        Livro livro = new Livro();
        livro.setId(UUID.randomUUID());
        livro.setIsbn("2345698");
        livro.setTitulo("Senhor dos aneis");
        livro.setTiragem(1000);
        livro.setValor(45);

        venderObra(ebook);
        venderObra(livro);
    }

    public static void venderObra(Obra obra){// estatico(fixo e parado) para nao precisar criar objeto(único e dinâmico)
        System.out.println("ID: " + obra.getId());
        System.out.println("Titulo =" + obra.getTitulo());
        System.out.println("Valor inicial: " + obra.getValor());

        System.out.println("aplicando desconto...");
        boolean resultado = obra.aplicarDesconto(0.3);
        if (resultado) {
            System.out.println("Desconto aplicado");
        }else{
            System.out.println("Não foi possível aplicar desconto");
        }
        System.out.println("Valor atualizado" + obra.getValor());

        if (obra instanceof Livro){
            System.out.println("Vendendo Livro...");
            Livro livroTemp = (Livro) obra;
            System.out.println("Tiragem" + livroTemp.getTiragem());
        }else if (obra instanceof Ebook){
            System.out.println("Vendendo Ebook...");
            Ebook ebookTemp = (Ebook) obra;
            System.out.println("URL:" + ebookTemp.getUrlMarcaDagua());
        }
    }

}
