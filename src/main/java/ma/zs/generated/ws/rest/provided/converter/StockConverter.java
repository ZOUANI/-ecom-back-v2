package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Stock; 
import ma.zs.generated.ws.rest.provided.vo.StockVo;

@Component 
public class StockConverter extends AbstractConverter<Stock,StockVo>{ 
	
	   @Autowired
         private UserConverter userConverter ;
	   @Autowired
         private ProductConverter productConverter ;
	   @Autowired
         private CityConverter cityConverter ;
    private Boolean admin;
    private Boolean product;
    private Boolean city;

	public  StockConverter(){
		init(true);
	}

	@Override 
 	public Stock toItem(StockVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Stock item = new Stock();
			 if(StringUtil.isNotEmpty(vo.getQteRestante()))
                  item.setQteRestante(NumberUtil.toBigDecimal(vo.getQteRestante()));
			 if(StringUtil.isNotEmpty(vo.getQteLivre()))
                  item.setQteLivre(NumberUtil.toBigDecimal(vo.getQteLivre()));
			 if(StringUtil.isNotEmpty(vo.getQteEnvoye()))
                  item.setQteEnvoye(NumberUtil.toBigDecimal(vo.getQteEnvoye()));
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getAdminVo()!=null && this.admin)
			     item.setAdmin(userConverter.toItem(vo.getAdminVo())) ;
             if(vo.getProductVo()!=null && this.product)
			     item.setProduct(productConverter.toItem(vo.getProductVo())) ;
             if(vo.getCityVo()!=null && this.city)
			     item.setCity(cityConverter.toItem(vo.getCityVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public StockVo toVo(Stock item) {
 		if (item == null) {
    		return null;
      	} else {
			StockVo vo = new StockVo();

			 if(item.getQteRestante()!=null)
				vo.setQteRestante(NumberUtil.toString(item.getQteRestante()));
			 if(item.getQteLivre()!=null)
				vo.setQteLivre(NumberUtil.toString(item.getQteLivre()));
			 if(item.getQteEnvoye()!=null)
				vo.setQteEnvoye(NumberUtil.toString(item.getQteEnvoye()));
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getAdmin()!=null && this.admin) {
				   vo.setAdminVo(userConverter.toVo(item.getAdmin())) ;
			   } 
            if(item.getProduct()!=null && this.product) {
				   vo.setProductVo(productConverter.toVo(item.getProduct())) ;
			   } 
            if(item.getCity()!=null && this.city) {
				   vo.setCityVo(cityConverter.toVo(item.getCity())) ;
			   } 

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       admin = value;
       product = value;
       city = value;
	}


	

	
	   public UserConverter getUserConverter(){
		return this.userConverter;
	}  
        public void setUserConverter(UserConverter userConverter ){
		 this.userConverter = userConverter;
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
	 public boolean  isCity(){
		  return this.city;
	 }
	 public void  setCity(boolean city){
		   this.city = city;
	 }
}