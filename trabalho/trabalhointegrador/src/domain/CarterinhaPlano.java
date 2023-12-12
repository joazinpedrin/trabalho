package domain;

import java.util.Date;

public class CarterinhaPlano {

  private int codCarteira;
  private int numCarteirinha;
  private Date validade;
  private int codPaciente;
  private int codPlano;
  public int getCodCarteira() {
    return codCarteira;
  }
  public void setCodCarteira(int codCarteira) {
    this.codCarteira = codCarteira;
  }
  public int getNumCarteirinha() {
    return numCarteirinha;
  }
  public void setNumCarteirinha(int numCarteirinha) {
    this.numCarteirinha = numCarteirinha;
  }
  public Date getValidade() {
    return validade;
  }
  public void setValidade(Date validade) {
    this.validade = validade;
  }
  public int getCodPaciente() {
    return codPaciente;
  }
  public void setCodPaciente(int codPaciente) {
    this.codPaciente = codPaciente;
  }
  public int getCodPlano() {
    return codPlano;
  }
  public void setCodPlano(int codPlano) {
    this.codPlano = codPlano;
  }
}