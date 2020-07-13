package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;   
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.OperationStockType;
import ma.zs.generated.bean.City;
import ma.zs.generated.bean.Command;
import ma.zs.generated.bean.User;
import ma.zs.generated.bean.Product;

@Entity
public class OperationStock {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private BigDecimal qteAfterOperation ;
     @JsonFormat(pattern="yyyy-MM-dd")
     @Temporal(TemporalType.DATE)
     private Date dateOperationStock ;
     private BigDecimal qteBeforeOperation ;
     private String description ;
     private BigDecimal qte ;

     @ManyToOne
	private OperationStockType operationStockType ;
     @ManyToOne
	private City city ;
     @ManyToOne
	private Command command ;
     @ManyToOne
	private User admin ;
     @ManyToOne
	private Product product ;

     public OperationStock(){
       super();
     }

     public Long getId(){
          return this.id;
     }
     public void setId(Long id){
          this.id = id;
     }
     public Product getProduct(){
          return this.product;
     }
     public void setProduct(Product product){
          this.product = product;
     }
     public City getCity(){
          return this.city;
     }
     public void setCity(City city){
          this.city = city;
     }
     public User getAdmin(){
          return this.admin;
     }
     public void setAdmin(User admin){
          this.admin = admin;
     }
     public BigDecimal getQte(){
          return this.qte;
     }
     public void setQte(BigDecimal qte){
          this.qte = qte;
     }
     public BigDecimal getQteBeforeOperation(){
          return this.qteBeforeOperation;
     }
     public void setQteBeforeOperation(BigDecimal qteBeforeOperation){
          this.qteBeforeOperation = qteBeforeOperation;
     }
     public BigDecimal getQteAfterOperation(){
          return this.qteAfterOperation;
     }
     public void setQteAfterOperation(BigDecimal qteAfterOperation){
          this.qteAfterOperation = qteAfterOperation;
     }
     public Date getDateOperationStock(){
          return this.dateOperationStock;
     }
     public void setDateOperationStock(Date dateOperationStock){
          this.dateOperationStock = dateOperationStock;
     }
     public String getDescription(){
          return this.description;
     }
     public void setDescription(String description){
          this.description = description;
     }
     public OperationStockType getOperationStockType(){
          return this.operationStockType;
     }
     public void setOperationStockType(OperationStockType operationStockType){
          this.operationStockType = operationStockType;
     }
     public Command getCommand(){
          return this.command;
     }
     public void setCommand(Command command){
          this.command = command;
     }



}

