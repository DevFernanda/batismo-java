package NivelIntermediario.Desafio;

public class Uchiha extends  Ninja {
    String habilidadeEspecial;


    public void mostrarHabilidadeEspecial(){
        System.out.println("A habilidade especial do ninja " + nome + " é: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("A habilidade especial do ninja é: " + habilidadeEspecial);
    }
}
