package ma.zs.generated.ws.rest.provided.vo;

public class DeliveryCostVo {

     private String id;
     private String shippingCost;
     private CityVo cityVo;
     private UserVo deliveryVo;

     public DeliveryCostVo() {
          super();
     }

     public String getId() {
          return this.id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public CityVo getCityVo() {
          return this.cityVo;
     }

     public void setCityVo(CityVo cityVo) {
          this.cityVo = cityVo;
     }

     public UserVo getDeliveryVo() {
          return this.deliveryVo;
     }

     public void setDeliveryVo(UserVo deliveryVo) {
          this.deliveryVo = deliveryVo;
     }

     public String getShippingCost() {
          return shippingCost;
     }

     public void setShippingCost(String shippingCost) {
          this.shippingCost = shippingCost;
     }

}