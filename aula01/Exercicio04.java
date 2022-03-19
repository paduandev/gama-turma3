import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, cont;

        System.out.print("Qual tabuada? ");
        n = in.nextInt();
        
        cont = 0;
        while ( cont <= 10 ) {
            System.out.println(n + " x " + cont + " = " + (cont * n));
            cont++;
        }
        
        in.close();
    }
}