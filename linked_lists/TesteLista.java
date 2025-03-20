public class TesteLista {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        System.out.println("lista foi criada\n" + lista);

        try {
            System.out.println(lista.removeInicio() + " foi removido do inicio");
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        lista.insereInicio(5);
        lista.insereInicio(8);
        lista.insereInicio(15);
        lista.insereInicio(20);
        System.out.println("lista depois das insercoes\n" + lista);

        try {
            System.out.println(lista.removeInicio() + " foi removido do inicio");
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("lista depois da remocao\n" + lista);

        lista.insereFim(12);
        lista.insereFim(27);
        System.out.println("lista depois das insercoes de fim:\n" + lista);

    }
}