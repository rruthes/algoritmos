public class NossoVetor {
    private int ocupacao;
    private int[] vetor;
  
    public NossoVetor(int tamanho) {
      vetor = new int[tamanho];
      ocupacao = 0; 
    }
  
    public NossoVetor() {
      this(10);
    }
  
    public void inserir(int i) {
      if (!estaCheio()) {
        vetor[ocupacao++] = i; 
      }
    }

    public int remover(){
      if (!estaVazio()) {
        return vetor[--ocupacao];
      }
      else {
        return -1;
      }
    }

    public boolean estaCheio () {
      return ocupacao == vetor.length;
    }

    public boolean estaVazio () {
      return ocupacao == 0;
    }

    @Override //não permite que a assinatura do método seja modificada
    public String toString () {
      String s = "ocupacao = " +  ocupacao + "\n";
      for (int i=0; i<ocupacao; i++) {
        s += vetor[i] + " ";
      }
      return s + "\n";
    }
}