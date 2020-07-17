package ma.zs.generated.ws.rest.provided.converter;

import ma.zs.generated.util.DateUtil;
import ma.zs.generated.util.ListUtil;
import ma.zs.generated.util.NumberUtil;
import ma.zs.generated.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.zs.generated.bean.Command;
import ma.zs.generated.ws.rest.provided.vo.CommandVo;

@Component
public class CommandConverter extends AbstractConverter<Command, CommandVo> {

    @Autowired
    private CommentConverter commentConverter;
    @Autowired
    private UserConverter userConverter;
    @Autowired
    private OrderLineConverter orderLineConverter;
    @Autowired
    private DeliveryCostConverter deliveryCostConverter;
    @Autowired
    private CityConverter cityConverter;
    @Autowired
    private OrderStatusConverter orderStatusConverter;
    @Autowired
    private ClientConverter clientConverter;
    @Autowired
    private CommandeAccessConverter commandeAccessConverter;
    private Boolean validator;
    private Boolean delivery;
    private Boolean deliveryCost;
    private Boolean orderStatus;
    private Boolean city;
    private Boolean admin;
    private Boolean client;
    private Boolean orderLines;
    private Boolean comments;
    private Boolean commandeAccesses;

    public CommandConverter() {
        init(true);
    }

    @Override
    public Command toItem(CommandVo vo) {
        if (vo == null) {
            return null;
        } else {
            Command item = new Command();
            if (StringUtil.isNotEmpty(vo.getRemarque()))
                item.setRemarque(vo.getRemarque());
            if (StringUtil.isNotEmpty(vo.getTotal()))
                item.setTotal(NumberUtil.toBigDecimal(vo.getTotal()));
            if (StringUtil.isNotEmpty(vo.getAdress()))
                item.setAdress(vo.getAdress());
            if (StringUtil.isNotEmpty(vo.getOrderDate()))
                item.setOrderDate(DateUtil.parse(vo.getOrderDate()));
            if (StringUtil.isNotEmpty(vo.getRegulationDate()))
                item.setRegulationDate(DateUtil.parse(vo.getRegulationDate()));
            if (StringUtil.isNotEmpty(vo.getReference()))
                item.setReference(vo.getReference());
            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));
            if (vo.getValidatorVo() != null && this.validator)
                item.setValidator(userConverter.toItem(vo.getValidatorVo()));
            if (vo.getDeliveryVo() != null && this.delivery)
                item.setDelivery(userConverter.toItem(vo.getDeliveryVo()));
            if (vo.getDeliveryCostVo() != null && this.deliveryCost)
                item.setDeliveryCost(deliveryCostConverter.toItem(vo.getDeliveryCostVo()));
            if (vo.getOrderStatusVo() != null && this.orderStatus)
                item.setOrderStatus(orderStatusConverter.toItem(vo.getOrderStatusVo()));
            if (vo.getCityVo() != null && this.city)
                item.setCity(cityConverter.toItem(vo.getCityVo()));
            if (vo.getAdminVo() != null && this.admin)
                item.setAdmin(userConverter.toItem(vo.getAdminVo()));
            if (vo.getClientVo() != null && this.client)
                item.setClient(clientConverter.toItem(vo.getClientVo()));

            if (ListUtil.isNotEmpty(vo.getOrderLinesVo()) && this.orderLines)
                item.setOrderLines(orderLineConverter.toItem(vo.getOrderLinesVo()));


            if (ListUtil.isNotEmpty(vo.getCommentsVo()) && this.comments)
                item.setComments(commentConverter.toItem(vo.getCommentsVo()));


            if (ListUtil.isNotEmpty(vo.getCommandeAccessesVo()) && this.commandeAccesses)
                item.setCommandeAccesses(commandeAccessConverter.toItem(vo.getCommandeAccessesVo()));

            if (StringUtil.isNotEmpty(vo.getNbrTotalComment()))
                item.setNbrTotalComment(NumberUtil.toInt(vo.getNbrTotalComment()));

            if (StringUtil.isNotEmpty(vo.getDateCommentResolution()))
                item.setDateCommentResolution(DateUtil.parse(vo.getDateCommentResolution()));

            if (StringUtil.isNotEmpty(vo.getCommentResolution()))
                item.setCommentResolution(NumberUtil.toBoolean(vo.getCommentResolution()));


            return item;
        }
    }

    @Override
    public CommandVo toVo(Command item) {
        if (item == null) {
            return null;
        } else {
            CommandVo vo = new CommandVo();

            if (StringUtil.isNotEmpty(item.getRemarque()))
                vo.setRemarque(item.getRemarque());

            if (item.getTotal() != null)
                vo.setTotal(NumberUtil.toString(item.getTotal()));
            if (StringUtil.isNotEmpty(item.getAdress()))
                vo.setAdress(item.getAdress());

            if (item.getOrderDate() != null)
                vo.setOrderDate(DateUtil.formateDate(item.getOrderDate()));
            if (item.getRegulationDate() != null)
                vo.setRegulationDate(DateUtil.formateDate(item.getRegulationDate()));
            if (StringUtil.isNotEmpty(item.getReference()))
                vo.setReference(item.getReference());

            if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));
            if (item.getValidator() != null && this.validator) {
                vo.setValidatorVo(userConverter.toVo(item.getValidator()));
            }
            if (item.getDelivery() != null && this.delivery) {
                vo.setDeliveryVo(userConverter.toVo(item.getDelivery()));
            }
            if (item.getDeliveryCost() != null && this.deliveryCost) {
                vo.setDeliveryCostVo(deliveryCostConverter.toVo(item.getDeliveryCost()));
            }
            if (item.getOrderStatus() != null && this.orderStatus) {
                vo.setOrderStatusVo(orderStatusConverter.toVo(item.getOrderStatus()));
            }
            if (item.getCity() != null && this.city) {
                vo.setCityVo(cityConverter.toVo(item.getCity()));
            }
            if (item.getAdmin() != null && this.admin) {
                vo.setAdminVo(userConverter.toVo(item.getAdmin()));
            }
            if (item.getClient() != null && this.client) {
                vo.setClientVo(clientConverter.toVo(item.getClient()));
            }
            if (ListUtil.isNotEmpty(item.getOrderLines()) && this.orderLines) {

                orderLineConverter.init(false);
                vo.setOrderLinesVo(orderLineConverter.toVo(item.getOrderLines()));
                orderLineConverter.init(true);
            }
            if (ListUtil.isNotEmpty(item.getComments()) && this.comments) {

                commentConverter.init(false);
                vo.setCommentsVo(commentConverter.toVo(item.getComments()));
                commentConverter.init(true);
            }
            if (ListUtil.isNotEmpty(item.getCommandeAccesses()) && this.commandeAccesses) {

                commandeAccessConverter.init(false);
                vo.setCommandeAccessesVo(commandeAccessConverter.toVo(item.getCommandeAccesses()));
                commandeAccessConverter.init(true);
            }

			if(item.getCommentResolution() != null)
				vo.setCommentResolution(NumberUtil.toString(item.getCommentResolution()));

			if (item.getDateCommentResolution() != null)
				vo.setDateCommentResolution(DateUtil.formateDate(item.getDateCommentResolution()));

			if (true ){
			    vo.setNbrTotalComment(NumberUtil.toString(item.getNbrTotalComment()));
            }

            return vo;

        }
    }

    public void init(Boolean value) {
        validator = value;
        delivery = value;
        deliveryCost = value;
        orderStatus = value;
        city = value;
        admin = value;
        client = value;
        orderLines = value;
        comments = value;
        commandeAccesses = value;
    }


    public CommentConverter getCommentConverter() {
        return this.commentConverter;
    }

    public void setCommentConverter(CommentConverter commentConverter) {
        this.commentConverter = commentConverter;
    }

    public UserConverter getUserConverter() {
        return this.userConverter;
    }

    public void setUserConverter(UserConverter userConverter) {
        this.userConverter = userConverter;
    }

    public OrderLineConverter getOrderLineConverter() {
        return this.orderLineConverter;
    }

    public void setOrderLineConverter(OrderLineConverter orderLineConverter) {
        this.orderLineConverter = orderLineConverter;
    }

    public DeliveryCostConverter getDeliveryCostConverter() {
        return this.deliveryCostConverter;
    }

    public void setDeliveryCostConverter(DeliveryCostConverter deliveryCostConverter) {
        this.deliveryCostConverter = deliveryCostConverter;
    }

    public CityConverter getCityConverter() {
        return this.cityConverter;
    }

    public void setCityConverter(CityConverter cityConverter) {
        this.cityConverter = cityConverter;
    }

    public OrderStatusConverter getOrderStatusConverter() {
        return this.orderStatusConverter;
    }

    public void setOrderStatusConverter(OrderStatusConverter orderStatusConverter) {
        this.orderStatusConverter = orderStatusConverter;
    }

    public ClientConverter getClientConverter() {
        return this.clientConverter;
    }

    public void setClientConverter(ClientConverter clientConverter) {
        this.clientConverter = clientConverter;
    }

    public CommandeAccessConverter getCommandeAccessConverter() {
        return this.commandeAccessConverter;
    }

    public void setCommandeAccessConverter(CommandeAccessConverter commandeAccessConverter) {
        this.commandeAccessConverter = commandeAccessConverter;
    }

    public boolean isValidator() {
        return this.validator;
    }

    public void setValidator(boolean validator) {
        this.validator = validator;
    }

    public boolean isDelivery() {
        return this.delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public boolean isDeliveryCost() {
        return this.deliveryCost;
    }

    public void setDeliveryCost(boolean deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public boolean isOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public boolean isCity() {
        return this.city;
    }

    public void setCity(boolean city) {
        this.city = city;
    }

    public boolean isAdmin() {
        return this.admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isClient() {
        return this.client;
    }

    public void setClient(boolean client) {
        this.client = client;
    }

    public Boolean isOrderLines() {
        return this.orderLines;
    }

    public void setOrderLines(Boolean orderLines) {
        this.orderLines = orderLines;
    }

    public Boolean isComments() {
        return this.comments;
    }

    public void setComments(Boolean comments) {
        this.comments = comments;
    }

    public Boolean isCommandeAccesses() {
        return this.commandeAccesses;
    }

    public void setCommandeAccesses(Boolean commandeAccesses) {
        this.commandeAccesses = commandeAccesses;
    }
}