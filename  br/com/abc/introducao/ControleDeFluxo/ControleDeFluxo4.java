public class ControleDeFluxo4 {
    public static void main(String[] args) {
        int contador = 1;

        //loop while checa a condição antes do laço
        while(contador <= 10){
            System.out.println("Imprima na tela o contador: "+ contador);
            contador++;
        }

        //loop do while, checa a condição depois
        int num = 2;
        do{
            System.out.println("Imprima o numero na tela: "+ num);
        }while(num > 2);

        // loop for
        int numero = 10;
        for(int index = 0; index < numero; index++) {
            System.out.println("imprima o index na tela com loop for: "+ index);
            if(index % 2 == 0 && index != 0){
                System.out.println(index);
                break;
            }
        }
    }
}
