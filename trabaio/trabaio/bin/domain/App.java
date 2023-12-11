import domain.Animal;
import domain.Cliente;
import domain.Consulta;
import domain.Especie;
import domain.Exame;
import domain.Tratamento;
import domain.Veterinario;

public class App {
    public static void main(String[] args) throws Exception {
         // Exemplo de uso das classes
         Especie especieCachorro = new Especie(1, "Cachorro");
         Cliente cliente = new Cliente(1, "Carlos", "Rua das Couves", "3499000000");
         Animal layca = new Animal(1, "Layca", "Fêmea", 11, especieCachorro);
         Veterinario andre = new Veterinario(1, "André", "CRMV-MG 2653");

         Tratamento tratamento = new Tratamento(1, "Caroço perto da pata esquerda", layca);
         Consulta consulta1 = new Consulta(1, "11/09/2023", andre, "Caroço perto da pata esquerda");
         Exame exame = new Exame(1, "18/09/2023", "Biópsia", "Falso-negativo", consulta1);
         consulta1.adicionarExame(exame);
         tratamento.adicionarConsulta(consulta1);
         layca.adicionarTratamento(tratamento);
         cliente.adicionarAnimal(layca);
    }
}