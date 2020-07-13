package  ma.zs.generated.ws.rest.provided.vo;

import java.math.BigDecimal;
import java.util.Date;

public class UserVo {

     private String enabled ;
   
     private String password ;
   
     private String enabledNewCommand ;
   
     private String created ;
   
     private String lastName ;
   
     private String phoneNumber ;
   
     private String email ;
   
     private String code ;
   
     private String firsttName ;
   
     private String id ;
   

	private RoleVo authorityVo ;
	private DeliveryTypeVo deliveryTypeVo ;
	private UserVo superAdminVo ;
	private CityVo cityVo ;


     private String createdMax ;
     private String createdMin ;

    private String deliveryName;
    private BigDecimal totalAmountCommand;
    private BigDecimal totalAmountCommandClosed;
    private int commandsReturned;
    private int commandsClosed;
    private int commandProcessed;
    private BigDecimal percentageClosed;
    private BigDecimal percentageReturned;

    private Long totalCommandDelivered;


    public UserVo(String deliveryName, BigDecimal totalAmountCommand, BigDecimal totalAmountCommandClosed, int commandsReturned, int commandsClosed, int commandProcessed, BigDecimal percentageClosed, BigDecimal percentageReturned) {
        this.deliveryName = deliveryName;
        this.totalAmountCommand = totalAmountCommand;
        this.totalAmountCommandClosed = totalAmountCommandClosed;
        this.commandsReturned = commandsReturned;
        this.commandsClosed = commandsClosed;
        this.commandProcessed = commandProcessed;
        this.percentageClosed = percentageClosed;
        this.percentageReturned = percentageReturned;
    }

    public UserVo(String deliveryName, Long totalCommandDelivered) {
        this.deliveryName = deliveryName;
        this.totalCommandDelivered = totalCommandDelivered;
    }

 public UserVo(){
       super();
     }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public BigDecimal getTotalAmountCommand() {
        return totalAmountCommand;
    }

    public void setTotalAmountCommand(BigDecimal totalAmountCommand) {
        this.totalAmountCommand = totalAmountCommand;
    }

    public BigDecimal getTotalAmountCommandClosed() {
        return totalAmountCommandClosed;
    }

    public void setTotalAmountCommandClosed(BigDecimal totalAmountCommandClosed) {
        this.totalAmountCommandClosed = totalAmountCommandClosed;
    }

    public int getCommandsReturned() {
        return commandsReturned;
    }

    public void setCommandsReturned(int commandsReturned) {
        this.commandsReturned = commandsReturned;
    }

    public int getCommandsClosed() {
        return commandsClosed;
    }

    public void setCommandsClosed(int commandsClosed) {
        this.commandsClosed = commandsClosed;
    }

    public int getCommandProcessed() {
        return commandProcessed;
    }

    public void setCommandProcessed(int commandProcessed) {
        this.commandProcessed = commandProcessed;
    }

    public BigDecimal getPercentageClosed() {
        return percentageClosed;
    }

    public void setPercentageClosed(BigDecimal percentageClosed) {
        this.percentageClosed = percentageClosed;
    }

    public BigDecimal getPercentageReturned() {
        return percentageReturned;
    }

    public void setPercentageReturned(BigDecimal percentageReturned) {
        this.percentageReturned = percentageReturned;
    }

    public Long getTotalCommandDelivered() {
        return totalCommandDelivered;
    }

    public void setTotalCommandDelivered(Long totalCommandDelivered) {
        this.totalCommandDelivered = totalCommandDelivered;
    }

    public String getEnabled(){
          return this.enabled;
     }
      public void setEnabled(String enabled){
          this.enabled = enabled;
     }


     public String getPassword(){
          return this.password;
     }
      public void setPassword(String password){
          this.password = password;
     }


     public String getEnabledNewCommand(){
          return this.enabledNewCommand;
     }
      public void setEnabledNewCommand(String enabledNewCommand){
          this.enabledNewCommand = enabledNewCommand;
     }


     public String getCreated(){
          return this.created;
     }
      public void setCreated(String created){
          this.created = created;
     }


     public String getLastName(){
          return this.lastName;
     }
      public void setLastName(String lastName){
          this.lastName = lastName;
     }


     public String getPhoneNumber(){
          return this.phoneNumber;
     }
      public void setPhoneNumber(String phoneNumber){
          this.phoneNumber = phoneNumber;
     }


     public String getEmail(){
          return this.email;
     }
      public void setEmail(String email){
          this.email = email;
     }


     public String getCode(){
          return this.code;
     }
      public void setCode(String code){
          this.code = code;
     }


     public String getFirsttName(){
          return this.firsttName;
     }
      public void setFirsttName(String firsttName){
          this.firsttName = firsttName;
     }


     public String getId(){
          return this.id;
     }
      public void setId(String id){
          this.id = id;
     }



      public String getCreatedMax(){
          return this.createdMax;
     }
     
      public String getCreatedMin(){
          return this.createdMin;
     }

     public void setCreatedMax(String createdMax){
          this.createdMax = createdMax;
     }

     public void setCreatedMin(String createdMin){
          this.createdMin = createdMin;
     }
     
     
     

      public RoleVo getAuthorityVo(){
          return this.authorityVo;
     }
       
     public void setAuthorityVo(RoleVo authorityVo){
          this.authorityVo = authorityVo;
     }
   
      public DeliveryTypeVo getDeliveryTypeVo(){
          return this.deliveryTypeVo;
     }
       
     public void setDeliveryTypeVo(DeliveryTypeVo deliveryTypeVo){
          this.deliveryTypeVo = deliveryTypeVo;
     }
   
      public UserVo getSuperAdminVo(){
          return this.superAdminVo;
     }
       
     public void setSuperAdminVo(UserVo superAdminVo){
          this.superAdminVo = superAdminVo;
     }
   
      public CityVo getCityVo(){
          return this.cityVo;
     }
       
     public void setCityVo(CityVo cityVo){
          this.cityVo = cityVo;
     }
   




}