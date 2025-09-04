package NivelIntermediario.Generics.Parte2;

public class Main {

    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocação do sapo"));

        System.out.println("Itens da nossa bolsa ninja: ");
        bolsaNinja.mostrarFerramenta();
    }
}
