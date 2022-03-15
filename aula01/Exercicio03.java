import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite;

        System.out.println("Digite o valor do limite:");
        limite = teclado.nextInt();

        for(int i=1; i <= limite; i++) {
            System.out.print(i + " ");
        }

        teclado.close();
    }
}
