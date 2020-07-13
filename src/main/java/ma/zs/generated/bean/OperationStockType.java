package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class OperationStockType {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String label ;
     private Long code ;


     public OperationStockType(){
       super();
     }

     public Long getId(){
          return this.id;
     }
     public void setId(Long id){
          this.id = id;
     }
     public String getLabel(){
          return this.label;
     }
     public void setLabel(String label){
          this.label = label;
     }
     public Long getCode(){
          return this.code;
     }
     public void setCode(Long code){
          this.code = code;
     }



}

