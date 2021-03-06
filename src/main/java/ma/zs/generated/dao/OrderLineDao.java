package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

import ma.zs.generated.bean.OrderLine;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface OrderLineDao extends JpaRepository<OrderLine, Long> {


    List<OrderLine> findByCommandReference(String reference);

    int deleteByCommandReference(String reference);

    List<OrderLine> findByCommandId(Long id);

    @Transactional
    @Modifying
    @Query("delete from OrderLine ol where ol.command.id=:id")
    int deleteByCommandId(@Param("id") Long id);


    List<OrderLine> findByProductReference(String reference);

    int deleteByProductReference(String reference);

    List<OrderLine> findByProductId(Long id);

    int deleteByProductId(Long id);

    @Query("select o from OrderLine o where o.command.orderDate BETWEEN :start AND :end ")
    public List<OrderLine> findOrdersLineBetween(@Param("start") Date start, @Param("end") Date end);
}