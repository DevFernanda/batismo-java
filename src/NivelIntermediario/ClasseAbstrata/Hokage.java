package NivelIntermediario.ClasseAbstrata;

// A diferença entre classes abstratas é que os métodos na interface
// já são abstract por default
// e as variáveis são FINAL ou seja, não posso setar o valor delas depois.
public abstract class Hokage {
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

    public Hokage(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    public abstract void sabedoriaHokage();
}
