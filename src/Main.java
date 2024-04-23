import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        Consulta consulta = new Consulta();
        GeracaoJson gera = new GeracaoJson();

        System.out.println("\nInforme seu cep: ");
        busca = leitura.nextLine();
        try {
            EnderecoCep novoEndereco = consulta.buscaEnderecoCep(busca);
            System.out.println(novoEndereco);
            gera.escreveArquivo(novoEndereco);
        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizado a aplicação");
        }
    }
}