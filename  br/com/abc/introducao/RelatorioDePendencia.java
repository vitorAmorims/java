import java.util.Scanner;

public class RelatorioDePendencia {
    public static void main(String[] args) {
        String nome;
        String endereco;
        String telefone;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        nome = scan.next();
        System.out.println("Digite o seu endereco: ");
        endereco = scan.next();
        System.out.println("Digite o seu telefone: ");
        telefone = scan.next();
        System.out.println("O " + nome + ", domiciliado no endereço: " + endereco + " e telefone: " + telefone + " não possui nenhum tipo de pendência!");
    }
}