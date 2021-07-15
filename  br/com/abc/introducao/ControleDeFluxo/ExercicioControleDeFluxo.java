import java.util.Scanner;
public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
        float salario;
        double totalImposto = 0;
        double sal_liquido = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu salário bruto");
        salario = scan.nextFloat();

        if (salario < 1000){
            totalImposto = salario * 0.05;
            sal_liquido  = salario - totalImposto;
            System.out.println("Desconto: " +  totalImposto);
            System.out.println("Liquido: " + sal_liquido);
        } else if (salario >= 1000 && salario < 2000){
            totalImposto = salario * 0.1;
            sal_liquido  = salario - totalImposto;
            System.out.println("Desconto: " +  totalImposto);
            System.out.println("Liquido: " + sal_liquido);
        } else if (salario >= 2000 && salario < 4000){
            totalImposto = salario * 0.15;
            sal_liquido  = salario - totalImposto;
            System.out.println("Desconto: " +  totalImposto);
            System.out.println("Liquido: " + sal_liquido);
        } else {
            totalImposto = salario * 0.2;
            sal_liquido  = salario - totalImposto;
            System.out.println("Desconto: " +  totalImposto);
            System.out.println("Liquido: " + sal_liquido);
        }
    }
}
