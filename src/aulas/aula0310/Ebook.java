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

    @Override
    public boolean aplicarDesconto(double porcentagem) {
        if (porcentagem > 0.7) {
            return false;
        }
        double desconto = super.getValor() * porcentagem;
        super.setValor(super.getValor() - desconto);
        return true;
    }
        
    
    
            

}
    

     

