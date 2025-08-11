package NivelIntermediario.Abstração;

public class Uzumaki extends Ninja {

    // polimorfismo - sobrescrever algo que já existe
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de ar");
    }
}
