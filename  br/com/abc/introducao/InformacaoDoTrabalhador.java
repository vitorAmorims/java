import java.util.Scanner;
public class InformacaoDoTrabalhador {
    public static void main(String[] args){
        String nome;
        float salario;
        String sexo;
        int idade;
        String estadoCivil;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        nome = scan.next();
        System.out.println("Digite o seu salario: ");
        salario = scan.nextFloat();
        System.out.println("Digite o seu sexo: ");
        sexo = scan.next();
        System.out.println("Digite o sua idade: ");
        idade = scan.nextInt();
        System.out.println("Digite seu estado cívil: ");
        estadoCivil = scan.next();
        System.out.println("O trabalhador(a): "+nome+" do sexo: "+sexo+", idade: "+idade+", estado cívil: "+estadoCivil+" e salario: "+salario+" encontra-se empregado neste estabelecimento!");
    }
}
