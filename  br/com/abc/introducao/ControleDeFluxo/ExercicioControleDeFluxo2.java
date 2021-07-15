import java.util.Scanner;
public class ExercicioControleDeFluxo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia;
        System.out.println("Digite um número de 1 .. 7");
        dia = scan.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                System.out.println("Fim de semana!!");
                break;
            case 2:
                System.out.println("Segunda");
                System.out.println("Dia de semana!!");
                break;
            case 3:
                System.out.println("Terça");
                System.out.println("Dia de semana!!");
                break;
            case 4:
                System.out.println("Quarta");
                System.out.println("Dia de semana!!");
                break;
            case 5:
                System.out.println("Quinta");
                System.out.println("Dia de semana!!");
                break;
            case 6:
                System.out.println("Sexta");
                System.out.println("Dia de semana!!");
            default:
                System.out.println("Sábado");
                System.out.println("Fim de semana!!");
                break;
        }
    }
}
