package NivelBasico.Condicoes;

public class LaçoesDeRepetição {
    public static void main(String[] args) {
        /*
        * Laços de repetição: repetir infinitamente ou até atingir o parâmetro desejado
        * WHILE = FOR
        * */

        // while
        // while (condicao) {tudo aqui vai acontecer}

        /*int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones) {
            System.out.println("O naruto fez um clone das sombras");
            numeroDeClones++;
        }*/

        // for
        for (int i = 0; i <= 40; i++) {
            System.out.println("O naruto está se clonando e esse é o " + i + " clone");
        }
    }
}
