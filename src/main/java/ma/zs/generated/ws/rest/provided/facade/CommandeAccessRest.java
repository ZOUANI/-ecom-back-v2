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
import ma.zs.generated.bean.CommandeAccess; 
import ma.zs.generated.service.facade.CommandeAccessService;
import ma.zs.generated.ws.rest.provided.converter.CommandeAccessConverter;
import ma.zs.generated.ws.rest.provided.vo.CommandeAccessVo;

@Api("Manages commandeAccess services")
@RestController
@RequestMapping("generated/commandeAccess")
public class CommandeAccessRest {

	@Autowired 
	private CommandeAccessService commandeAccessService;
	
	@Autowired 
	private CommandeAccessConverter commandeAccessConverter ;

    @ApiOperation("Saves the specified commandeAccess")
	@PostMapping("/")
	public CommandeAccessVo save(@RequestBody CommandeAccessVo commandeAccessVo){
		CommandeAccess commandeAccess= commandeAccessConverter.toItem(commandeAccessVo);
	  commandeAccess=	commandeAccessService.save(commandeAccess);
		return commandeAccessConverter.toVo(commandeAccess);
	}

    @ApiOperation("Delete the specified commandeAccess")
	@DeleteMapping("/")
	public int delete(@RequestBody CommandeAccessVo commandeAccessVo){
		CommandeAccess commandeAccess = commandeAccessConverter.toItem(commandeAccessVo);
		return commandeAccessService.delete(commandeAccess);
	}

	@ApiOperation("Updates the specified commandeAccess")
	@PutMapping("/")
	public CommandeAccessVo update(@RequestBody CommandeAccessVo commandeAccessVo){
		CommandeAccess commandeAccess= commandeAccessConverter.toItem(commandeAccessVo);
	  commandeAccess=	commandeAccessService.update(commandeAccess);
		return commandeAccessConverter.toVo(commandeAccess);
	}

	@ApiOperation("Finds a list of all commandeAccesss")
	@GetMapping("/")
	public List<CommandeAccessVo> findAll(){
		return commandeAccessConverter.toVo(commandeAccessService.findAll());
	}
    
	@ApiOperation("Finds a commandeAccess by id")
	@GetMapping("/id/{id}")
	public CommandeAccessVo findById(@PathVariable Long id){
		return  commandeAccessConverter.toVo(commandeAccessService.findById(id));
	}
	@ApiOperation("Deletes a commandeAccess by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 commandeAccessService.deleteById(id);
	}



    @ApiOperation("Finds a commandeAccess by reference of command")
	@GetMapping("/command/reference/{reference}")
	public List<CommandeAccessVo> findByCommandReference(@PathVariable String reference){
		return commandeAccessConverter.toVo(commandeAccessService.findByCommandReference(reference));
	}
	
	@ApiOperation("Deletes a commandeAccess by reference of command")
	@DeleteMapping("/command/reference/{reference}")
	public int deleteByCommandReference(@PathVariable String reference){
		return commandeAccessService.deleteByCommandReference(reference);
	}
	
	@ApiOperation("Finds commandeAccess by id of command")
	@GetMapping("/command/id/{id}")
	public List<CommandeAccessVo> findByCommandId(@PathVariable Long id){
		return commandeAccessConverter.toVo(commandeAccessService.findByCommandId(id));
	}
	@ApiOperation("Deletes commandeAccess by id of command")
	@DeleteMapping("/command/id/{id}")
	public int deleteByCommandId(@PathVariable Long id){
		return commandeAccessService.deleteByCommandId(id);
	}
     	
    @ApiOperation("Finds a commandeAccess by code of validator")
	@GetMapping("/validator/code/{code}")
	public List<CommandeAccessVo> findByValidatorCode(@PathVariable String code){
		return commandeAccessConverter.toVo(commandeAccessService.findByValidatorCode(code));
	}
	
	@ApiOperation("Deletes a commandeAccess by code of validator")
	@DeleteMapping("/validator/code/{code}")
	public int deleteByValidatorCode(@PathVariable String code){
		return commandeAccessService.deleteByValidatorCode(code);
	}
	
	@ApiOperation("Finds commandeAccess by id of validator")
	@GetMapping("/validator/id/{id}")
	public List<CommandeAccessVo> findByValidatorId(@PathVariable Long id){
		return commandeAccessConverter.toVo(commandeAccessService.findByValidatorId(id));
	}
	@ApiOperation("Deletes commandeAccess by id of validator")
	@DeleteMapping("/validator/id/{id}")
	public int deleteByValidatorId(@PathVariable Long id){
		return commandeAccessService.deleteByValidatorId(id);
	}
     	
   
    @ApiOperation("Search commandeAccess by a specific criterion")
    @PostMapping("/search")
	public List<CommandeAccessVo> findByCriteria(@RequestBody CommandeAccessVo commandeAccessVo){
       return commandeAccessConverter.toVo(commandeAccessService.findByCriteria(commandeAccessVo));
	}	
	public CommandeAccessConverter getCommandeAccessConverter(){
		return commandeAccessConverter;
	}
 
	public void setCommandeAccessConverter(CommandeAccessConverter commandeAccessConverter){
		this.commandeAccessConverter=commandeAccessConverter;
	}

	public CommandeAccessService getCommandeAccessService(){
		return commandeAccessService;
	}
	public void setCommandeAccessService( CommandeAccessService commandeAccessService){
	 	this.commandeAccessService=commandeAccessService;
	}
	

}