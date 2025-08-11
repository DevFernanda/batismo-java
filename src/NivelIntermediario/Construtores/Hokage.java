package NivelIntermediario.Construtores;

public class Hokage {
    String nome;
    int idade;
    boolean vivoOuNao;

    public Hokage() {
        // Construtor vazio - o java cria pra nós.
    }

    // Criar um construtor com argumentos
    public Hokage(String nome) {
        this.nome = nome;
    }
}
