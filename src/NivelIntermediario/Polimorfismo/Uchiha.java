package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja{

    // polimorfismo - sobrescrever algo que já existe
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo");
    }
}
