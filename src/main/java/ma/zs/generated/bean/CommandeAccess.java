package ma.zs.generated.bean;

import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import ma.zs.generated.bean.Command;
import ma.zs.generated.bean.User;

@Entity
public class CommandeAccess {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ManyToOne
    private Command command;
    @ManyToOne
    private User validator;

    public CommandeAccess() {
        super();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Command getCommand() {
        return this.command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public User getValidator() {
        return this.validator;
    }

    public void setValidator(User validator) {
        this.validator = validator;
    }


}

