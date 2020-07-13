package  ma.zs.generated.ws.rest.provided.vo;

import java.util.Date;
import java.math.BigDecimal;   

public class OperationStockVo {

     private String qteAfterOperation ;
   
     private String dateOperationStock ;
   
     private String qteBeforeOperation ;
   
     private String description ;
   
     private String qte ;
   
     private String id ;
   

	private OperationStockTypeVo operationStockTypeVo ;
	private CityVo cityVo ;
	private CommandVo commandVo ;
	private UserVo adminVo ;
	private ProductVo productVo ;


     private String qteAfterOperationMax ;
     private String qteAfterOperationMin ;
     private String dateOperationStockMax ;
     private String dateOperationStockMin ;
     private String qteBeforeOperationMax ;
     private String qteBeforeOperationMin ;
     private String qteMax ;
     private String qteMin ;

 public OperationStockVo(){
       super();
     }


     public String getQteAfterOperation(){
          return this.qteAfterOperation;
     }
      public void setQteAfterOperation(String qteAfterOperation){
          this.qteAfterOperation = qteAfterOperation;
     }


     public String getDateOperationStock(){
          return this.dateOperationStock;
     }
      public void setDateOperationStock(String dateOperationStock){
          this.dateOperationStock = dateOperationStock;
     }


     public String getQteBeforeOperation(){
          return this.qteBeforeOperation;
     }
      public void setQteBeforeOperation(String qteBeforeOperation){
          this.qteBeforeOperation = qteBeforeOperation;
     }


     public String getDescription(){
          return this.description;
     }
      public void setDescription(String description){
          this.description = description;
     }


     public String getQte(){
          return this.qte;
     }
      public void setQte(String qte){
          this.qte = qte;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }



      public String getQteAfterOperationMax(){
          return this.qteAfterOperationMax;
     }
     
      public String getQteAfterOperationMin(){
          return this.qteAfterOperationMin;
     }

     public void setQteAfterOperationMax(String qteAfterOperationMax){
          this.qteAfterOperationMax = qteAfterOperationMax;
     }

     public void setQteAfterOperationMin(String qteAfterOperationMin){
          this.qteAfterOperationMin = qteAfterOperationMin;
     }
     
     

      public String getDateOperationStockMax(){
          return this.dateOperationStockMax;
     }
     
      public String getDateOperationStockMin(){
          return this.dateOperationStockMin;
     }

     public void setDateOperationStockMax(String dateOperationStockMax){
          this.dateOperationStockMax = dateOperationStockMax;
     }

     public void setDateOperationStockMin(String dateOperationStockMin){
          this.dateOperationStockMin = dateOperationStockMin;
     }
     
     

      public String getQteBeforeOperationMax(){
          return this.qteBeforeOperationMax;
     }
     
      public String getQteBeforeOperationMin(){
          return this.qteBeforeOperationMin;
     }

     public void setQteBeforeOperationMax(String qteBeforeOperationMax){
          this.qteBeforeOperationMax = qteBeforeOperationMax;
     }

     public void setQteBeforeOperationMin(String qteBeforeOperationMin){
          this.qteBeforeOperationMin = qteBeforeOperationMin;
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
     
     
     

      public OperationStockTypeVo getOperationStockTypeVo(){
          return this.operationStockTypeVo;
     }
       
     public void setOperationStockTypeVo(OperationStockTypeVo operationStockTypeVo){
          this.operationStockTypeVo = operationStockTypeVo;
     }
   
      public CityVo getCityVo(){
          return this.cityVo;
     }
       
     public void setCityVo(CityVo cityVo){
          this.cityVo = cityVo;
     }
   
      public CommandVo getCommandVo(){
          return this.commandVo;
     }
       
     public void setCommandVo(CommandVo commandVo){
          this.commandVo = commandVo;
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
   




}