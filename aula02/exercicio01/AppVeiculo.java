package exercicio01;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Chevrolet", "Cruze", 10);

        v1.mostrar();
        v1.setConsumo(-12);
        System.out.println("Consumo = " + v1.getConsumo());
    }
}
