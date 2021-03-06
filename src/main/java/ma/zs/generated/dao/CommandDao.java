package ma.zs.generated.dao;

import ma.zs.generated.bean.User;
import ma.zs.generated.ws.rest.provided.vo.CommandVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

import ma.zs.generated.bean.Command;


@Repository
public interface CommandDao extends JpaRepository<Command,Long> {

	Command findByReference(String reference);
       int deleteByReference(String reference);

       List<Command> findByValidatorCode(String code);
       int deleteByValidatorCode(String code);       
       int deleteByValidatorId(Long id);
       List<Command> findByDeliveryCode(String code);
       int deleteByDeliveryCode(String code);       
       List<Command> findByDeliveryId(Long id);
       int deleteByDeliveryId(Long id);
       List<Command> findByOrderStatusLabel(String label);
       int deleteByOrderStatusLabel(String label);       
       List<Command> findByOrderStatusId(Long id);
       int deleteByOrderStatusId(Long id);
       List<Command> findByCityName(String name);
       int deleteByCityName(String name);       
       List<Command> findByCityId(Long id);
       int deleteByCityId(Long id);
       List<Command> findByAdminCode(String code);
       int deleteByAdminCode(String code);       
       List<Command> findByAdminId(Long id);
       int deleteByAdminId(Long id);
       List<Command> findByClientId(Long id);
       int deleteByClientId(Long id);




       @Query("SELECT NEW ma.zs.generated.ws.rest.provided.vo.CommandVo(c.day,c.month,COUNT(c.id),SUM(c.total)) FROM Command c where c.orderDate BETWEEN  :start AND :end group by c.orderDate")
       public List<CommandVo> findStatisticsTotalCommands(@Param("start") Date start, @Param("end") Date end);

       @Query("SELECT NEW ma.zs.generated.ws.rest.provided.vo.CommandVo(c.day,c.month,COUNT(c.id),SUM(c.total)) FROM Command c where  c.orderStatus.superOrderStatus.codeSuperStatus LIKE  %:status% and c.orderDate BETWEEN :start AND :end group by c.orderDate")
       public List<CommandVo> findStatisticsCommandsByStatus(@Param("start") Date start, @Param("end") Date end, @Param("status") String status);


       @Query("SELECT c FROM Command c where c.orderDate BETWEEN  :start AND :end")
       public List<Command> findAllCommandsBetween(@Param("start") Date start, @Param("end") Date end);


       @Query("SELECT c FROM Command c where c.admin.id = :idAdmin AND c.orderDate BETWEEN  :start AND :end  ")
       public List<Command> findAllCommandsAdminBetween(@Param("idAdmin") Long idAdmin,@Param("start") Date start, @Param("end") Date end);

       @Query("SELECT NEW ma.zs.generated.ws.rest.provided.vo.CommandVo(c.month,COUNT(c.id),SUM(c.total)) FROM Command c where c.year = :year  group by c.month order by c.month")
       public List<CommandVo> findStatisticsTotalCommandsByCurrentYear(@Param("year") int year);

       @Query("SELECT c FROM Command c where c.validator.id = :id")
       public List<Command> findCommandsOfValidator(@Param("id") Long id);

       @Query("SELECT u FROM User u where u.superAdmin.id = :id")
       public List<User> findDeliveryOfValidator(@Param("id") Long id);

       @Query("SELECT NEW ma.zs.generated.ws.rest.provided.vo.CommandVo(c.month,COUNT(c.id),SUM(c.total)) FROM Command c where c.validator.id = :id and c.year = :year and c.orderStatus.superOrderStatus.codeSuperStatus like '%confirmed%' group by c.month order by c.month")
       public List<CommandVo> validatorChartByCurrentYear(@Param("id") Long id, @Param("year") int year);

       public List<Command> findCommandByDeliveryId(Long id);

       @Query("SELECT NEW ma.zs.generated.ws.rest.provided.vo.CommandVo(c.month,COUNT(c.id),SUM(c.total)) FROM Command c where c.delivery.id = :id and c.year = :year and c.orderStatus.superOrderStatus.code = 'delivered' group by c.month order by c.month")
       public List<CommandVo> deliveryChartByCurrentYear(@Param("id") Long id,@Param("year") int year);

       @Query("SELECT NEW ma.zs.generated.ws.rest.provided.vo.CommandVo(c.month,COUNT(c.id),SUM(c.total)) FROM Command c where c.admin.id = :id and c.year = :year  group by c.month order by c.month")
       public List<CommandVo> adminChartByCurrentYear(@Param("id") Long id,@Param("year") int year);

       public List<Command> findByAdminIdAndValidatorIsNull(Long adminId);



       List<Command> findByValidatorId(Long validatorId);

       @Query("SELECT c FROM Command c, User u WHERE c.validator.id = :validatorId OR (u.id=:validatorId AND u.superAdmin.id = c.admin.id AND c.delivery IS NULL AND c.validator IS NULL AND u.enabledNewCommand=true )")
       List<Command> findValidatorCommands(@Param("validatorId") Long validatorId);

       // @Query("SELECT c FROM Command c WHERE (c.validator.id = :validatorId ) OR
       // (c.admin.id = :adminId AND c.delivery IS NULL AND c.validator IS NULL AND
       // c.validator.enabledNewCommand=true )")
       // List<Command> findValidatorCommands(@Param("validatorId") Long validatorId,
       // @Param("adminId") Long adminId);

       @Query("SELECT c FROM Command c JOIN c.commandeAccesses ca WHERE  c.admin.id = :adminId AND c.validator IS NULL AND c.delivery IS NULL AND ((c.commandeAccesses IS EMPTY) OR (:validatorId IN (ca.validator.id)))")
       public List<Command> findByAdminIdAndValidatorId(@Param("adminId") Long adminId,
                     @Param("validatorId") Long validatorId);

       public List<Command> findByOrderDateBetweenAndDeliveryNotNull( Date start, Date end);

}
