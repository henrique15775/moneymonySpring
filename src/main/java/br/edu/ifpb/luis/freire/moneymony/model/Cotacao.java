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
   private String urlMoeda;
   private String codein;
   private String code;
   private float pctChange;
   private String createDate;
   private float ask;
   private float bid;

   public Cotacao() {}
   
   public Long getId() {
       return this.id;
   }

   public String getUrlMoeda() {
       return this.urlMoeda;
   }
   	
   public void setUrlMoeda(String url_moeda) {
	   this.urlMoeda = url_moeda;
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
	   return this.createDate;
   }
   
   public void setCreateDate(String create_date) {
       this.createDate = create_date;
   }


public String getCodein() {
	return this.codein;
}


public void setCodein(String codein) {
	this.codein = codein;
}

public float getPctChange() {
	return pctChange;
}

public void setPctChange(float pctChange) {
	this.pctChange = pctChange;
}

}
