public class OperadoresLogicos {
    public static void main(String[] args){
        // && = AND
        // || = OR
        int idade = 18;
        float salario = 4000f;
        if (salario >= 1000 && idade > 18){
            System.out.println("sim");
        } else {
            System.out.println("não");
        }

        if (idade >= 16 || salario >= 2000){
            System.out.println("simmmmmmmmmm");
        } else {
            System.out.println("nãooooooooooo");
        }
    }
}
