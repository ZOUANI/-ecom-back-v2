package  ma.zs.generated.ws.rest.provided.converter;

import ma.zs.generated.util.DateUtil;
import ma.zs.generated.util.NumberUtil;
import ma.zs.generated.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

  
import ma.zs.generated.bean.OperationStock; 
import ma.zs.generated.ws.rest.provided.vo.OperationStockVo;

@Component 
public class OperationStockConverter extends AbstractConverter<OperationStock,OperationStockVo>{ 
	
	   @Autowired
         private UserConverter userConverter ;
	   @Autowired
         private OperationStockTypeConverter operationStockTypeConverter ;
	   @Autowired
         private CommandConverter commandConverter ;
	   @Autowired
         private ProductConverter productConverter ;
	   @Autowired
         private CityConverter cityConverter ;
    private Boolean operationStockType;
    private Boolean city;
    private Boolean command;
    private Boolean admin;
    private Boolean product;

	public  OperationStockConverter(){
		init(true);
	}

	@Override 
 	public OperationStock toItem(OperationStockVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	OperationStock item = new OperationStock();
			 if(StringUtil.isNotEmpty(vo.getQteAfterOperation()))
                  item.setQteAfterOperation(NumberUtil.toBigDecimal(vo.getQteAfterOperation()));
             if(StringUtil.isNotEmpty(vo.getDateOperationStock()))
			      item.setDateOperationStock(DateUtil.parse(vo.getDateOperationStock()));
			 if(StringUtil.isNotEmpty(vo.getQteBeforeOperation()))
                  item.setQteBeforeOperation(NumberUtil.toBigDecimal(vo.getQteBeforeOperation()));
			 if(StringUtil.isNotEmpty(vo.getDescription()))
                  item.setDescription(vo.getDescription());
			 if(StringUtil.isNotEmpty(vo.getQte()))
                  item.setQte(NumberUtil.toBigDecimal(vo.getQte()));
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getOperationStockTypeVo()!=null && this.operationStockType)
			     item.setOperationStockType(operationStockTypeConverter.toItem(vo.getOperationStockTypeVo())) ;
             if(vo.getCityVo()!=null && this.city)
			     item.setCity(cityConverter.toItem(vo.getCityVo())) ;
             if(vo.getCommandVo()!=null && this.command)
			     item.setCommand(commandConverter.toItem(vo.getCommandVo())) ;
             if(vo.getAdminVo()!=null && this.admin)
			     item.setAdmin(userConverter.toItem(vo.getAdminVo())) ;
             if(vo.getProductVo()!=null && this.product)
			     item.setProduct(productConverter.toItem(vo.getProductVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public OperationStockVo toVo(OperationStock item) {
 		if (item == null) {
    		return null;
      	} else {
			OperationStockVo vo = new OperationStockVo();

			 if(item.getQteAfterOperation()!=null)
				vo.setQteAfterOperation(NumberUtil.toString(item.getQteAfterOperation()));
            if(item.getDateOperationStock()!=null)
			    vo.setDateOperationStock(DateUtil.formateDate(item.getDateOperationStock()));	     
			 if(item.getQteBeforeOperation()!=null)
				vo.setQteBeforeOperation(NumberUtil.toString(item.getQteBeforeOperation()));
			if(StringUtil.isNotEmpty(item.getDescription()))
				vo.setDescription(item.getDescription());
			
			 if(item.getQte()!=null)
				vo.setQte(NumberUtil.toString(item.getQte()));
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getOperationStockType()!=null && this.operationStockType) {
				   vo.setOperationStockTypeVo(operationStockTypeConverter.toVo(item.getOperationStockType())) ;
			   } 
            if(item.getCity()!=null && this.city) {
				   vo.setCityVo(cityConverter.toVo(item.getCity())) ;
			   } 
            if(item.getCommand()!=null && this.command) {
				   vo.setCommandVo(commandConverter.toVo(item.getCommand())) ;
			   } 
            if(item.getAdmin()!=null && this.admin) {
				   vo.setAdminVo(userConverter.toVo(item.getAdmin())) ;
			   } 
            if(item.getProduct()!=null && this.product) {
				   vo.setProductVo(productConverter.toVo(item.getProduct())) ;
			   } 

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       operationStockType = value;
       city = value;
       command = value;
       admin = value;
       product = value;
	}


	

	
	   public UserConverter getUserConverter(){
		return this.userConverter;
	}  
        public void setUserConverter(UserConverter userConverter ){
		 this.userConverter = userConverter;
	}  
	   public OperationStockTypeConverter getOperationStockTypeConverter(){
		return this.operationStockTypeConverter;
	}  
        public void setOperationStockTypeConverter(OperationStockTypeConverter operationStockTypeConverter ){
		 this.operationStockTypeConverter = operationStockTypeConverter;
	}  
	   public CommandConverter getCommandConverter(){
		return this.commandConverter;
	}  
        public void setCommandConverter(CommandConverter commandConverter ){
		 this.commandConverter = commandConverter;
	}  
	   public ProductConverter getProductConverter(){
		return this.productConverter;
	}  
        public void setProductConverter(ProductConverter productConverter ){
		 this.productConverter = productConverter;
	}  
	   public CityConverter getCityConverter(){
		return this.cityConverter;
	}  
        public void setCityConverter(CityConverter cityConverter ){
		 this.cityConverter = cityConverter;
	}  
	
	 public boolean  isOperationStockType(){
		  return this.operationStockType;
	 }
	 public void  setOperationStockType(boolean operationStockType){
		   this.operationStockType = operationStockType;
	 }
	 public boolean  isCity(){
		  return this.city;
	 }
	 public void  setCity(boolean city){
		   this.city = city;
	 }
	 public boolean  isCommand(){
		  return this.command;
	 }
	 public void  setCommand(boolean command){
		   this.command = command;
	 }
	 public boolean  isAdmin(){
		  return this.admin;
	 }
	 public void  setAdmin(boolean admin){
		   this.admin = admin;
	 }
	 public boolean  isProduct(){
		  return this.product;
	 }
	 public void  setProduct(boolean product){
		   this.product = product;
	 }
}