public class Teste {

  public static void main(String[] args) {
    int x = 10;
    System.out.println(x == 20);

    int [] v = new int[5];
    int i=0;
    try {
      for (i=0; i<50; i++){
        v[i] = i*10;
        System.out.println(v[i]);
      }      
    } catch (Exception e) {
      System.out.println("erro ao acessar posicao" + i);
    }

  }
}

