package exercicio01;

public class Veiculo {
    private String marca, modelo;
    private double consumo;

    public Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    public void mostrar(){
        System.out.println("Marca = " + marca + " Modelo = " + modelo);
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double novoConsumo) {
        if(novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }

}