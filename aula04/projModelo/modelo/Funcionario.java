package projModelo.modelo;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(int codigo, String nome, String telefone, double salario) {
        super(codigo, nome, telefone);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " R$ " + salario;
    }
}
