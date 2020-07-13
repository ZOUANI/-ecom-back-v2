package  ma.zs.generated.ws.rest.provided.vo;

import java.math.BigDecimal;   

public class StockVo {

     private String qteRestante ;
   
     private String qteLivre ;
   
     private String qteEnvoye ;
   
     private String id ;
   

	private UserVo adminVo ;
	private ProductVo productVo ;
	private CityVo cityVo ;


     private String qteRestanteMax ;
     private String qteRestanteMin ;
     private String qteLivreMax ;
     private String qteLivreMin ;
     private String qteEnvoyeMax ;
     private String qteEnvoyeMin ;

 public StockVo(){
       super();
     }


     public String getQteRestante(){
          return this.qteRestante;
     }
      public void setQteRestante(String qteRestante){
          this.qteRestante = qteRestante;
     }


     public String getQteLivre(){
          return this.qteLivre;
     }
      public void setQteLivre(String qteLivre){
          this.qteLivre = qteLivre;
     }


     public String getQteEnvoye(){
          return this.qteEnvoye;
     }
      public void setQteEnvoye(String qteEnvoye){
          this.qteEnvoye = qteEnvoye;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }



      public String getQteRestanteMax(){
          return this.qteRestanteMax;
     }
     
      public String getQteRestanteMin(){
          return this.qteRestanteMin;
     }

     public void setQteRestanteMax(String qteRestanteMax){
          this.qteRestanteMax = qteRestanteMax;
     }

     public void setQteRestanteMin(String qteRestanteMin){
          this.qteRestanteMin = qteRestanteMin;
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
     
     
     

      public UserVo getAdminVo(){
          return this.adminVo;
     }
       
     public void setAdminVo(UserVo adminVo){
          this.adminVo = adminVo;
     }
   
      public ProductVo getProductVo(){
          return this.productVo;
     }
       
     public void setProductVo(ProductVo productVo){
          this.productVo = productVo;
     }
   
      public CityVo getCityVo(){
          return this.cityVo;
     }
       
     public void setCityVo(CityVo cityVo){
          this.cityVo = cityVo;
     }
   




}