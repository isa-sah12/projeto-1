package aulas.aula0310;

import java.util.UUID;

public class Ebook extends Obra {
    private String urlMarcaDagua;

    public Ebook() {
    }

    public Ebook(UUID id, String titulo, String isbn, double valor, String urlMarcaDagua) {
        super(id, titulo, isbn, valor);
        this.urlMarcaDagua = urlMarcaDagua;
    }

    public String getUrlMarcaDagua() {
        return urlMarcaDagua;
    }

    public void setUrlMarcaDagua(String urlMarcaDagua) {
        this.urlMarcaDagua = urlMarcaDagua;
    }

}
    

     

