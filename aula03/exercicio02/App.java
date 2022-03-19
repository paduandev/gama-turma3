package exercicio02;

public class App {
    public static void main(String[] args) {
        Placar placar1 = new Placar();
        Placar placar2 = new Placar("São Paulo","Corinthians");
        Placar placar3 = new Placar("São Paulo","Corinthians", 3, 0);

        System.out.println( placar1 );
        System.out.println( placar2 );
        System.out.println( placar3 );
    }
}
