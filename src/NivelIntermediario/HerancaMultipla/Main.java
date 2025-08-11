package NivelIntermediario.HerancaMultipla;

public class Main {

    public static void main(String[] args) {

        //obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 17;
        sasuke.sharinganAtivado();

        //obj uchiha
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi";
        kakashi.aldeia = "Aldeia da folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();

    }
}
