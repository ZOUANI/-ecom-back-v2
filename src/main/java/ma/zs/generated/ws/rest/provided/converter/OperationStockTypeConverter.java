package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.OperationStockType; 
import ma.zs.generated.ws.rest.provided.vo.OperationStockTypeVo;

@Component 
public class OperationStockTypeConverter extends AbstractConverter<OperationStockType,OperationStockTypeVo>{ 
	

	public  OperationStockTypeConverter(){
		init(true);
	}

	@Override 
 	public OperationStockType toItem(OperationStockTypeVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	OperationStockType item = new OperationStockType();
			 if(StringUtil.isNotEmpty(vo.getLabel()))
                  item.setLabel(vo.getLabel());
			 if(StringUtil.isNotEmpty(vo.getCode()))
                  item.setCode(NumberUtil.toLong(vo.getCode()));
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));


		return item;
 		}
 	}

 	 @Override 
 	public OperationStockTypeVo toVo(OperationStockType item) {
 		if (item == null) {
    		return null;
      	} else {
			OperationStockTypeVo vo = new OperationStockTypeVo();

			if(StringUtil.isNotEmpty(item.getLabel()))
				vo.setLabel(item.getLabel());
			
			 if(item.getCode()!=null)
				vo.setCode(NumberUtil.toString(item.getCode()));
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
	}


	

	
	
}