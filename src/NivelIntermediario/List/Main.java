package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        * Arrays são estáticos
        * */
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        /*
        * Listas não são estáticas
        * Podem aumentar e diminuir de tamanho
        * */

        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto Uzumaki");
        ninjaList.add("Sasuke Uchiha");

        System.out.println(ninjaList);

        ninjaList.remove("Sasuke Uchiha");
        System.out.println(ninjaList);

        // Trocar um item
        ninjaList.set(0, "Sakura Haruno");
        System.out.println(ninjaList);

         // tamanho da lista
        System.out.println(ninjaList.size());

    }
}
