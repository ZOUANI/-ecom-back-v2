package ma.zs.generated.service.facade;

import java.util.Date;
import java.util.List;
import ma.zs.generated.bean.OrderLine;
import ma.zs.generated.ws.rest.provided.vo.OrderLineVo;
import ma.zs.generated.ws.rest.provided.vo.ProductVo;
import org.springframework.data.repository.query.Param;

public interface OrderLineService {

    /**
     *
     * find all OrderLine in database
     *
     * @return List<OrderLine> , If database is empty return null.
     */
    List<OrderLine> findAll();

    /**
     * find OrderLine from database by id (id)
     *
     * @param id - id of OrderLine
     * @return the founded OrderLine , If no OrderLine were found in database return
     *         null.
     */
    OrderLine findById(Long id);

    void deleteById(Long id);

    List<OrderLine> findByProductReference(String reference);

    int deleteByProductReference(String reference);

    List<OrderLine> findByProductId(Long id);

    int deleteByProductId(Long id);

    List<OrderLine> findByCommandReference(String reference);

    int deleteByCommandReference(String reference);

    List<OrderLine> findByCommandId(Long id);

    int deleteByCommandId(Long id);

    /**
     * save OrderLine in database
     *
     * @param orderLine - OrderLine to be saved
     * @return the saved OrderLine, If the OrderLine can't be saved return null.
     */
    OrderLine save(Long adminId,OrderLine orderLine);

    /**
     * save list OrderLine in database
     *
     * @param orderLines - list of OrderLine to be saved
     * @return the saved OrderLine list
     */
    List<OrderLine> save(Long adminId,List<OrderLine> orderLines);

    /**
     * update OrderLine in database
     *
     * @param orderLine - OrderLine to be updated
     * @return the updated OrderLine, If the OrderLine can't be updated return null.
     */
    OrderLine update(OrderLine orderLine);

    /**
     * delete OrderLine from database
     *
     * @param orderLine - OrderLine to be deleted
     * @return 1 if OrderLine deleted successfully, If the OrderLine can't be
     *         deleted return negative int
     */
    int delete(OrderLine orderLine);

    /**
     * search for OrderLine in by some criteria
     *
     * @return the searhed list OrderLine
     */
    List<OrderLine> findByCriteria(OrderLineVo orderLineVo);

    /**
     * search for OrderLine between 2 date
     *
     * @return the searhed list OrderLine
     */
    public List<OrderLine> findOrdersLineBetween(Date start, Date end);

    /**
     * save list OrderLine in database
     *
     * @param orderLines - list of OrderLine to be saved
     * @return the saved OrderLine list
     */
    List<OrderLine> savePlainOrderLines(List<OrderLine> prepareOrderLines);

}
