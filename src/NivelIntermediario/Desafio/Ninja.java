package NivelIntermediario.Desafio;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + " idade: " + idade + " missão: " + missao +
                " nivel de dificuldade da missão: " + nivelDificuldade + " e status da missão: " + statusMissao);
    }
}
