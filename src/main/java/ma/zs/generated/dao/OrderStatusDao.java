package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Set;

import ma.zs.generated.bean.OrderStatus;


@Repository
public interface OrderStatusDao extends JpaRepository<OrderStatus,Long> {

	OrderStatus findByLabel(String label);
       int deleteByLabel(String label);

       List<OrderStatus> findBySuperOrderStatusLabel(String label);
       int deleteBySuperOrderStatusLabel(String label);       
       List<OrderStatus> findBySuperOrderStatusId(Long id);
       int deleteBySuperOrderStatusId(Long id);

       public List<OrderStatus> findByCodeIn(Set<String> codes);


}