package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.Comment; 
import ma.zs.generated.ws.rest.provided.vo.CommentVo;

@Component 
public class CommentConverter extends AbstractConverter<Comment,CommentVo>{ 
	
	   @Autowired
         private CommandConverter commandConverter ;
    private Boolean command;

	public  CommentConverter(){
		init(true);
	}

	@Override 
 	public Comment toItem(CommentVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	Comment item = new Comment();
			 if(StringUtil.isNotEmpty(vo.getMessage()))
                  item.setMessage(vo.getMessage());
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getCommandVo()!=null && this.command)
			     item.setCommand(commandConverter.toItem(vo.getCommandVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public CommentVo toVo(Comment item) {
 		if (item == null) {
    		return null;
      	} else {
			CommentVo vo = new CommentVo();

			if(StringUtil.isNotEmpty(item.getMessage()))
				vo.setMessage(item.getMessage());
			
			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getCommand()!=null && this.command) {
				   vo.setCommandVo(commandConverter.toVo(item.getCommand())) ;
			   } 

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       command = value;
	}


	

	
	   public CommandConverter getCommandConverter(){
		return this.commandConverter;
	}  
        public void setCommandConverter(CommandConverter commandConverter ){
		 this.commandConverter = commandConverter;
	}  
	
	 public boolean  isCommand(){
		  return this.command;
	 }
	 public void  setCommand(boolean command){
		   this.command = command;
	 }
}