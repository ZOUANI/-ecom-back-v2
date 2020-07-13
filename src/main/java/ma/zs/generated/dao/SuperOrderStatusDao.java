package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.SuperOrderStatus;


@Repository
public interface SuperOrderStatusDao extends JpaRepository<SuperOrderStatus,Long> {

	SuperOrderStatus findByLabel(String label);
       int deleteByLabel(String label);


}