package  ma.zs.generated.ws.rest.provided.vo;


public class OrderStatusVo {

     private String code ;
   
     private String label ;
   
     private String id ;
   
     private String color ;
   

	private SuperOrderStatusVo superOrderStatusVo ;



 public OrderStatusVo(){
       super();
     }


     public String getCode(){
          return this.code;
     }
      public void setCode(String code){
          this.code = code;
     }


     public String getLabel(){
          return this.label;
     }
      public void setLabel(String label){
          this.label = label;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     public String getColor(){
          return this.color;
     }
      public void setColor(String color){
          this.color = color;
     }


     

      public SuperOrderStatusVo getSuperOrderStatusVo(){
          return this.superOrderStatusVo;
     }
       
     public void setSuperOrderStatusVo(SuperOrderStatusVo superOrderStatusVo){
          this.superOrderStatusVo = superOrderStatusVo;
     }
   




}