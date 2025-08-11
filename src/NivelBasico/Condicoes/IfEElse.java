package NivelBasico.Condicoes;

public class IfEElse {
    public static void main(String[] args) {
        /*
        * IF E ELSE - condições
        *
        * passar o ninja de nivel de acordo com o numero de missões
        * */

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes =5;
        String rank;

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
