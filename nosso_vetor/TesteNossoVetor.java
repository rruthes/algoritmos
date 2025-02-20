import java.util.Scanner;

public class TesteNossoVetor {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("escolha o tamanho do vetor, 0 para o padrão");
    int tamanho = scanner.nextInt();
    NossoVetor v1 = new NossoVetor(tamanho);
    int i=10;
    while (!v1.estaCheio())
      v1.inserir(i++);
    scanner.close();
  }
}