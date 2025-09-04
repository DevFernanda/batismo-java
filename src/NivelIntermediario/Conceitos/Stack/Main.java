package NivelIntermediario.Conceitos.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // arrays - estáticos e tem ref memoria
        String[] ninjasArray = new String[3];

        // listas - dinamicas e tam aumenta ou diminui conforme precisa
        List<String> ninjasNomes = new ArrayList<>();

        // stack
        // o último elemento que entrou é obrigatoriamente o primeiro a sair;
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Sakura");
        ninjaStack.push("Kakashi");

        System.out.println(ninjaStack.peek());


    }
}
