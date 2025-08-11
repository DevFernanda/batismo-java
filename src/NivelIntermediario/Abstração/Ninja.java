package NivelIntermediario.Abstração;

public abstract class Ninja implements EstrategiaBatalha {
    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String aldeia, String nome, int idade) {
        this.aldeia = aldeia;
        this.nome = nome;
        this.idade = idade;
    }

    // Método geral - todos os ninjas vão ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    // sobreescrevendo metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é:" + nome + " e essa é minha estratégia de batalha");
    }
}
