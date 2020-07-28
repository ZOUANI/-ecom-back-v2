package ma.zs.generated.service.impl;

import java.util.*;

import ma.zs.generated.util.SearchUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.OrderStatus;
import ma.zs.generated.bean.SuperOrderStatus;
import ma.zs.generated.dao.OrderStatusDao;
import ma.zs.generated.service.facade.OrderStatusService;
import ma.zs.generated.service.facade.SuperOrderStatusService;   

import ma.zs.generated.ws.rest.provided.vo.OrderStatusVo;
@Service
public class OrderStatusServiceImpl implements OrderStatusService {

   @Autowired
   private OrderStatusDao orderStatusDao;
   
    @Autowired
    private SuperOrderStatusService superOrderStatusService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<OrderStatus> findAll(){
		return orderStatusDao.findAll();
	}	
	@Override
	public List<OrderStatus> findBySuperOrderStatusLabel(String label){
		return orderStatusDao.findBySuperOrderStatusLabel(label);
	}
	@Override
	@Transactional
    public int deleteBySuperOrderStatusLabel(String label){
		return orderStatusDao.deleteBySuperOrderStatusLabel(label);
	}
	
     @Override
    public List<OrderStatus> findBySuperOrderStatusId(Long id){
		return orderStatusDao.findBySuperOrderStatusId(id);

	}
	   @Override
	   @Transactional
    public int deleteBySuperOrderStatusId(Long id){
		return orderStatusDao.deleteBySuperOrderStatusId(id);

	}
     		
	@Override
	public OrderStatus findByLabel(String label){
		if( label==null)
		  return null;
		return orderStatusDao.findByLabel(label);
	}

   

	@Override
	@Transactional
	public int deleteByLabel(String  label) {
		return orderStatusDao.deleteByLabel(label);	 
	}

	@Override
	public OrderStatus findById(Long id){
		 if(id==null)
		  return null;
		return orderStatusDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           orderStatusDao.deleteById(id);
   }
	@Override	
	public OrderStatus save (OrderStatus orderStatus){
			OrderStatus foundedOrderStatus = findByLabel(orderStatus.getLabel());
	       if(foundedOrderStatus!=null)
	          return null;  
	    
	          if(orderStatus.getSuperOrderStatus()!=null){
				    SuperOrderStatus superOrderStatus = superOrderStatusService.findByLabel(orderStatus.getSuperOrderStatus().getLabel());
				  if(superOrderStatus == null)
				  orderStatus.setSuperOrderStatus(superOrderStatusService.save(orderStatus.getSuperOrderStatus()));
				  else
				  orderStatus.setSuperOrderStatus(superOrderStatus);
			  }

	    OrderStatus savedOrderStatus = orderStatusDao.save(orderStatus);
	   return savedOrderStatus;
	}

    @Override
    public List<OrderStatus> save(List<OrderStatus> orderStatuss){
		List<OrderStatus> list = new ArrayList<OrderStatus>();
		for(OrderStatus orderStatus: orderStatuss){
		        list.add(save(orderStatus));	
		}
		return list;
	}


   @Override
   public OrderStatus update(OrderStatus orderStatus){
     
    
		  OrderStatus foundedOrderStatus = findById(orderStatus.getId()); 
		       if(foundedOrderStatus==null)
	          return null;	  
	  
	   return  orderStatusDao.save(orderStatus);
     
     }
    
	@Override
	@Transactional
	public int delete(OrderStatus orderStatus){

	        if(orderStatus.getLabel()==null)
			  return -1;
		
			OrderStatus foundedOrderStatus = findByLabel(orderStatus.getLabel());
	       if(foundedOrderStatus==null)
	          return -1;  
	   orderStatusDao.delete(foundedOrderStatus);
	   return 1;
	}


	public List<OrderStatus> findByCriteria(OrderStatusVo orderStatusVo){
      String query = "SELECT o FROM OrderStatus o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "code","LIKE",orderStatusVo.getCode());

			 query += SearchUtil.addConstraint( "o", "label","LIKE",orderStatusVo.getLabel());

		 	 query += SearchUtil.addConstraint( "o", "id","=",orderStatusVo.getId());
			 query += SearchUtil.addConstraint( "o", "color","LIKE",orderStatusVo.getColor());

   if(orderStatusVo.getSuperOrderStatusVo()!=null){
     query += SearchUtil.addConstraint( "o", "superOrderStatus.id","=",orderStatusVo.getSuperOrderStatusVo().getId());
     query += SearchUtil.addConstraint( "o", "superOrderStatus.label","LIKE",orderStatusVo.getSuperOrderStatusVo().getLabel());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}

	@Override
	public List<OrderStatus> findByCodeIn(Set<String> codes) {
		return orderStatusDao.findByCodeIn(codes);
	}

	@Override
	public List<OrderStatus> statusForDelivery() {
		Set<String> codes =  new HashSet<>(Arrays.asList("paid", "notPaid"));
		return findByCodeIn(codes);
	}


}
