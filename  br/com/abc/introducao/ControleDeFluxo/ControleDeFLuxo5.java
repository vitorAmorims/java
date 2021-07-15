import java.util.Scanner;
public class ControleDeFLuxo5 {
    public static void main(String[] args) {
        //dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
        //porém as parcelas não podem ser menores do que 100
        Scanner scan = new Scanner(System.in);
        double valorTotal;
        System.out.println("Digite o valor do automovel.");
        valorTotal = scan.nextDouble();

        for(int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            }else{
                break;
            }
        }

    }
}
