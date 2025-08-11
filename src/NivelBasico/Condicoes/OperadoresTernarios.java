package NivelBasico.Condicoes;

public class OperadoresTernarios {
    public static void main(String[] args) {
        /*
        * Ternarios: maneiras de reduzir código
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso
        * */

        short numeroDeMissoes = 8;
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos que 10 missões";

        System.out.println(nivel);
    }
}
