package br.paduan.contas.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_conta_especial")
public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() + limite >= valor) {
            return super.sacar(valor);
        }
        return false;
    }
}
