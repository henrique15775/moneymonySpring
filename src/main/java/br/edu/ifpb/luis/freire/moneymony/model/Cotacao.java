package br.edu.ifpb.luis.freire.moneymony.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_cotacao")
public class Cotacao {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String url_moeda;
   private String codein;
   private String code;
 
   private String create_date;
   private float ask;
   private float bid;

   public Cotacao() {}
   
   public Long getId() {
       return this.id;
   }

   public String getUrlMoeda() {
       return this.url_moeda;
   }

   public void setBid(float bid) {
       this.bid = bid;
   }

   public float getBid() {
       return this.bid;
   }

   public void setAsk(float ask) {
       this.ask = ask;
   }

   public float getAsk() {
       return this.ask;
   }
   
   public String getCode() {
	   return this.code;
   }

   public void setCode(String code) {
       this.code = code;
   }
   
   public String getCreateDate() {
	   return this.create_date;
   }
   
   public void setCreateDate(String create_date) {
       this.create_date = create_date;
   }


public String getCodein() {
	return this.codein;
}


public void setCodein(String codein) {
	this.codein = codein;
}

}
