package NivelBasico.Arrays;

public class Arrays {
    public static void main(String[] args) {
        /*
        *
        * */

        String[] ninja = new String[3];
        int[] idade = new int[3];

        ninja[0] = "Naruto";
        ninja[1] = "Sakura";
        ninja[2] = "Sasuke";

        // referência de memória
        System.out.println(ninja[0]);

        // redeclarar o array
//        ninja = new String[3];
//        System.out.println(ninja[0]);

        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }
        // array não é lista


    }
}
