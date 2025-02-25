import java.util.Scanner;

public class TesteNossoVetor {
    static Scanner scanner;

    static int menu() {
      System.out.println("\n");
      System.out.println("1 - Inserir");
      System.out.println("2 - Remover");
      System.out.println("3 - Exibir");
      System.out.println("0 - Sair");
      return  scanner.nextInt(); 
    }

  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    System.out.println("escolha o tamanho do vetor, 0 para o padrão");
    int tamanho = scanner.nextInt();
    NossoVetor v1 = new NossoVetor(tamanho);
    //int i=10;
    //while (!v1.estaCheio())
    //  v1.inserir(i++);
    //System.out.println(v1);
    int opcao = menu();
    while (opcao > 0) {

      opcao = menu();
    }

    scanner.close();
  }
}