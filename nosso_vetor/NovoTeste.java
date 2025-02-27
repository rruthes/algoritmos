
import java.util.Random;

public class NovoTeste {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(6);
        Random random = new Random();
        for (int i=1; i<100; i++) {
            if (random.nextBoolean()) {
                v.inserir(i);
            }
            else {
                v.remover();
            }
            System.out.println("tamanho = " + v.getTamanho());
            System.out.println(v);
        }
    }
}
