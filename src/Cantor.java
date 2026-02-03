public class Cantor {
    private String nome;
    private Musica composicao;

    public String getNomeC() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Musica getComposicao() {
        return composicao;
    }

    public void setComposicao(Musica composicao) {
        this.composicao = composicao;
    }

    public Cantor(String nome) {
        this.nome = nome;
    }
}

