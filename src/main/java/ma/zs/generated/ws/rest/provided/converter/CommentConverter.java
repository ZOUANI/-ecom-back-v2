package ma.zs.generated.ws.rest.provided.converter;

import ma.zs.generated.util.DateUtil;
import ma.zs.generated.util.NumberUtil;
import ma.zs.generated.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.zs.generated.bean.Comment;
import ma.zs.generated.ws.rest.provided.vo.CommentVo;

@Component
public class CommentConverter extends AbstractConverter<Comment, CommentVo> {

    @Autowired
    private CommandConverter commandConverter;
    @Autowired
    private UserConverter userConverter;
    private Boolean command;
    private Boolean user;

    public CommentConverter() {
        init(true);
    }

    @Override
    public Comment toItem(CommentVo vo) {
        if (vo == null) {
            return null;
        } else {
            Comment item = new Comment();
            if (StringUtil.isNotEmpty(vo.getMessage()))
                item.setMessage(vo.getMessage());
            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));
            if (vo.getCommandVo() != null && this.command)
                item.setCommand(commandConverter.toItem(vo.getCommandVo()));
            if (vo.getUserVo() != null && this.user)
                item.setUser(userConverter.toItem(vo.getUserVo()));
            if (StringUtil.isNotEmpty(vo.getDateComment()))
                item.setDateComment(DateUtil.parse(vo.getDateComment()));

            return item;
        }
    }

    @Override
    public CommentVo toVo(Comment item) {
        if (item == null) {
            return null;
        } else {
            CommentVo vo = new CommentVo();

            if (StringUtil.isNotEmpty(item.getMessage()))
                vo.setMessage(item.getMessage());

            if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));
            if (item.getCommand() != null && this.command) {
                vo.setCommandVo(commandConverter.toVo(item.getCommand()));
            }
            if (item.getUser() != null && this.user) {
                vo.setUserVo(userConverter.toVo(item.getUser()));
                ;
            }
            if (item.getDateComment() != null)
                vo.setDateComment(DateUtil.formateDate(item.getDateComment()));

            return vo;

        }
    }

    public void init(Boolean value) {
        command = value;
        user = value;
    }


    public CommandConverter getCommandConverter() {
        return this.commandConverter;
    }

    public void setCommandConverter(CommandConverter commandConverter) {
        this.commandConverter = commandConverter;
    }

    public boolean isCommand() {
        return this.command;
    }

    public void setCommand(boolean command) {
        this.command = command;
    }

    public UserConverter getUserConverter() {
        return this.userConverter;
    }

    public void setUserConverter(UserConverter userConverter) {
        this.userConverter = userConverter;
    }

    public boolean isUser() {
        return this.user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }


}