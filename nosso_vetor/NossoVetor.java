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

    public boolean estaCheio () {
      return ocupacao == vetor.length;
    }

    public boolean estaVazio () {
      return ocupacao == 0;
    }
}