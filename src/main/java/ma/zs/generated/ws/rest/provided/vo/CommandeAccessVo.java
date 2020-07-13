package  ma.zs.generated.ws.rest.provided.vo;


public class CommandeAccessVo {

     private String id ;
   

	private CommandVo commandVo ;
	private UserVo validatorVo ;



 public CommandeAccessVo(){
       super();
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }


     

      public CommandVo getCommandVo(){
          return this.commandVo;
     }
       
     public void setCommandVo(CommandVo commandVo){
          this.commandVo = commandVo;
     }
   
      public UserVo getValidatorVo(){
          return this.validatorVo;
     }
       
     public void setValidatorVo(UserVo validatorVo){
          this.validatorVo = validatorVo;
     }
   




}