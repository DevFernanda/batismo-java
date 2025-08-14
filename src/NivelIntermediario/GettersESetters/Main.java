package NivelIntermediario.GettersESetters;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------Naruto Uzumaki----------");
        Uzumaki naruto = new Uzumaki("Naruto", "Folha", 27, 35, 1.75);
        System.out.println(naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println(naruto.getNome());

        System.out.println("----------Sasuke Uchiha----------");
        Uchiha sasuke = new Uchiha("Sasuke", "Folha", 25, 39, 1.75);
        System.out.println(sasuke.getIdade());
    }
}
