import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, soma;

        numero = 1;
        soma = 0;
        while(numero != 0){
            System.out.println("Digite um número inteiro:");
            numero = teclado.nextInt();
            soma = soma + numero;
        }
        System.out.println("Soma = " + soma);

        teclado.close();
    }
}
