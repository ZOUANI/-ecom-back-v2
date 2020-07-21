package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import ma.zs.generated.bean.Comment;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface CommentDao extends JpaRepository<Comment, Long> {


    List<Comment> findByCommandReferenceOrderByDateCommentAsc(String reference);

    int deleteByCommandReference(String reference);

    List<Comment> findByCommandId(Long id);

    @Transactional
    @Modifying
    @Query("delete from Comment cm where cm.command.id=:id")
    int deleteByCommandId(@Param("id") Long id);


}