package  ma.zs.generated.ws.rest.provided.vo;

import java.math.BigDecimal;   

public class OrderLineVo {

     private String price ;
   
     private String qteEnvoye ;
   
     private String qte ;
   
     private String qteLivre ;
   
     private String id ;
   

	private CommandVo commandVo ;
	private ProductVo productVo ;


     private String priceMax ;
     private String priceMin ;
     private String qteEnvoyeMax ;
     private String qteEnvoyeMin ;
     private String qteMax ;
     private String qteMin ;
     private String qteLivreMax ;
     private String qteLivreMin ;

 public OrderLineVo(){
       super();
     }


     public String getPrice(){
          return this.price;
     }
      public void setPrice(String price){
          this.price = price;
     }


     public String getQteEnvoye(){
          return this.qteEnvoye;
     }
      public void setQteEnvoye(String qteEnvoye){
          this.qteEnvoye = qteEnvoye;
     }


     public String getQte(){
          return this.qte;
     }
      public void setQte(String qte){
          this.qte = qte;
     }


     public String getQteLivre(){
          return this.qteLivre;
     }
      public void setQteLivre(String qteLivre){
          this.qteLivre = qteLivre;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }



      public String getPriceMax(){
          return this.priceMax;
     }
     
      public String getPriceMin(){
          return this.priceMin;
     }

     public void setPriceMax(String priceMax){
          this.priceMax = priceMax;
     }

     public void setPriceMin(String priceMin){
          this.priceMin = priceMin;
     }
     
     

      public String getQteEnvoyeMax(){
          return this.qteEnvoyeMax;
     }
     
      public String getQteEnvoyeMin(){
          return this.qteEnvoyeMin;
     }

     public void setQteEnvoyeMax(String qteEnvoyeMax){
          this.qteEnvoyeMax = qteEnvoyeMax;
     }

     public void setQteEnvoyeMin(String qteEnvoyeMin){
          this.qteEnvoyeMin = qteEnvoyeMin;
     }
     
     

      public String getQteMax(){
          return this.qteMax;
     }
     
      public String getQteMin(){
          return this.qteMin;
     }

     public void setQteMax(String qteMax){
          this.qteMax = qteMax;
     }

     public void setQteMin(String qteMin){
          this.qteMin = qteMin;
     }
     
     

      public String getQteLivreMax(){
          return this.qteLivreMax;
     }
     
      public String getQteLivreMin(){
          return this.qteLivreMin;
     }

     public void setQteLivreMax(String qteLivreMax){
          this.qteLivreMax = qteLivreMax;
     }

     public void setQteLivreMin(String qteLivreMin){
          this.qteLivreMin = qteLivreMin;
     }
     
     
     

      public CommandVo getCommandVo(){
          return this.commandVo;
     }
       
     public void setCommandVo(CommandVo commandVo){
          this.commandVo = commandVo;
     }
   
      public ProductVo getProductVo(){
          return this.productVo;
     }
       
     public void setProductVo(ProductVo productVo){
          this.productVo = productVo;
     }
   




}