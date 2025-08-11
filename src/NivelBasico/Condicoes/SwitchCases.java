package NivelBasico.Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        /*
        * Switch Cases: Servem para gerar casos específicos
        *
        * Objetivo: Pedir pro usuário escolher entre os ninjas
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        int escolhaDoUsuario = scanner.nextInt();
        System.out.println("Você digitou o número: " + escolhaDoUsuario);

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu Naruto");
                break;
            case 2:
                System.out.println("O usuário escolheu Sasuke, o mais revoltado");
                break;
            case 3:
                System.out.println("O usuário escolheu Sakura, a mais chata");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida, tente novamente");

        }


        scanner.close();
    }
}
