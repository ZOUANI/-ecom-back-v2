package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import ma.zs.generated.bean.CommandeAccess;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface CommandeAccessDao extends JpaRepository<CommandeAccess, Long> {


    List<CommandeAccess> findByCommandReference(String reference);

    int deleteByCommandReference(String reference);

    List<CommandeAccess> findByCommandId(Long id);

    @Transactional
    @Modifying
    @Query("delete from CommandeAccess ca where ca.command.id=:id")
    int deleteByCommandId(@Param("id") Long id);

    List<CommandeAccess> findByValidatorCode(String code);

    int deleteByValidatorCode(String code);

    List<CommandeAccess> findByValidatorId(Long id);

    int deleteByValidatorId(Long id);

    List<CommandeAccess> findByValidatorSuperAdminId(Long adminId);

}