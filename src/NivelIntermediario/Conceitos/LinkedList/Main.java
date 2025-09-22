package NivelIntermediario.Conceitos.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> ninjaLinkedList = new LinkedList<>();
        ninjaLinkedList.add("Naruto");
        ninjaLinkedList.add("Sasuke");
        ninjaLinkedList.add("Sakura");

        System.out.println(ninjaLinkedList);
        ninjaLinkedList.add(1, "Kakashi");

        System.out.println(ninjaLinkedList);

        ArrayList<String> arrayList = new ArrayList<>();

    }
}
