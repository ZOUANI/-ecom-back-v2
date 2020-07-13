package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.CommandeAccess;
import ma.zs.generated.ws.rest.provided.vo.CommandeAccessVo;

public interface CommandeAccessService {

        /**

     * find all CommandeAccess in database 
     * @return List<CommandeAccess> , If database is empty return  null.
     */
	List<CommandeAccess> findAll();
	   

    /**
     * find CommandeAccess from database by id (id)
     * @param id - id of CommandeAccess 
     * @return the founded  CommandeAccess , If no CommandeAccess were
     *         found in database return  null.
     */
	CommandeAccess findById(Long id);
     
     /**
     * delete CommandeAccess from database
     * @param id - id of CommandeAccess to be deleted
     * 
     */
	void deleteById(Long id);

	List<CommandeAccess> findByCommandReference(String reference);
    int deleteByCommandReference(String reference);       
			
    List<CommandeAccess> findByCommandId(Long id);
    int deleteByCommandId(Long id);
			 
	List<CommandeAccess> findByValidatorCode(String code);
    int deleteByValidatorCode(String code);       
			
    List<CommandeAccess> findByValidatorId(Long id);
    int deleteByValidatorId(Long id);
			 
    /**
     * save CommandeAccess in database
     * @param commandeAccess - CommandeAccess to be saved 
     * @return the saved CommandeAccess, If the CommandeAccess can't be saved return null.
     */
	CommandeAccess save(CommandeAccess commandeAccess);

	/**
     * save list CommandeAccess in database
     * @param commandeAccesss - list of CommandeAccess to be saved 
     * @return the saved CommandeAccess list
     */
	List<CommandeAccess> save(List<CommandeAccess> commandeAccesss);
    
     /**
     * update CommandeAccess in database
     * @param commandeAccess - CommandeAccess to be updated
     * @return the updated CommandeAccess, If the CommandeAccess can't be updated return null.
     */
    CommandeAccess update(CommandeAccess commandeAccess);
    
       /**
     * delete CommandeAccess from database
     * @param commandeAccess - CommandeAccess to be deleted
     * @return 1 if CommandeAccess deleted successfully, If the CommandeAccess can't be deleted return negative int
     */
	int delete(CommandeAccess commandeAccess);


    

     
	/**
     * search for CommandeAccess in by some criteria
     * @return the searhed list CommandeAccess 
     */
	List<CommandeAccess> findByCriteria( CommandeAccessVo commandeAccessVo);
}