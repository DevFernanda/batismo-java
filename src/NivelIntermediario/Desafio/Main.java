package NivelIntermediario.Desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int numeroDeNinjas = 1;
        int position = 0;
        Uchiha[] ninjas = new Uchiha[numeroDeNinjas];

        while (numero != 4) {
            System.out.println("\n====NinjaSystem====");
            System.out.println("1. Cadastrar novo ninja");
            System.out.println("2. Listar ninjas");
            System.out.println("3. Atualizar habilidade especial");
            System.out.println("4. Sair");

            numero = scanner.nextInt();
            scanner.nextLine();

            switch (numero){
                case 1:
                    Uchiha ninja = new Uchiha();
                    System.out.println("Cadastro de ninjas");
                    System.out.println("Digite o nome do ninja: ");
                    ninja.nome = scanner.nextLine();
                    System.out.println("Digite a idade do ninja: ");
                    ninja.idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a missão do ninja: ");
                    ninja.missao = scanner.nextLine();
                    System.out.println("Digite o nível da dificuldade da missão: ");
                    ninja.nivelDificuldade = scanner.nextLine();
                    System.out.println("Digite o status da missão: ");
                    ninja.statusMissao = scanner.nextLine();
                    System.out.println("Digite a habilidade especial do ninja: ");
                    ninja.habilidadeEspecial = scanner.nextLine();
                    ninjas[position] = ninja;

                    position++;
                    numeroDeNinjas++;

                    System.out.println("Ninja cadastrado com sucesso!");
                    break;
                case 2:
                    if (position == 0) {
                        System.out.println("Não há nenhum ninja cadastrado!");
                    } else {
                        for (int i = 0; i < ninjas.length; i++) {
                           ninjas[i].mostrarInformacoes();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Qual a posição do ninja que você deseja alterar? ");
                    int opt = scanner.nextInt();
                    scanner.nextLine();
                    if(opt < 0 && opt > ninjas.length) {
                        System.out.println("Opção inválida");
                    } else {
                        System.out.println("Digite a habilidade especial do ninja: ");
                        ninjas[opt].habilidadeEspecial = scanner.nextLine();
                    }
                    break;
                case 4:
                    System.out.println("Você saiu!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }



    }
}
