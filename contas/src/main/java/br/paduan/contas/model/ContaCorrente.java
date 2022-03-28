package br.paduan.contas.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_conta_corrente")
public class ContaCorrente extends Conta {

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() >= valor) {  // tem saldo suficiente?
            return super.sacar(valor);
        }
        return false;
    }

}
