import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioBruto, prestacao, limite;

        System.out.println("Digite o valor do salário bruto");
        salarioBruto = teclado.nextDouble();
        System.out.println("Digite o valor da prestação:");
        prestacao = teclado.nextDouble();

        limite = salarioBruto * 0.3;

        if(prestacao <= limite) {
            System.out.println("Você pode receber o emprestimo.");
        } else {
            System.out.println("Você não pode receber o emprestimo");
        }

        teclado.close();
    }

}
