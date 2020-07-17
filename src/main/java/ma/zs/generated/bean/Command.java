package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.OneToMany;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;   
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.User;
import ma.zs.generated.bean.User;
import ma.zs.generated.bean.DeliveryCost;
import ma.zs.generated.bean.OrderStatus;
import ma.zs.generated.bean.City;
import ma.zs.generated.bean.User;
import ma.zs.generated.bean.Client;

@Entity
public class Command {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String remarque ;
     private BigDecimal total ;
     private String adress ;
     @JsonFormat(pattern="yyyy-MM-dd")
     @Temporal(TemporalType.DATE)
     private Date orderDate ;
     @JsonFormat(pattern="yyyy-MM-dd")
     @Temporal(TemporalType.DATE)
     private Date regulationDate ;
     private String reference ;
     private int day;
     private int month;
     private int year;
     @ManyToOne
	private User validator ;
     @ManyToOne
	private User delivery ;
     @ManyToOne
	private DeliveryCost deliveryCost ;
     @ManyToOne
	private OrderStatus orderStatus ;
     @ManyToOne
	private City city ;
     @ManyToOne
	private User admin ;
     @ManyToOne
	private Client client ;
     @OneToMany(mappedBy = "command")
     private List<OrderLine> orderLines ;
     @OneToMany(mappedBy = "command")
     private List<Comment> comments ;
     @OneToMany(mappedBy = "command")
     private List<CommandeAccess> commandeAccesses ;
    private int nbrTotalComment = 0;
    private Boolean commentResolution = false;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateCommentResolution;


     public Command(){
       super();
     }

     public Long getId(){
          return this.id;
     }
     public void setId(Long id){
          this.id = id;
     }
     public String getReference(){
          return this.reference;
     }
     public void setReference(String reference){
          this.reference = reference;
     }
     public Date getOrderDate(){
          return this.orderDate;
     }
     public void setOrderDate(Date orderDate){
          this.orderDate = orderDate;
     }
     public Date getRegulationDate(){
          return this.regulationDate;
     }
     public void setRegulationDate(Date regulationDate){
          this.regulationDate = regulationDate;
     }
     public BigDecimal getTotal(){
          return this.total;
     }
     public void setTotal(BigDecimal total){
          this.total = total;
     }
     public OrderStatus getOrderStatus(){
          return this.orderStatus;
     }
     public void setOrderStatus(OrderStatus orderStatus){
          this.orderStatus = orderStatus;
     }
     public Client getClient(){
          return this.client;
     }
     public void setClient(Client client){
          this.client = client;
     }
     public User getAdmin(){
          return this.admin;
     }
     public void setAdmin(User admin){
          this.admin = admin;
     }
     public User getDelivery(){
          return this.delivery;
     }
     public void setDelivery(User delivery){
          this.delivery = delivery;
     }
     public User getValidator(){
          return this.validator;
     }
     public void setValidator(User validator){
          this.validator = validator;
     }
     public List<OrderLine> getOrderLines(){
          return this.orderLines;
     }
     public void setOrderLines(List<OrderLine> orderLines){
          this.orderLines = orderLines;
     }
     public String getRemarque(){
          return this.remarque;
     }
     public void setRemarque(String remarque){
          this.remarque = remarque;
     }
     public String getAdress(){
          return this.adress;
     }
     public void setAdress(String adress){
          this.adress = adress;
     }
     public City getCity(){
          return this.city;
     }
     public void setCity(City city){
          this.city = city;
     }
     public DeliveryCost getDeliveryCost(){
          return this.deliveryCost;
     }
     public void setDeliveryCost(DeliveryCost deliveryCost){
          this.deliveryCost = deliveryCost;
     }
     public List<CommandeAccess> getCommandeAccesses(){
          return this.commandeAccesses;
     }
     public void setCommandeAccesses(List<CommandeAccess> commandeAccesses){
          this.commandeAccesses = commandeAccesses;
     }

     public int getDay() {
          return day;
     }

     public void setDay(int day) {
          this.day = day;
     }

     public int getMonth() {
          return month;
     }

     public void setMonth(int month) {
          this.month = month;
     }

     public int getYear() {
          return year;
     }

     public void setYear(int year) {
          this.year = year;
     }

     public List<Comment> getComments(){
          return this.comments;
     }
     public void setComments(List<Comment> comments){
          this.comments = comments;
     }

    public int getNbrTotalComment() {
        return nbrTotalComment;
    }

    public void setNbrTotalComment(int nbrTotalComment) {
        this.nbrTotalComment = nbrTotalComment;
    }

    public Boolean getCommentResolution() {
        return commentResolution;
    }

    public void setCommentResolution(Boolean commentResolution) {
        this.commentResolution = commentResolution;
    }

    public Date getDateCommentResolution() {
        return dateCommentResolution;
    }

    public void setDateCommentResolution(Date dateCommentResolution) {
        this.dateCommentResolution = dateCommentResolution;
    }
}

