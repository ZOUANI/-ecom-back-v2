package  ma.zs.generated.ws.rest.provided.vo;

import java.util.List;
import java.math.BigDecimal;   

public class ProductVo {

     private String label ;
   
     private String price ;
   
     private String size ;
   
     private String reference ;
   
     private String id ;
   
     private String weight ;
   


     private List<OrderLineVo> orderLinesVo ;

     private String priceMax ;
     private String priceMin ;
     private String weightMax ;
     private String weightMin ;

 public ProductVo(){
       super();
     }


     public String getLabel(){
          return this.label;
     }
      public void setLabel(String label){
          this.label = label;
     }


     public String getPrice(){
          return this.price;
     }
      public void setPrice(String price){
          this.price = price;
     }


     public String getSize(){
          return this.size;
     }
      public void setSize(String size){
          this.size = size;
     }


     public String getReference(){
          return this.reference;
     }
      public void setReference(String reference){
          this.reference = reference;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     public String getWeight(){
          return this.weight;
     }
      public void setWeight(String weight){
          this.weight = weight;
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
     
     
     

      public String getWeightMax(){
          return this.weightMax;
     }
     
      public String getWeightMin(){
          return this.weightMin;
     }

     public void setWeightMax(String weightMax){
          this.weightMax = weightMax;
     }

     public void setWeightMin(String weightMin){
          this.weightMin = weightMin;
     }
     
     


      public List<OrderLineVo> getOrderLinesVo(){
          return this.orderLinesVo;
     }
       
     public void setOrderLinesVo(List<OrderLineVo> orderLinesVo){
          this.orderLinesVo = orderLinesVo;
     }



}