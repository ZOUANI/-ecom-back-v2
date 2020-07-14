package ma.zs.generated.ws.rest.provided.vo;


import ma.zs.generated.bean.User;

import java.util.Date;

public class CommentVo {

    private String id;
    private String message;
    private UserVo userVo;
    private String dateComment;


    private CommandVo commandVo;


    public CommentVo() {
        super();
    }


    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public CommandVo getCommandVo() {
        return this.commandVo;
    }

    public void setCommandVo(CommandVo commandVo) {
        this.commandVo = commandVo;
    }

    public UserVo getUserVo() {
        return userVo;
    }

    public void setUserVo(UserVo userVo) {
        this.userVo = userVo;
    }

    public String getDateComment() {
        return dateComment;
    }

    public void setDateComment(String dateComment) {
        this.dateComment = dateComment;
    }
}