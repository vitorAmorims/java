public class Arrays2 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 20;
        idades[1] = 15;
        idades[2] = 30;

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Naruto";
        nomes[2] = "Kenshin";
        for(int index = 0; index < nomes.length; index++){
            System.out.println(nomes[index]);
        }
    }
}
