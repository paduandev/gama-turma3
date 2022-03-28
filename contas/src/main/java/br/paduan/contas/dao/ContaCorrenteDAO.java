package br.paduan.contas.dao;

import org.springframework.data.repository.CrudRepository;

import br.paduan.contas.model.ContaCorrente;

public interface ContaCorrenteDAO extends CrudRepository<ContaCorrente, Integer> {
    
}
