package NivelIntermediario.Enums;

public enum RankDeMissoes {

    D("Baixo", 1),
    C("Moderado", 2),
    B("Confortável", 3),
    A("Difícil", 4),
    S("Altíssimo", 5);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
