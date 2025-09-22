package NivelIntermediario.Conceitos.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Kakashi");

        System.out.println("Ninjas na fila " + ninjasQueue);

        ninjasQueue.poll();

        System.out.println("Ninjas na fila " + ninjasQueue);

        System.out.println(ninjasQueue.peek());


    }
}

