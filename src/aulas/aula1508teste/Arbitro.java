package aulas.aula1508teste;

import java.util.UUID;

public class Arbitro extends Pessoa {
  private Boolean fifa;
  private String codigo;

  public Arbitro() {
    super();
  }
  public Arbitro(UUID id, String nome, String cpf, Boolean fifa, String codigo) {
    super(id, nome, cpf);
    this.fifa = fifa;
    this.codigo = codigo;
  }

  public Boolean isFifa() {
    return fifa;
  }

  public void setFifa(Boolean fifa) {
    this.fifa = fifa;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  
  
}

