package NivelBasico.Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
         * É um jeito de trazer o usuário pra dentro da aplicação
         * Objetivo: O usuário vai criar um ninja e vamos validar os dados
         * */

        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Escreva o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeNinja = caixaDeTexto.nextInt();

        System.out.println("A idade do ninja é: " + idadeNinja + " anos");

        if (idadeNinja >= 18) {
            System.out.println("Esse ninja já é maior de idade e pode ir para missões para fora da aldeia");
        } else {
            System.out.println("Esse ninja é muito novo ainda, precisa treinar mais antes de sair da vila");
        }

        // fechar sempre o Scanner
        caixaDeTexto.close();
    }
}
