package  ma.zs.generated.ws.rest.provided.vo;


public class CommentVo {

     private String message ;
   
     private String id ;
   

	private CommandVo commandVo ;



 public CommentVo(){
       super();
     }


     public String getMessage(){
          return this.message;
     }
      public void setMessage(String message){
          this.message = message;
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
   




}