package domain;

import java.util.Date;

public class Medico {

  private int codMedico;
  private String cpf;
  private String nome;
  private Date dtNasc;
  private char sexo;
  public int getCodMedico() {
    return codMedico;
  }
  public void setCodMedico(int codMedico) {
    this.codMedico = codMedico;
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public Date getDtNasc() {
    return dtNasc;
  }
  public void setDtNasc(Date dtNasc) {
    this.dtNasc = dtNasc;
  }
  public char getSexo() {
    return sexo;
  }
  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

}
