package aulas.atividade03;

public class Produto {

  public int id;
  public String nome;
  public String descricao;
  public String codigoBarras;
  public double valor;

  public Produto(){
  }

  public Produto (int id, String nome, String decricao, String codigoBarras, double valor){
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.codigoBarras = codigoBarras;
    this.valor = valor;
  }

  public void imprimirDados(){
    System.out.println("ID: " + id);
    System.out.println("Nome: " + nome);
    System.out.println("Descricao:" + descricao);
    System.out.println("CodigoBarras: " + codigoBarras);
    System.out.println("Valor: " + valor);
  }

}
