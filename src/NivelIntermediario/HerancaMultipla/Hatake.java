package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface{

    public void boasVindas() {
        System.out.println(nome + " Eu sou um Hatake!");
    }

    // interface haringan
    public void sharinganAtivado() {
        System.out.println(nome + " : Ativou o sharingan!");
    }

    // interface anbu
    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou um ninja de elite da anbu");
    }
}
