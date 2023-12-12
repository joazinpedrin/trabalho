package domain;

import java.util.Date;

public class Exame {

  private int codExame;
  private String descricao;
  private String resultado;
  private String observacoes;
  private Date dtExame;
  private int codConsulta;
  private int numInd;
  public int getCodExame() {
    return codExame;
  }
  public void setCodExame(int codExame) {
    this.codExame = codExame;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public String getResultado() {
    return resultado;
  }
  public void setResultado(String resultado) {
    this.resultado = resultado;
  }
  public String getObservacoes() {
    return observacoes;
  }
  public void setObservacoes(String observacoes) {
    this.observacoes = observacoes;
  }
  public Date getDtExame() {
    return dtExame;
  }
  public void setDtExame(Date dtExame) {
    this.dtExame = dtExame;
  }
  public int getCodConsulta() {
    return codConsulta;
  }
  public void setCodConsulta(int codConsulta) {
    this.codConsulta = codConsulta;
  }
  public int getNumInd() {
    return numInd;
  }
  public void setNumInd(int numInd) {
    this.numInd = numInd;
  }

}
