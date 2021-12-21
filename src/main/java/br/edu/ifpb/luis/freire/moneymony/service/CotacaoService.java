package br.edu.ifpb.luis.freire.moneymony.service;
import br.edu.ifpb.luis.freire.moneymony.repositories.CotacaoRepository;
import br.edu.ifpb.luis.freire.moneymony.model.Cotacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class CotacaoService {
	@Autowired
	   private CotacaoRepository cotacaoRepository;

	   public List<Cotacao> getCotacao() {
	       return this.cotacaoRepository.findAll();
	   }

	   public Cotacao getCotacaoPorId(Long idCotacao) {
	       return this.cotacaoRepository.findById(idCotacao).orElse(null);
	   }

	   @Transactional
	   public Cotacao inserirOuAtualizar(Cotacao cotacao) {
	       Cotacao cotacaoInserida = this.cotacaoRepository.save(cotacao);
	       return cotacaoInserida;
	   }

	   public void apagar(Long id) {
	       this.cotacaoRepository.deleteById(id);
	   }
}
