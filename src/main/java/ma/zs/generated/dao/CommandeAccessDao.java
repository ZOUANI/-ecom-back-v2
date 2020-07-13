package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.CommandeAccess;


@Repository
public interface CommandeAccessDao extends JpaRepository<CommandeAccess,Long> {


       List<CommandeAccess> findByCommandReference(String reference);
       int deleteByCommandReference(String reference);       
       List<CommandeAccess> findByCommandId(Long id);
       int deleteByCommandId(Long id);
       List<CommandeAccess> findByValidatorCode(String code);
       int deleteByValidatorCode(String code);       
       List<CommandeAccess> findByValidatorId(Long id);
       int deleteByValidatorId(Long id);

}