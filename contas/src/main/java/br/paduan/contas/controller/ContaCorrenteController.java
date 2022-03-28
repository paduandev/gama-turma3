package br.paduan.contas.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.contas.DTO.OperacaoDTO;
import br.paduan.contas.dao.ContaCorrenteDAO;
import br.paduan.contas.model.ContaCorrente;

@RestController
@CrossOrigin("*")
public class ContaCorrenteController {

	@Autowired
	private ContaCorrenteDAO dao;

	@GetMapping("/corrente")
	public ResponseEntity<ArrayList<ContaCorrente>> recuperarTudasContasCorrente() {
		ArrayList<ContaCorrente> lista = (ArrayList<ContaCorrente>) dao.findAll();
		if (lista != null) {
			return ResponseEntity.ok(lista);
		}
		return ResponseEntity.notFound().build();
	}

	@GetMapping("/corrente/{numero}")
	public ResponseEntity<ContaCorrente> recuperarContaCorrente(@PathVariable int numero) {
		ContaCorrente cc = dao.findById(numero).orElse(null);

		if (cc != null) {
			return ResponseEntity.ok(cc);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping("/corrente/nova")
	public ResponseEntity<ContaCorrente> criarContaCorrente() {
		ContaCorrente cc = new ContaCorrente();
		ContaCorrente nova = dao.save(cc);
		return ResponseEntity.ok(nova);
	}

	@DeleteMapping("/corrente/{numero}")
	public ResponseEntity<Void> deletarContaCorrente(@PathVariable int numero) {
		dao.deleteById(numero);
		return ResponseEntity.noContent().build();
	}

	@PostMapping("/corrente/depositar")
	public ResponseEntity<ContaCorrente> depositar(@RequestBody OperacaoDTO operacao) {
		ContaCorrente contaCorrente = dao.findById(operacao.getNumeroConta()).orElse(null);

		if (contaCorrente != null) {
			boolean depositou = contaCorrente.depositar(operacao.getValor());
			if (depositou) {
				ContaCorrente contaAtualizada = dao.save(contaCorrente);
				return ResponseEntity.ok(contaAtualizada);
			}
			return ResponseEntity.badRequest().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/corrente/sacar")
	public ResponseEntity<ContaCorrente> sacar(@RequestBody OperacaoDTO operacao) {
		ContaCorrente contaCorrente = dao.findById(operacao.getNumeroConta()).orElse(null);

		if (contaCorrente != null) {
			boolean sacou = contaCorrente.sacar(operacao.getValor());
			if(sacou){
				ContaCorrente contaAtualizada = dao.save(contaCorrente);
				return ResponseEntity.ok(contaAtualizada);
			}
			return ResponseEntity.badRequest().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
