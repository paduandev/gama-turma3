package projModelo.modelo;

public class Cliente extends Pessoa {
    private String endereco;

    public Cliente(int codigo, String nome, String telefone, String endereco) {
        super(codigo, nome, telefone);
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return super.toString() + " : " + endereco;
    }

}
