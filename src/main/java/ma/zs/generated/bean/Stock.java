package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;   
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.User;
import ma.zs.generated.bean.Product;
import ma.zs.generated.bean.City;

@Entity
public class Stock {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private BigDecimal qteRestante ;
     private BigDecimal qteLivre ;
     private BigDecimal qteEnvoye ;

     @ManyToOne
	private User admin ;
     @ManyToOne
	private Product product ;
     @ManyToOne
	private City city ;

     public Stock(){
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
     public BigDecimal getQteRestante(){
          return this.qteRestante;
     }
     public void setQteRestante(BigDecimal qteRestante){
          this.qteRestante = qteRestante;
     }
     public BigDecimal getQteEnvoye(){
          return this.qteEnvoye;
     }
     public void setQteEnvoye(BigDecimal qteEnvoye){
          this.qteEnvoye = qteEnvoye;
     }
     public BigDecimal getQteLivre(){
          return this.qteLivre;
     }
     public void setQteLivre(BigDecimal qteLivre){
          this.qteLivre = qteLivre;
     }



}

