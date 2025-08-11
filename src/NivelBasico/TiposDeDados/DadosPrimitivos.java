package NivelBasico.TiposDeDados;

public class DadosPrimitivos {

    public static void main(String[] args) {
        /*
         * Dados primitivos - int, double. char, boolean, short.
         * Objetivo da aula: Criar um ninja - Naruto.
         */

         /*
        int: Números inteiros.
        float: Números de ponto flutuante de precisão simples.
        double: Números de ponto flutuante de precisão dupla.
        char: Um único caractere.
        boolean: Valores verdadeiros ou falsos.
        byte: Números inteiros pequenos.
        short: Números inteiros menores que um int.
        long: Números inteiros maiores que um int.
        */

        int idade = 17; // vaLor maximo = 2 147 483 647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 999999L; // valor máximo 9 trilhões etc.

        System.out.println(idade);
        System.out.println(saldoBancario);
        System.out.println("saldo Bancario é = " + saldoBancario);
        System.out.println("Minha idade é: " + idade);
        
    }
}
