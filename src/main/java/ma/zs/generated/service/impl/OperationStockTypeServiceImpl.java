package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.OperationStockType;
import ma.zs.generated.dao.OperationStockTypeDao;
import ma.zs.generated.service.facade.OperationStockTypeService;

import ma.zs.generated.ws.rest.provided.vo.OperationStockTypeVo;
import ma.zs.generated.service.util.*;
@Service
public class OperationStockTypeServiceImpl implements OperationStockTypeService {

   @Autowired
   private OperationStockTypeDao operationStockTypeDao;
   

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<OperationStockType> findAll(){
		return operationStockTypeDao.findAll();
	}	

	@Override
	public OperationStockType findById(Long id){
		 if(id==null)
		  return null;
		return operationStockTypeDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           operationStockTypeDao.deleteById(id);
   }
	@Override	
	public OperationStockType save (OperationStockType operationStockType){

	    OperationStockType savedOperationStockType = operationStockTypeDao.save(operationStockType);
	   return savedOperationStockType;
	}

    @Override
    public List<OperationStockType> save(List<OperationStockType> operationStockTypes){
		List<OperationStockType> list = new ArrayList<OperationStockType>();
		for(OperationStockType operationStockType: operationStockTypes){
		        list.add(save(operationStockType));	
		}
		return list;
	}


   @Override
   public OperationStockType update(OperationStockType operationStockType){
     
    
		  OperationStockType foundedOperationStockType = findById(operationStockType.getId()); 
		       if(foundedOperationStockType==null)
	          return null;	  
	  
	   return  operationStockTypeDao.save(operationStockType);
     
     }
    
	@Override
	@Transactional
	public int delete(OperationStockType operationStockType){

		 if(operationStockType.getId()==null)
			  return -1;
		  OperationStockType foundedOperationStockType = findById(operationStockType.getId()); 
		       if(foundedOperationStockType==null)
	          return -1;	  
	   operationStockTypeDao.delete(foundedOperationStockType);
	   return 1;
	}


	public List<OperationStockType> findByCriteria(OperationStockTypeVo operationStockTypeVo){
      String query = "SELECT o FROM OperationStockType o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "label","LIKE",operationStockTypeVo.getLabel());

		 	 query += SearchUtil.addConstraint( "o", "code","=",operationStockTypeVo.getCode());
		 	 query += SearchUtil.addConstraint( "o", "id","=",operationStockTypeVo.getId());
	  query += SearchUtil.addConstraintMinMax("o","code",operationStockTypeVo.getCodeMin(),operationStockTypeVo.getCodeMax());
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
