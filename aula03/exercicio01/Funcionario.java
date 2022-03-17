package exercicio01;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double valorPorHora;

    public Funcionario(String nome, int horasTrabalhadas, double valorPorHora) {
        this.nome = nome;
        setHorasTrabalhadas(horasTrabalhadas);
        setValorPorHora(valorPorHora);
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas > 0) {
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }

    public void setValorPorHora(double valorPorHora) {
        if (valorPorHora > 0) {
            this.valorPorHora = valorPorHora;
        }
    }

    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    public String exibirDados() {
        return nome + ", " + horasTrabalhadas + ", " + valorPorHora;
    }

}