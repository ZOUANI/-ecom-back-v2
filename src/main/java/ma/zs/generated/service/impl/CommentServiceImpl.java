package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;

import ma.zs.generated.bean.User;
import ma.zs.generated.dao.CommandDao;
import ma.zs.generated.dao.UserDao;
import ma.zs.generated.util.SearchUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Comment;
import ma.zs.generated.bean.Command;
import ma.zs.generated.dao.CommentDao;
import ma.zs.generated.service.facade.CommentService;
import ma.zs.generated.service.facade.CommandService;   

import ma.zs.generated.ws.rest.provided.vo.CommentVo;
@Service
public class CommentServiceImpl implements CommentService {

   @Autowired
   private CommentDao commentDao;
   @Autowired
   private CommandDao commandDao;
   @Autowired
	UserDao userDao;
   
    @Autowired
    private CommandService commandService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Comment> findAll(){
		return commentDao.findAll();
	}	
	@Override
	public List<Comment> findByCommandReference(String reference){
		return commentDao.findByCommandReference(reference);
	}
	@Override
	@Transactional
    public int deleteByCommandReference(String reference){
		return commentDao.deleteByCommandReference(reference);
	}
	
     @Override
    public List<Comment> findByCommandId(Long id){
		return commentDao.findByCommandId(id);

	}
	   @Override
	   @Transactional
    public int deleteByCommandId(Long id){
		return commentDao.deleteByCommandId(id);

	}
     		

	@Override
	public Comment findById(Long id){
		 if(id==null)
		  return null;
		return commentDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           commentDao.deleteById(id);
   }
	@Override	
	public Comment save (Comment comment){
		System.out.println("salam");
		if (comment.getCommand() == null || comment.getUser() == null){
			System.out.println("error case");
			System.out.println(comment.getCommand());
			System.out.println(comment.getUser());
			return null;
		}else {
			System.out.println("success case");
			Command command = commandService.findByReference(comment.getCommand().getReference());
			User user = userDao.getOne(comment.getUser().getId());
			comment.setCommand(command);
			comment.setUser(user);
			return commentDao.save(comment);
		}
//	          if(comment.getCommand()!=null){
//				    Command command = commandService.findByReference(comment.getCommand().getReference());
//				  if(command == null)
//				  comment.setCommand(commandDao.save(comment.getCommand()));
//				  else
//				  comment.setCommand(command);
//			  }
//   Comment savedComment = commentDao.save(comment);
//	   return savedComment;
	}

    @Override
    public List<Comment> save(List<Comment> comments){
		List<Comment> list = new ArrayList<Comment>();
		for(Comment comment: comments){
		        list.add(save(comment));	
		}
		return list;
	}


   @Override
   public Comment update(Comment comment){
     
    
		  Comment foundedComment = findById(comment.getId()); 
		       if(foundedComment==null)
	          return null;	  
	  
	   return  commentDao.save(comment);
     
     }
    
	@Override
	@Transactional
	public int delete(Comment comment){

		 if(comment.getId()==null)
			  return -1;
		  Comment foundedComment = findById(comment.getId()); 
		       if(foundedComment==null)
	          return -1;	  
	   commentDao.delete(foundedComment);
	   return 1;
	}


	public List<Comment> findByCriteria(CommentVo commentVo){
      String query = "SELECT o FROM Comment o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "message","LIKE",commentVo.getMessage());

		 	 query += SearchUtil.addConstraint( "o", "id","=",commentVo.getId());
   if(commentVo.getCommandVo()!=null){
     query += SearchUtil.addConstraint( "o", "command.id","=",commentVo.getCommandVo().getId());
     query += SearchUtil.addConstraint( "o", "command.reference","LIKE",commentVo.getCommandVo().getReference());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
