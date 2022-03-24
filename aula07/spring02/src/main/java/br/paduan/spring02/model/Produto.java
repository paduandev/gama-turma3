package br.paduan.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // esta classe será persistida no BD
@Table(name = "produto")
public class Produto {

    @Id // este atributo será uma chave primária na tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // os números serão gerados sequenciais (1, 2, 3, ...)
    @Column(name = "cod") // nome da coluna no BD
    private int codigo;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "valor")
    private double valor;

   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto() {
    }

    public Produto(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

}
