package domain;

import java.util.Date;

public class Paciente {

  private int codPaciente;
  private char sexo;
  private String RG;
  private String nome;
  private String endereco;
  private String telefone;
  private String email;
  private Date dtNascimento;
  public int getCodPaciente() {
    return codPaciente;
  }
  public void setCodPaciente(int codPaciente) {
    this.codPaciente = codPaciente;
  }
  public char getSexo() {
    return sexo;
  }
  public void setSexo(char sexo) {
    this.sexo = sexo;
  }
  public String getRG() {
    return RG;
  }
  public void setRG(String rG) {
    RG = rG;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public Date getDtNascimento() {
    return dtNascimento;
  }
  public void setDtNascimento(Date dtNascimento) {
    this.dtNascimento = dtNascimento;
  }
  
}
