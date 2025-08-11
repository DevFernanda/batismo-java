package NivelIntermediario.Abstração;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        Uchiha sasuke = new Uchiha("Aldeia da folha", "Sasuke", 27);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

    }
}
