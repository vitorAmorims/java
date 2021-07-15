import java.util.Scanner;
public class ControleDeFluxo6 {
    //dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
    //porém as parcelas não podem ser menores do que 100
    public static void main(String[] args) {
        double valorTotal;
        double valorParcela;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do automovel desejado");
        valorTotal = scan.nextDouble();
        System.out.println("Digite o valor da parcela que deseja pagar");
        valorParcela = scan.nextDouble();

        for(int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorP = valorTotal/ parcela;
            if(valorP <= valorParcela){
                continue;
            }
            System.out.println("Parcelas: "+ parcela + " R$: " + valorP);
        }
    }
}
