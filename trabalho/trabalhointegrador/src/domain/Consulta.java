package domain;

import java.util.Date;

public class Consulta {

  private int codConsulta;
  private Date dtConsulta;
  private int codPaciente;
  private int codMedico;
  private int codProced;
  public int getCodConsulta() {
    return codConsulta;
  }
  public void setCodConsulta(int codConsulta) {
    this.codConsulta = codConsulta;
  }
  public Date getDtConsulta() {
    return dtConsulta;
  }
  public void setDtConsulta(Date dtConsulta) {
    this.dtConsulta = dtConsulta;
  }
  public int getCodPaciente() {
    return codPaciente;
  }
  public void setCodPaciente(int codPaciente) {
    this.codPaciente = codPaciente;
  }
  public int getCodMedico() {
    return codMedico;
  }
  public void setCodMedico(int codMedico) {
    this.codMedico = codMedico;
  }
  public int getCodProced() {
    return codProced;
  }
  public void setCodProced(int codProced) {
    this.codProced = codProced;
  }
  
}
