package br.edu.ifpb.luis.freire.moneymony.repositories;

import br.edu.ifpb.luis.freire.moneymony.model.Cotacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CotacaoRepository extends JpaRepository<Cotacao, Long> {

  
   @Query("SELECT c FROM Cotacao c")
   public List<Cotacao> getCotacoes();
}
