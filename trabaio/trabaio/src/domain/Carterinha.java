public class Carterinha {
    private Integer cod_carterinha;
    
    private Calendar validade;
    private Paciente paciente;
    private Plano plano;

    public Carterinha(Integer cod_carterinha, Integer num_carterinha, Calendar validade, Paciente paciente, Plano plano) {
        this.cod_carterinha = cod_carterinha;
        
        this.validade = validade;
        this.paciente = paciente;
        this.plano = plano;
    }

    public Integer getCod_carterinha() {
        return cod_carterinha;
    }

    public void setCod_carterinha(Integer cod_carterinha) {
        this.cod_carterinha = cod_carterinha;
    }

   
    }

    public Calendar getValidade() {
        return validade;
    }

    public void setValidade(Calendar validade) {
        this.validade = validade;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
