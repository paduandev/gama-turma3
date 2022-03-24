package br.paduan.spring02.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.paduan.spring02.model.Produto;

/*

CRUD - Create Read Update Delete
Utilizar o JPA para as operações básicas no BD

*/

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {
    public ArrayList<Produto> findByNomeLike(String nome);
    public ArrayList<Produto> findByValorLessThan(double valor);

}
