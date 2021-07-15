public class ControleDeFluxo1 {
    public static void main(String[] args) {
        int nota = 8;
        if (nota < 5){
            System.out.println("Recuperação");
        } else if (nota <= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Aprovado com louvor");
        }
    }
}
