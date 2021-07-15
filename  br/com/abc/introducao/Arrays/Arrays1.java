public class Arrays1 {
    public static void main(String[] args) {
        int[] idades = {10,20,30};
        for(int idade: idades){
            System.out.println(idade);
        }
        //ou
        int[] ages = new int[3];
        ages[0] = 1;
        ages[1] = 2;
        ages[2] = 3;
//        ages[3] = 40;
        for(int age: ages){
            System.out.println(age+1);
        }

    }
}
