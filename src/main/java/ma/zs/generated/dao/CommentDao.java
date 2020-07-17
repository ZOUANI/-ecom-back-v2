package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Comment;


@Repository
public interface CommentDao extends JpaRepository<Comment,Long> {


       List<Comment> findByCommandReferenceOrderByDateCommentAsc(String reference);
       int deleteByCommandReference(String reference);       
       List<Comment> findByCommandId(Long id);
       int deleteByCommandId(Long id);

}