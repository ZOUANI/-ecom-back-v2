package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.OperationStock;


@Repository
public interface OperationStockDao extends JpaRepository<OperationStock,Long> {


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

}