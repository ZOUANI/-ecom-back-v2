package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.OperationStockType;
import ma.zs.generated.ws.rest.provided.vo.OperationStockTypeVo;

public interface OperationStockTypeService {

        /**

     * find all OperationStockType in database 
     * @return List<OperationStockType> , If database is empty return  null.
     */
	List<OperationStockType> findAll();
	   

    /**
     * find OperationStockType from database by id (id)
     * @param id - id of OperationStockType 
     * @return the founded  OperationStockType , If no OperationStockType were
     *         found in database return  null.
     */
	OperationStockType findById(Long id);
     
     /**
     * delete OperationStockType from database
     * @param id - id of OperationStockType to be deleted
     * 
     */
	void deleteById(Long id);

    /**
     * save OperationStockType in database
     * @param operationStockType - OperationStockType to be saved 
     * @return the saved OperationStockType, If the OperationStockType can't be saved return null.
     */
	OperationStockType save(OperationStockType operationStockType);

	/**
     * save list OperationStockType in database
     * @param operationStockTypes - list of OperationStockType to be saved 
     * @return the saved OperationStockType list
     */
	List<OperationStockType> save(List<OperationStockType> operationStockTypes);
    
     /**
     * update OperationStockType in database
     * @param operationStockType - OperationStockType to be updated
     * @return the updated OperationStockType, If the OperationStockType can't be updated return null.
     */
    OperationStockType update(OperationStockType operationStockType);
    
       /**
     * delete OperationStockType from database
     * @param operationStockType - OperationStockType to be deleted
     * @return 1 if OperationStockType deleted successfully, If the OperationStockType can't be deleted return negative int
     */
	int delete(OperationStockType operationStockType);


    

     
	/**
     * search for OperationStockType in by some criteria
     * @return the searhed list OperationStockType 
     */
	List<OperationStockType> findByCriteria( OperationStockTypeVo operationStockTypeVo);
}