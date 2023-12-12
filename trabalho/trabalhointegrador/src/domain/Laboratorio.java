package domain;

public class Laboratorio {

  private int numInd;
  private String nomeLab;
  private int telefone;
  private String email;
  private String endereco;
  public int getNumInd() {
    return numInd;
  }
  public void setNumInd(int numInd) {
    this.numInd = numInd;
  }
  public String getNomeLab() {
    return nomeLab;
  }
  public void setNomeLab(String nomeLab) {
    this.nomeLab = nomeLab;
  }
  public int getTelefone() {
    return telefone;
  }
  public void setTelefone(int telefone) {
    this.telefone = telefone;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
}