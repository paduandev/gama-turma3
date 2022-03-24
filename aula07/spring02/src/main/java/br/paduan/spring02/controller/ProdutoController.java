package br.paduan.spring02.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.spring02.dao.ProdutoDAO;
import br.paduan.spring02.model.Produto;

@RestController
@CrossOrigin("*") // solicitações podem vir de qualuqer origem
public class ProdutoController {

    @Autowired // injeção de dependência: JPA criar a classe e o objeto
    private ProdutoDAO dao;

    @GetMapping("/produtos")
    public ResponseEntity<ArrayList<Produto>> obterTodos() {
        ArrayList<Produto> lista = (ArrayList<Produto>) dao.findAll();  //lista todos

        if (lista != null) {
            return ResponseEntity.ok(lista); // ok - status 200
        } else {
            return ResponseEntity.notFound().build(); // status 404
        }
    }

    @GetMapping("/produto/{cod}") // 'id' é o nome do parâmetro
    public ResponseEntity<Produto> obterProdutoPorCodigo(@PathVariable int cod){
        Produto produto = dao.findById(cod).orElse(null);  //busca o produto pela chave primária

        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/produto/novo")
    public ResponseEntity<Produto> novoProduto(@RequestBody Produto produto){
        try {
            Produto novoProduto = dao.save(produto);    
            return ResponseEntity.ok(novoProduto);
        } catch (Exception e) {
            //return ResponseEntity.badRequest().build();
            return ResponseEntity.status(400).build();
        }
        
    }

    @PostMapping("/produto/atualiza")
    public ResponseEntity<Produto> atualizaProduto(@RequestBody Produto produto){
        try {
            if(produto.getCodigo() > 0){
                Produto novoProduto = dao.save(produto);    
                return ResponseEntity.ok(novoProduto);
            }
            return ResponseEntity.badRequest().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/produtos/nome/{nome}") 
    public ResponseEntity<ArrayList<Produto>> obterProdutoPorNome(@PathVariable String nome){
        ArrayList<Produto> lista = dao.findByNomeLike(nome);  

        if (lista != null) {
            return ResponseEntity.ok(lista);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/produtos/valor/{valor}") 
    public ResponseEntity<ArrayList<Produto>> obterProdutoPorValorMenor(@PathVariable double valor){
        ArrayList<Produto> lista = dao.findByValorLessThan(valor);

        if (lista != null) {
            return ResponseEntity.ok(lista);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
