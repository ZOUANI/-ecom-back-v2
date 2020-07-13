package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.OperationStock;
import ma.zs.generated.ws.rest.provided.vo.OperationStockVo;

public interface OperationStockService {

        /**

     * find all OperationStock in database 
     * @return List<OperationStock> , If database is empty return  null.
     */
	List<OperationStock> findAll();
	   

    /**
     * find OperationStock from database by id (id)
     * @param id - id of OperationStock 
     * @return the founded  OperationStock , If no OperationStock were
     *         found in database return  null.
     */
	OperationStock findById(Long id);
     
     /**
     * delete OperationStock from database
     * @param id - id of OperationStock to be deleted
     * 
     */
	void deleteById(Long id);

    List<OperationStock> findByOperationStockTypeId(Long id);
    int deleteByOperationStockTypeId(Long id);
			 
	List<OperationStock> findByCityName(String name);
    int deleteByCityName(String name);       
			
    List<OperationStock> findByCityId(Long id);
    int deleteByCityId(Long id);
			 
	List<OperationStock> findByCommandReference(String reference);
    int deleteByCommandReference(String reference);       
			
    List<OperationStock> findByCommandId(Long id);
    int deleteByCommandId(Long id);
			 
	List<OperationStock> findByAdminCode(String code);
    int deleteByAdminCode(String code);       
			
    List<OperationStock> findByAdminId(Long id);
    int deleteByAdminId(Long id);
			 
	List<OperationStock> findByProductReference(String reference);
    int deleteByProductReference(String reference);       
			
    List<OperationStock> findByProductId(Long id);
    int deleteByProductId(Long id);
			 
    /**
     * save OperationStock in database
     * @param operationStock - OperationStock to be saved 
     * @return the saved OperationStock, If the OperationStock can't be saved return null.
     */
	OperationStock save(OperationStock operationStock);

	/**
     * save list OperationStock in database
     * @param operationStocks - list of OperationStock to be saved 
     * @return the saved OperationStock list
     */
	List<OperationStock> save(List<OperationStock> operationStocks);
    
     /**
     * update OperationStock in database
     * @param operationStock - OperationStock to be updated
     * @return the updated OperationStock, If the OperationStock can't be updated return null.
     */
    OperationStock update(OperationStock operationStock);
    
       /**
     * delete OperationStock from database
     * @param operationStock - OperationStock to be deleted
     * @return 1 if OperationStock deleted successfully, If the OperationStock can't be deleted return negative int
     */
	int delete(OperationStock operationStock);


    

     
	/**
     * search for OperationStock in by some criteria
     * @return the searhed list OperationStock 
     */
	List<OperationStock> findByCriteria( OperationStockVo operationStockVo);
}