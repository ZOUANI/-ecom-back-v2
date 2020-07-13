package  ma.zs.generated.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.generated.service.util.*;

  
import ma.zs.generated.bean.CommandeAccess; 
import ma.zs.generated.ws.rest.provided.vo.CommandeAccessVo;

@Component 
public class CommandeAccessConverter extends AbstractConverter<CommandeAccess,CommandeAccessVo>{ 
	
	   @Autowired
         private UserConverter userConverter ;
	   @Autowired
         private CommandConverter commandConverter ;
    private Boolean command;
    private Boolean validator;

	public  CommandeAccessConverter(){
		init(true);
	}

	@Override 
 	public CommandeAccess toItem(CommandeAccessVo vo) {
 	if (vo == null) {
   	 return null;
      } else {
      	CommandeAccess item = new CommandeAccess();
			 if(StringUtil.isNotEmpty(vo.getId()))
                  item.setId(NumberUtil.toLong(vo.getId()));
             if(vo.getCommandVo()!=null && this.command)
			     item.setCommand(commandConverter.toItem(vo.getCommandVo())) ;
             if(vo.getValidatorVo()!=null && this.validator)
			     item.setValidator(userConverter.toItem(vo.getValidatorVo())) ;


		return item;
 		}
 	}

 	 @Override 
 	public CommandeAccessVo toVo(CommandeAccess item) {
 		if (item == null) {
    		return null;
      	} else {
			CommandeAccessVo vo = new CommandeAccessVo();

			 if(item.getId()!=null)
				vo.setId(NumberUtil.toString(item.getId()));
            if(item.getCommand()!=null && this.command) {
				   vo.setCommandVo(commandConverter.toVo(item.getCommand())) ;
			   } 
            if(item.getValidator()!=null && this.validator) {
				   vo.setValidatorVo(userConverter.toVo(item.getValidator())) ;
			   } 

 			return vo;
 
 		}
 	}
	public void init(Boolean value) { 
       command = value;
       validator = value;
	}


	

	
	   public UserConverter getUserConverter(){
		return this.userConverter;
	}  
        public void setUserConverter(UserConverter userConverter ){
		 this.userConverter = userConverter;
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
	 public boolean  isValidator(){
		  return this.validator;
	 }
	 public void  setValidator(boolean validator){
		   this.validator = validator;
	 }
}