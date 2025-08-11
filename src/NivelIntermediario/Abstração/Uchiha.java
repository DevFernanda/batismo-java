package NivelIntermediario.Abstração;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String aldeia, String nome, int idade) {
        super(aldeia, nome, idade);
    }

    // polimorfismo - sobrescrever algo que já existe
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo");
    }
}
