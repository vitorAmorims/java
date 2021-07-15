public class Arrays6 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][];
        numeros[0] = new int[]{5,5};
        numeros[1] = new int[]{1,2,3};
        numeros[2] = new int[]{10,20,30,40};

        for(int[] ref: numeros){
            for(int n: ref){
                System.out.println(n);
            }
        }

        int[][] dias = {{10,10},{1,2,3},{100,200,300,400}};
        for(int[] ref: dias){
            for(int n: ref){
                System.out.println(n);
            }
        }
    }
}
