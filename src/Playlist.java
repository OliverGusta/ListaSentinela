public class Playlist {

    private No sentinela;

    public Playlist(String nome) {
        sentinela = new No(null); // Cria o nó sentinela com música = null
        sentinela.anterior = sentinela; // Sentinela aponta para si mesma para trás
        sentinela.proximo = sentinela; // Sentinela aponta para si mesma para frente
    }

    public void adicionarMusica(Musica m) {
        No novo = new No(m);


        novo.proximo = sentinela;
        // a nova música passa a ser o último nó da lista, apontando para o sentinela.

        novo.anterior = sentinela.anterior;
        // o anterior da nova música passa a ser o antigo último nó da lista.

        sentinela.anterior.proximo = novo;
        // o próximo do antigo último nó, passa a apontar para a nova música.

        sentinela.anterior = novo;
        // o sentinela atualiza sua referência para indicar que o novo nó é o último da lista.
    }


    public void listarMusica() {
        No atual = sentinela.proximo;
        // Nó atual aponta para próximo.

        int i = 1;
        while (atual != sentinela) {
            System.out.println(i + ". " + atual.musica.getNome() + " - " + atual.musica.getCantor().getNomeC());
            i++;
            // Enquanto a atual for diferente do sentinela, são mostradas as músicas.

            atual = atual.proximo;
            // Avança pro próximo nó, até que chegue no sentinela.
        }
    }

    public void listarRecentes() {
        No atual = sentinela.anterior;
        // Nó atual aponta para o anterior, já que indica os que foram ouvidos recentemente.

        int i = 1;
        while (atual != sentinela) {
            System.out.println(i + ". " + atual.musica.getNome());
            i++;
            // Enquanto a atual for diferente do sentinela, são mostradas as músicas.

            atual = atual.anterior;
            // Avança para o nó anterior, até que chegue no sentinela.
        }
    }

    public boolean removerMusica(String nome) {
        No atual = sentinela.proximo; // Criação de um nó;
        while (atual != sentinela) {
            if (atual.musica.getNome().equals(nome)) {
                //Busca se o nome indicado existe.

                atual.anterior.proximo = atual.proximo; // Remove a referência ao nó atual no sentido “para frente”
                atual.proximo.anterior = atual.anterior; // Remove a referência ao nó atual no sentido “para trás”

                /* Nesse momento, vamos "BUGAR" o nó. indicamos que não é para ir nem para frente, nem para trás */

                System.out.println("Música removida com sucesso.");
                return true;

            }

            atual = atual.proximo;
            // Avança para o próximo nó da lista. Continua a procura caso não tenha encontrado a música.
        }
        System.out.println("A música não foi encontrada.");
        return false;
    }
}


