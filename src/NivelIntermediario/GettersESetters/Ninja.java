package NivelIntermediario.GettersESetters;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoes;
    private double altura;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoes, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoes = numeroDeMissoes;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDeMissoes() {
        return numeroDeMissoes;
    }

    public void setNumeroDeMissoes(int numeroDeMissoes) {
        this.numeroDeMissoes = numeroDeMissoes;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
