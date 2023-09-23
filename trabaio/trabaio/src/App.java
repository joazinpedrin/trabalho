import domain.Paciente;
import domain.Consulta;
import domain.Exame;


 public class App{


    public static void main(String[] args) throws Exception {


        Consulta consulta = new Consulta(1, "2023-08-30");
        System.out.println(consulta);


        Paciente paciente = new Paciente(1, "Mariana Estrela", "07200203360", "Rua Capri", "654398213400987", "34999121049", "mariana.estrela@estudante.iftm.edu.br", "2006-12-18"  )
        System.out.println(paciente);


        Exame exame = new Exame(1, "Pedra no rin", "2023-09-14");
        System.out.println(exame);
    }
