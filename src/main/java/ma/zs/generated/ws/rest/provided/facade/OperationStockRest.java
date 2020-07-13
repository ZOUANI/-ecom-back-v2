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
import ma.zs.generated.bean.OperationStock; 
import ma.zs.generated.service.facade.OperationStockService;
import ma.zs.generated.ws.rest.provided.converter.OperationStockConverter;
import ma.zs.generated.ws.rest.provided.vo.OperationStockVo;

@Api("Manages operationStock services")
@RestController
@RequestMapping("generated/operationStock")
public class OperationStockRest {

	@Autowired 
	private OperationStockService operationStockService;
	
	@Autowired 
	private OperationStockConverter operationStockConverter ;

    @ApiOperation("Saves the specified operationStock")
	@PostMapping("/")
	public OperationStockVo save(@RequestBody OperationStockVo operationStockVo){
		OperationStock operationStock= operationStockConverter.toItem(operationStockVo);
	  operationStock=	operationStockService.save(operationStock);
		return operationStockConverter.toVo(operationStock);
	}

    @ApiOperation("Delete the specified operationStock")
	@DeleteMapping("/")
	public int delete(@RequestBody OperationStockVo operationStockVo){
		OperationStock operationStock = operationStockConverter.toItem(operationStockVo);
		return operationStockService.delete(operationStock);
	}

	@ApiOperation("Updates the specified operationStock")
	@PutMapping("/")
	public OperationStockVo update(@RequestBody OperationStockVo operationStockVo){
		OperationStock operationStock= operationStockConverter.toItem(operationStockVo);
	  operationStock=	operationStockService.update(operationStock);
		return operationStockConverter.toVo(operationStock);
	}

	@ApiOperation("Finds a list of all operationStocks")
	@GetMapping("/")
	public List<OperationStockVo> findAll(){
		return operationStockConverter.toVo(operationStockService.findAll());
	}
    
	@ApiOperation("Finds a operationStock by id")
	@GetMapping("/id/{id}")
	public OperationStockVo findById(@PathVariable Long id){
		return  operationStockConverter.toVo(operationStockService.findById(id));
	}
	@ApiOperation("Deletes a operationStock by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 operationStockService.deleteById(id);
	}



	
	@ApiOperation("Finds operationStock by id of operationStockType")
	@GetMapping("/operationStockType/id/{id}")
	public List<OperationStockVo> findByOperationStockTypeId(@PathVariable Long id){
		return operationStockConverter.toVo(operationStockService.findByOperationStockTypeId(id));
	}
	@ApiOperation("Deletes operationStock by id of operationStockType")
	@DeleteMapping("/operationStockType/id/{id}")
	public int deleteByOperationStockTypeId(@PathVariable Long id){
		return operationStockService.deleteByOperationStockTypeId(id);
	}
     	
    @ApiOperation("Finds a operationStock by name of city")
	@GetMapping("/city/name/{name}")
	public List<OperationStockVo> findByCityName(@PathVariable String name){
		return operationStockConverter.toVo(operationStockService.findByCityName(name));
	}
	
	@ApiOperation("Deletes a operationStock by name of city")
	@DeleteMapping("/city/name/{name}")
	public int deleteByCityName(@PathVariable String name){
		return operationStockService.deleteByCityName(name);
	}
	
	@ApiOperation("Finds operationStock by id of city")
	@GetMapping("/city/id/{id}")
	public List<OperationStockVo> findByCityId(@PathVariable Long id){
		return operationStockConverter.toVo(operationStockService.findByCityId(id));
	}
	@ApiOperation("Deletes operationStock by id of city")
	@DeleteMapping("/city/id/{id}")
	public int deleteByCityId(@PathVariable Long id){
		return operationStockService.deleteByCityId(id);
	}
     	
    @ApiOperation("Finds a operationStock by reference of command")
	@GetMapping("/command/reference/{reference}")
	public List<OperationStockVo> findByCommandReference(@PathVariable String reference){
		return operationStockConverter.toVo(operationStockService.findByCommandReference(reference));
	}
	
	@ApiOperation("Deletes a operationStock by reference of command")
	@DeleteMapping("/command/reference/{reference}")
	public int deleteByCommandReference(@PathVariable String reference){
		return operationStockService.deleteByCommandReference(reference);
	}
	
	@ApiOperation("Finds operationStock by id of command")
	@GetMapping("/command/id/{id}")
	public List<OperationStockVo> findByCommandId(@PathVariable Long id){
		return operationStockConverter.toVo(operationStockService.findByCommandId(id));
	}
	@ApiOperation("Deletes operationStock by id of command")
	@DeleteMapping("/command/id/{id}")
	public int deleteByCommandId(@PathVariable Long id){
		return operationStockService.deleteByCommandId(id);
	}
     	
    @ApiOperation("Finds a operationStock by code of admin")
	@GetMapping("/admin/code/{code}")
	public List<OperationStockVo> findByAdminCode(@PathVariable String code){
		return operationStockConverter.toVo(operationStockService.findByAdminCode(code));
	}
	
	@ApiOperation("Deletes a operationStock by code of admin")
	@DeleteMapping("/admin/code/{code}")
	public int deleteByAdminCode(@PathVariable String code){
		return operationStockService.deleteByAdminCode(code);
	}
	
	@ApiOperation("Finds operationStock by id of admin")
	@GetMapping("/admin/id/{id}")
	public List<OperationStockVo> findByAdminId(@PathVariable Long id){
		return operationStockConverter.toVo(operationStockService.findByAdminId(id));
	}
	@ApiOperation("Deletes operationStock by id of admin")
	@DeleteMapping("/admin/id/{id}")
	public int deleteByAdminId(@PathVariable Long id){
		return operationStockService.deleteByAdminId(id);
	}
     	
    @ApiOperation("Finds a operationStock by reference of product")
	@GetMapping("/product/reference/{reference}")
	public List<OperationStockVo> findByProductReference(@PathVariable String reference){
		return operationStockConverter.toVo(operationStockService.findByProductReference(reference));
	}
	
	@ApiOperation("Deletes a operationStock by reference of product")
	@DeleteMapping("/product/reference/{reference}")
	public int deleteByProductReference(@PathVariable String reference){
		return operationStockService.deleteByProductReference(reference);
	}
	
	@ApiOperation("Finds operationStock by id of product")
	@GetMapping("/product/id/{id}")
	public List<OperationStockVo> findByProductId(@PathVariable Long id){
		return operationStockConverter.toVo(operationStockService.findByProductId(id));
	}
	@ApiOperation("Deletes operationStock by id of product")
	@DeleteMapping("/product/id/{id}")
	public int deleteByProductId(@PathVariable Long id){
		return operationStockService.deleteByProductId(id);
	}
     	
   
    @ApiOperation("Search operationStock by a specific criterion")
    @PostMapping("/search")
	public List<OperationStockVo> findByCriteria(@RequestBody OperationStockVo operationStockVo){
       return operationStockConverter.toVo(operationStockService.findByCriteria(operationStockVo));
	}	
	public OperationStockConverter getOperationStockConverter(){
		return operationStockConverter;
	}
 
	public void setOperationStockConverter(OperationStockConverter operationStockConverter){
		this.operationStockConverter=operationStockConverter;
	}

	public OperationStockService getOperationStockService(){
		return operationStockService;
	}
	public void setOperationStockService( OperationStockService operationStockService){
	 	this.operationStockService=operationStockService;
	}
	

}