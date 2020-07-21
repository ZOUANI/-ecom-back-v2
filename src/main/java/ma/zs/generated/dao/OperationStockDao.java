package ma.zs.generated.dao;

import ma.zs.generated.bean.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

import ma.zs.generated.bean.OperationStock;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface OperationStockDao extends JpaRepository<OperationStock, Long> {


    List<OperationStock> findByOperationStockTypeId(Long id);

    int deleteByOperationStockTypeId(Long id);

    List<OperationStock> findByCityName(String name);

    int deleteByCityName(String name);

    List<OperationStock> findByCityId(Long id);

    int deleteByCityId(Long id);

    List<OperationStock> findByCommandReference(String reference);

    int deleteByCommandReference(String reference);

    List<OperationStock> findByCommandId(Long id);

    @Transactional
    @Modifying
    @Query("delete from OperationStock ops where ops.command.id=:id")
    int deleteByCommandId(@Param("id") Long id);

    List<OperationStock> findByAdminCode(String code);

    int deleteByAdminCode(String code);

    List<OperationStock> findByAdminId(Long id);

    int deleteByAdminId(Long id);

    List<OperationStock> findByProductReference(String reference);

    int deleteByProductReference(String reference);

    List<OperationStock> findByProductId(Long id);

    int deleteByProductId(Long id);

    @Query("select o from OrderLine o where o.command.orderDate BETWEEN :start AND :end ")
    public List<OrderLine> findOrdersLineBetween(@Param("start") Date start, @Param("end") Date end);

}