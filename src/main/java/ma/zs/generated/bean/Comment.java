package ma.zs.generated.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String message;


     @ManyToOne
     private User user;
     private Date dateComment;

     @ManyToOne
     private Command command;

     public Comment() {
          super();
     }

     public Long getId() {
          return this.id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public User getUser() {
          return this.user;
     }

     public void setUser(User user) {
          this.user = user;
     }

     public Command getCommand() {
          return this.command;
     }

     public void setCommand(Command command) {
          this.command = command;
     }

     public Date getDateComment() {
          return this.dateComment;
     }

     public void setDateComment(Date dateComment) {
          this.dateComment = dateComment;
     }

     public String getMessage() {
          return this.message;
     }

     public void setMessage(String message) {
          this.message = message;
     }


}

