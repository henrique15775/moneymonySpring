package br.edu.ifpb.luis.freire.moneymony.controller;

import br.edu.ifpb.luis.freire.moneymony.model.Cotacao;
import br.edu.ifpb.luis.freire.moneymony.service.CotacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/")

public class CotacaoController {
	@Autowired
	   private CotacaoService cotacaoService;

	   @GetMapping("/cotacoes")
	   public List<Cotacao> getUsuarios() {
	       return this.cotacaoService.getCotacao();
	   }

	   @GetMapping("/cotacoes/{id}")
	   public Cotacao getUsuarioPorId(@PathVariable("id") Long idCotacao) {
	       return this.cotacaoService.getCotacaoPorId(idCotacao);
	   }

	   @PostMapping("/cotacoes")
	   public Cotacao inserirUsuario(@RequestBody Cotacao cotacao){
	       return this.cotacaoService.inserirOuAtualizar(cotacao);
	   }

	   @PutMapping("/cotacoes/{id}")
	   public Cotacao atualizarCotacao(@PathVariable("id") @RequestBody Cotacao cotacao){
	       return this.cotacaoService.inserirOuAtualizar(cotacao);
	   }

	   @DeleteMapping("/cotacoes/{id}")
	   public void apagarCotacao(@PathVariable("id") Long id) {
	       this.cotacaoService.apagar(id);
	   }

}
