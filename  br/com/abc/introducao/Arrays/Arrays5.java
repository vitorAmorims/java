public class Arrays5 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 10;
        dias[0][1] = 20;
        dias[1][0] = 30;
        dias[1][1] = 40;

        for(int index = 0; index < dias.length; index++){
            System.out.println(dias[index]);
            for(int j = 0; j < dias[index].length; j++){
                System.out.println(dias[index][j]);
            }
        }
        //ou
        for(int [] ref: dias){
            for(int dia: ref){
                System.out.println(dia);
            }
        }
    }
}
