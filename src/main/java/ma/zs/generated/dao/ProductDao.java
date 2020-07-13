package ma.zs.generated.dao;

import ma.zs.generated.ws.rest.provided.vo.ProductVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

import ma.zs.generated.bean.Product;


@Repository
public interface ProductDao extends JpaRepository<Product,Long> {

	Product findByReference(String reference);
       int deleteByReference(String reference);

    @Query("select new ma.zs.generated.ws.rest.provided.vo.ProductVo(o.product.label,o.price ,count(o.product)) from OrderLine o  where o.command.orderDate BETWEEN :start AND :end group by o.product order by count (o.product) DESC ,o.price DESC  ")
    public List<ProductVo> findTopfiveProduct(@Param("start") Date start, @Param("end") Date end);

    Product findByLabel(String label);
}