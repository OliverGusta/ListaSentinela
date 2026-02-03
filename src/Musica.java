public class Musica {
    private String nome;
    private Cantor cantor;
    private byte duracao;


    public Musica(String nome, Cantor cantor, byte duracao) {
        this.nome = nome;
        this.cantor = cantor;
        this.duracao = duracao;
    }

    public Musica(String nome, Cantor cantor) {
        this.nome = nome;
        this.cantor = cantor;
    }

    public byte getDuracao() {
        return duracao;
    }

    public void setDuracao(byte duracao) {
        this.duracao = duracao;
    }

    public Cantor getCantor() {
        return cantor;
    }

    public void setCantor(Cantor cantor) {
        this.cantor = cantor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}





