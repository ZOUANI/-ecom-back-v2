package  ma.zs.generated.ws.rest.provided.vo;


import java.math.BigDecimal;

public class DeliveryCostVo {

     private String id ;
   

	private CityVo cityVo ;
	private UserVo deliveryVo ;
    private String shippingCost ;




    public DeliveryCostVo(){
       super();
     }

    public String getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(String shippingCost) {
        this.shippingCost = shippingCost;
    }

    public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     

      public CityVo getCityVo(){
          return this.cityVo;
     }
       
     public void setCityVo(CityVo cityVo){
          this.cityVo = cityVo;
     }
   
      public UserVo getDeliveryVo(){
          return this.deliveryVo;
     }
       
     public void setDeliveryVo(UserVo deliveryVo){
          this.deliveryVo = deliveryVo;
     }
   




}