package NivelIntermediario.Enums;

public class Missoes {

    private String nome;
    private RankDeMissoes ranking;

    public Missoes() {
    }

    public Missoes(String nome, RankDeMissoes ranking) {
        this.nome = nome;
        this.ranking = ranking;
    }

    public void exibirDetalhes() {
        System.out.println("Missão: " + "nome: " + nome + " Rank: " + ranking + "(Descrição: " + ranking.getDescricao() + ", Dificuldade: " + ranking.getDificuldade() + ")");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRanking() {
        return ranking;
    }

    public void setRanking(RankDeMissoes ranking) {
        this.ranking = ranking;
    }
}
