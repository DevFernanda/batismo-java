package NivelIntermediario.Overload;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo. Eu ja completei: " + numeroDeMissoesConcluidas + " missoes." );
    }
    @Override
    // Sobrecarga de métodos
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é: " + nome + " e essa é minha inteligência de combate!");
    }

    @Override
    // Sobrecarga de métodos - int de combate
    public void inteligenciaDeCombate(int qi){
        if (qi > 150) {
            System.out.println("Seu qi é: " + qi + " e você é um gênio");
        } else if (qi>= 130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor.");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais.");
        }
    }

    @Override
    public void metodoProvisorio() {
        System.out.println("teste na classe Uchiha");
    }
}
