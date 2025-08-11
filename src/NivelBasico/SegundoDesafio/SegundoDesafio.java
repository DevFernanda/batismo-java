package NivelBasico.SegundoDesafio;

import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        int qtdNinjas = 0;
        String[] nomes = new String[10];
        int numero = 0;
        int position = 0;
        Scanner scanner = new Scanner(System.in);

        while (numero != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            numero = scanner.nextInt();
            scanner.nextLine();

            switch (numero) {
                case 1:
                    if (qtdNinjas == 10) {
                        System.out.println("Você cadastrou todos os ninjas!");
                        break;
                    }
                    int exit = 0;
                    while (exit != 2) {
                        System.out.println("\n===== Cadastro de Ninja =====");
                        System.out.println("Digite o nome do ninja a ser cadastrado: ");
                        nomes[position] = scanner.nextLine();
                        position++;
                        qtdNinjas++;

                        if (qtdNinjas < 10) {
                            System.out.println("1. Cadastrar novo ninja: ");
                            System.out.println("2. Voltar ao menu principal: ");
                            exit = scanner.nextInt();
                            scanner.nextLine();
                        } else {
                            System.out.println("Você cadastrou todos os ninjas!");
                            break;
                        }
                    }
                    break;
                case 2:
                    if(qtdNinjas == 0){
                        System.out.println("Nenhum ninja encontrado");
                    }
                    for (int i = 0; i < qtdNinjas; i++) {
                        System.out.println("Ninja: " + nomes[i]);
                    }
                    break;
                case 3:
                    System.out.println("Você saiu!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        }
    }
}
