package  ma.zs.generated.ws.rest.provided.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zs.generated.bean.OperationStockType; 
import ma.zs.generated.service.facade.OperationStockTypeService;
import ma.zs.generated.ws.rest.provided.converter.OperationStockTypeConverter;
import ma.zs.generated.ws.rest.provided.vo.OperationStockTypeVo;

@Api("Manages operationStockType services")
@RestController
@RequestMapping("generated/operationStockType")
public class OperationStockTypeRest {

	@Autowired 
	private OperationStockTypeService operationStockTypeService;
	
	@Autowired 
	private OperationStockTypeConverter operationStockTypeConverter ;

    @ApiOperation("Saves the specified operationStockType")
	@PostMapping("/")
	public OperationStockTypeVo save(@RequestBody OperationStockTypeVo operationStockTypeVo){
		OperationStockType operationStockType= operationStockTypeConverter.toItem(operationStockTypeVo);
	  operationStockType=	operationStockTypeService.save(operationStockType);
		return operationStockTypeConverter.toVo(operationStockType);
	}

    @ApiOperation("Delete the specified operationStockType")
	@DeleteMapping("/")
	public int delete(@RequestBody OperationStockTypeVo operationStockTypeVo){
		OperationStockType operationStockType = operationStockTypeConverter.toItem(operationStockTypeVo);
		return operationStockTypeService.delete(operationStockType);
	}

	@ApiOperation("Updates the specified operationStockType")
	@PutMapping("/")
	public OperationStockTypeVo update(@RequestBody OperationStockTypeVo operationStockTypeVo){
		OperationStockType operationStockType= operationStockTypeConverter.toItem(operationStockTypeVo);
	  operationStockType=	operationStockTypeService.update(operationStockType);
		return operationStockTypeConverter.toVo(operationStockType);
	}

	@ApiOperation("Finds a list of all operationStockTypes")
	@GetMapping("/")
	public List<OperationStockTypeVo> findAll(){
		return operationStockTypeConverter.toVo(operationStockTypeService.findAll());
	}
    
	@ApiOperation("Finds a operationStockType by id")
	@GetMapping("/id/{id}")
	public OperationStockTypeVo findById(@PathVariable Long id){
		return  operationStockTypeConverter.toVo(operationStockTypeService.findById(id));
	}
	@ApiOperation("Deletes a operationStockType by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 operationStockTypeService.deleteById(id);
	}



   
    @ApiOperation("Search operationStockType by a specific criterion")
    @PostMapping("/search")
	public List<OperationStockTypeVo> findByCriteria(@RequestBody OperationStockTypeVo operationStockTypeVo){
       return operationStockTypeConverter.toVo(operationStockTypeService.findByCriteria(operationStockTypeVo));
	}	
	public OperationStockTypeConverter getOperationStockTypeConverter(){
		return operationStockTypeConverter;
	}
 
	public void setOperationStockTypeConverter(OperationStockTypeConverter operationStockTypeConverter){
		this.operationStockTypeConverter=operationStockTypeConverter;
	}

	public OperationStockTypeService getOperationStockTypeService(){
		return operationStockTypeService;
	}
	public void setOperationStockTypeService( OperationStockTypeService operationStockTypeService){
	 	this.operationStockTypeService=operationStockTypeService;
	}
	

}