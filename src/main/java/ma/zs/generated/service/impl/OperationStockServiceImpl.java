package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.OperationStock;
import ma.zs.generated.bean.OperationStockType;
import ma.zs.generated.bean.City;
import ma.zs.generated.bean.Command;
import ma.zs.generated.bean.User;
import ma.zs.generated.bean.Product;
import ma.zs.generated.dao.OperationStockDao;
import ma.zs.generated.service.facade.OperationStockService;
import ma.zs.generated.service.facade.UserService;   
import ma.zs.generated.service.facade.OperationStockTypeService;   
import ma.zs.generated.service.facade.CommandService;   
import ma.zs.generated.service.facade.ProductService;   
import ma.zs.generated.service.facade.CityService;   

import ma.zs.generated.ws.rest.provided.vo.OperationStockVo;
import ma.zs.generated.service.util.*;
@Service
public class OperationStockServiceImpl implements OperationStockService {

   @Autowired
   private OperationStockDao operationStockDao;
   
    @Autowired
    private UserService userService ;
    @Autowired
    private OperationStockTypeService operationStockTypeService ;
    @Autowired
    private CommandService commandService ;
    @Autowired
    private ProductService productService ;
    @Autowired
    private CityService cityService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<OperationStock> findAll(){
		return operationStockDao.findAll();
	}	
     @Override
    public List<OperationStock> findByOperationStockTypeId(Long id){
		return operationStockDao.findByOperationStockTypeId(id);

	}
	   @Override
	   @Transactional
    public int deleteByOperationStockTypeId(Long id){
		return operationStockDao.deleteByOperationStockTypeId(id);

	}
     		
	@Override
	public List<OperationStock> findByCityName(String name){
		return operationStockDao.findByCityName(name);
	}
	@Override
	@Transactional
    public int deleteByCityName(String name){
		return operationStockDao.deleteByCityName(name);
	}
	
     @Override
    public List<OperationStock> findByCityId(Long id){
		return operationStockDao.findByCityId(id);

	}
	   @Override
	   @Transactional
    public int deleteByCityId(Long id){
		return operationStockDao.deleteByCityId(id);

	}
     		
	@Override
	public List<OperationStock> findByCommandReference(String reference){
		return operationStockDao.findByCommandReference(reference);
	}
	@Override
	@Transactional
    public int deleteByCommandReference(String reference){
		return operationStockDao.deleteByCommandReference(reference);
	}
	
     @Override
    public List<OperationStock> findByCommandId(Long id){
		return operationStockDao.findByCommandId(id);

	}
	   @Override
	   @Transactional
    public int deleteByCommandId(Long id){
		return operationStockDao.deleteByCommandId(id);

	}
     		
	@Override
	public List<OperationStock> findByAdminCode(String code){
		return operationStockDao.findByAdminCode(code);
	}
	@Override
	@Transactional
    public int deleteByAdminCode(String code){
		return operationStockDao.deleteByAdminCode(code);
	}
	
     @Override
    public List<OperationStock> findByAdminId(Long id){
		return operationStockDao.findByAdminId(id);

	}
	   @Override
	   @Transactional
    public int deleteByAdminId(Long id){
		return operationStockDao.deleteByAdminId(id);

	}
     		
	@Override
	public List<OperationStock> findByProductReference(String reference){
		return operationStockDao.findByProductReference(reference);
	}
	@Override
	@Transactional
    public int deleteByProductReference(String reference){
		return operationStockDao.deleteByProductReference(reference);
	}
	
     @Override
    public List<OperationStock> findByProductId(Long id){
		return operationStockDao.findByProductId(id);

	}
	   @Override
	   @Transactional
    public int deleteByProductId(Long id){
		return operationStockDao.deleteByProductId(id);

	}
     		

	@Override
	public OperationStock findById(Long id){
		 if(id==null)
		  return null;
		return operationStockDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           operationStockDao.deleteById(id);
   }
	@Override	
	public OperationStock save (OperationStock operationStock){
	    
	          if(operationStock.getOperationStockType()!=null){
                      OperationStockType operationStockType = operationStockTypeService.findById(operationStock.getOperationStockType().getId());
				  
				  if(operationStockType == null)
				  operationStock.setOperationStockType(operationStockTypeService.save(operationStock.getOperationStockType()));
				  else
				  operationStock.setOperationStockType(operationStockType);
			  }
	    
	          if(operationStock.getCity()!=null){
				    City city = cityService.findByName(operationStock.getCity().getName());
				  if(city == null)
				  operationStock.setCity(cityService.save(operationStock.getCity()));
				  else
				  operationStock.setCity(city);
			  }
	    
	          if(operationStock.getCommand()!=null){
				    Command command = commandService.findByReference(operationStock.getCommand().getReference());
				  if(command == null)
				  operationStock.setCommand(commandService.save(operationStock.getCommand()));
				  else
				  operationStock.setCommand(command);
			  }
	    
	          if(operationStock.getAdmin()!=null){
				    User admin = userService.findByCode(operationStock.getAdmin().getCode());
				  if(admin == null)
				  operationStock.setAdmin(userService.save(operationStock.getAdmin()));
				  else
				  operationStock.setAdmin(admin);
			  }
	    
	          if(operationStock.getProduct()!=null){
				    Product product = productService.findByReference(operationStock.getProduct().getReference());
				  if(product == null)
				  operationStock.setProduct(productService.save(operationStock.getProduct()));
				  else
				  operationStock.setProduct(product);
			  }

	    OperationStock savedOperationStock = operationStockDao.save(operationStock);
	   return savedOperationStock;
	}

    @Override
    public List<OperationStock> save(List<OperationStock> operationStocks){
		List<OperationStock> list = new ArrayList<OperationStock>();
		for(OperationStock operationStock: operationStocks){
		        list.add(save(operationStock));	
		}
		return list;
	}


   @Override
   public OperationStock update(OperationStock operationStock){
     
    
		  OperationStock foundedOperationStock = findById(operationStock.getId()); 
		       if(foundedOperationStock==null)
	          return null;	  
	  
	   return  operationStockDao.save(operationStock);
     
     }
    
	@Override
	@Transactional
	public int delete(OperationStock operationStock){

		 if(operationStock.getId()==null)
			  return -1;
		  OperationStock foundedOperationStock = findById(operationStock.getId()); 
		       if(foundedOperationStock==null)
	          return -1;	  
	   operationStockDao.delete(foundedOperationStock);
	   return 1;
	}


	public List<OperationStock> findByCriteria(OperationStockVo operationStockVo){
      String query = "SELECT o FROM OperationStock o where 1=1 ";
		 	 query += SearchUtil.addConstraint( "o", "qteAfterOperation","=",operationStockVo.getQteAfterOperation());
	  query += SearchUtil.addConstraintDate( "o", "dateOperationStock","=",operationStockVo.getDateOperationStock());
		 	 query += SearchUtil.addConstraint( "o", "qteBeforeOperation","=",operationStockVo.getQteBeforeOperation());
			 query += SearchUtil.addConstraint( "o", "description","LIKE",operationStockVo.getDescription());

		 	 query += SearchUtil.addConstraint( "o", "qte","=",operationStockVo.getQte());
		 	 query += SearchUtil.addConstraint( "o", "id","=",operationStockVo.getId());
	  query += SearchUtil.addConstraintMinMax("o","qteAfterOperation",operationStockVo.getQteAfterOperationMin(),operationStockVo.getQteAfterOperationMax());
	  query += SearchUtil.addConstraintMinMaxDate("o","dateOperationStock",operationStockVo.getDateOperationStockMin(),operationStockVo.getDateOperationStockMax());
	  query += SearchUtil.addConstraintMinMax("o","qteBeforeOperation",operationStockVo.getQteBeforeOperationMin(),operationStockVo.getQteBeforeOperationMax());
	  query += SearchUtil.addConstraintMinMax("o","qte",operationStockVo.getQteMin(),operationStockVo.getQteMax());
   if(operationStockVo.getOperationStockTypeVo()!=null){
     query += SearchUtil.addConstraint( "o", "operationStockType.id","=",operationStockVo.getOperationStockTypeVo().getId());
   }
   
   if(operationStockVo.getCityVo()!=null){
     query += SearchUtil.addConstraint( "o", "city.id","=",operationStockVo.getCityVo().getId());
     query += SearchUtil.addConstraint( "o", "city.name","LIKE",operationStockVo.getCityVo().getName());
   }
   
   if(operationStockVo.getCommandVo()!=null){
     query += SearchUtil.addConstraint( "o", "command.id","=",operationStockVo.getCommandVo().getId());
     query += SearchUtil.addConstraint( "o", "command.reference","LIKE",operationStockVo.getCommandVo().getReference());
   }
   
   if(operationStockVo.getAdminVo()!=null){
     query += SearchUtil.addConstraint( "o", "admin.id","=",operationStockVo.getAdminVo().getId());
     query += SearchUtil.addConstraint( "o", "admin.code","LIKE",operationStockVo.getAdminVo().getCode());
   }
   
   if(operationStockVo.getProductVo()!=null){
     query += SearchUtil.addConstraint( "o", "product.id","=",operationStockVo.getProductVo().getId());
     query += SearchUtil.addConstraint( "o", "product.reference","LIKE",operationStockVo.getProductVo().getReference());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
