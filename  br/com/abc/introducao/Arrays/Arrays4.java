import java.util.Scanner;
public class Arrays4 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        Scanner scan =  new Scanner(System.in);
        System.out.println("Digite o primeiro nome");
        nomes[0] = scan.next();
        System.out.println("Digite o segundo nome");
        nomes[1] = scan.next();
        System.out.println("Digite o terceiro nome");
        nomes[2] = scan.next();
        for(String nome: nomes){
            System.out.println(nome);
        }
    }
}
