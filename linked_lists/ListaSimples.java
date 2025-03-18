public class ListaSimples {
    private No primeiro;

    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int elemento) {
        No novo = new No(elemento); // primeira etapa: inserir o elemento dentro de um nó
        if (!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }

    @Override
    public String toString() {
        String s = "lista: \n";
        if (estaVazia()) {
            s += "está vazia.";
        } else {
            No runner = primeiro;
            while (runner != null) {
                s += runner + "->";
                runner = runner.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }
}
