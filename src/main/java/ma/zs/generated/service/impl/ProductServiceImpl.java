package ma.zs.generated.service.impl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Collectors;

import ma.zs.generated.bean.Command;
import ma.zs.generated.util.SearchUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.zs.generated.bean.Product;
import ma.zs.generated.bean.OrderLine;
import ma.zs.generated.dao.ProductDao;
import ma.zs.generated.service.facade.ProductService;
import ma.zs.generated.service.facade.OrderLineService;
import ma.zs.generated.ws.rest.provided.vo.ProductVo;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private OrderLineService orderLinesService;
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Product findByReference(String reference) {
        return productDao.findByReference(reference);
    }

    @Override
    @Transactional
    public int deleteByReference(String reference) {
        return productDao.deleteByReference(reference);
    }

    @Override
    public Product findById(Long id) {
        return productDao.getOne(id);
    }

    @Transactional
    public void deleteById(Long id) {
        productDao.deleteById(id);
    }

    @Override
    public Product save(Product product) {

        Product foundedProduct = findByLabel(product.getLabel());
        if (foundedProduct != null)
            return null;

        Product savedProduct = productDao.save(product);

        return savedProduct;
    }

    @Override
    public List<Product> save(List<Product> products) {
        List<Product> list = new ArrayList<Product>();
        for (Product product : products) {
            list.add(save(product));
        }
        return list;
    }

    private List<OrderLine> prepareOrderLines(Product product, List<OrderLine> orderLines) {
        for (OrderLine orderLine : orderLines) {
            orderLine.setProduct(product);
        }
        return orderLines;
    }

    @Override
    public Product update(Product product) {


        Product foundedProduct = findById(product.getId());
        if (foundedProduct == null)
            return null;

        return productDao.save(product);

    }

    @Override
    @Transactional
    public int delete(Product product) {

        if (product.getReference() == null)
            return -1;

        Product foundedProduct = findByReference(product.getReference());
        if (foundedProduct == null)
            return -1;
        productDao.delete(foundedProduct);
        return 1;
    }


    public List<Product> findByCriteria(ProductVo productVo) {
        String query = "SELECT o FROM Product o where 1=1 ";
        query += SearchUtil.addConstraint("o", "size", "LIKE", productVo.getSize());

        query += SearchUtil.addConstraint("o", "qteStock", "=", productVo.getQteStock());
        query += SearchUtil.addConstraint("o", "label", "LIKE", productVo.getLabel());

        query += SearchUtil.addConstraint("o", "price", "=", productVo.getPrice());
        query += SearchUtil.addConstraint("o", "weight", "=", productVo.getWeight());
        query += SearchUtil.addConstraint("o", "reference", "LIKE", productVo.getReference());

        query += SearchUtil.addConstraint("o", "id", "=", productVo.getId());
        query += SearchUtil.addConstraint("o", "color", "LIKE", productVo.getColor());

        query += SearchUtil.addConstraintMinMax("o", "qteStock", productVo.getQteStockMin(), productVo.getQteStockMax());
        query += SearchUtil.addConstraintMinMax("o", "price", productVo.getPriceMin(), productVo.getPriceMax());
        query += SearchUtil.addConstraintMinMax("o", "weight", productVo.getWeightMin(), productVo.getWeightMax());
        return entityManager.createQuery(query).getResultList();
    }


    @Override
    public List<ProductVo> findProductStatistics(Date start, Date end) {
        System.out.println("start date => " + start);
        System.out.println("end date => " + end);
        List<OrderLine> ortOrderLines = orderLinesService.findOrdersLineBetween(start, end);
        if (ortOrderLines.isEmpty() | ortOrderLines == null) {
            return null;
        }
        List<ProductVo> productVoList = new ArrayList<>();
        ortOrderLines.stream().collect(Collectors.groupingBy(OrderLine::getProduct)).forEach((product, orderLines) -> {
            ProductVo productVo = new ProductVo("", (long) 0, (long) 0, (long) 0, (long) 0);
            productVo.setLabel(product.getLabel());
            productVo.setTotalCommands((long) orderLines.size());
            orderLines.forEach(orderLine -> {
                Command command = orderLine.getCommand();
                if (command.getOrderStatus().getSuperOrderStatus().getCode().equalsIgnoreCase("confirmed")) {
                    productVo.setTotalAmountConfirmed(productVo.getTotalAmountConfirmed() + 1);

                } else if (command.getOrderStatus().getSuperOrderStatus().getCode().equalsIgnoreCase("delivered")) {
                    productVo.setTotalAmountDelivered(productVo.getTotalAmountDelivered() + 1);

                } else if (command.getOrderStatus().getCode().equalsIgnoreCase("sendCanceled")) {
                    productVo.setTotalCommandsReturned(productVo.getTotalCommandsReturned() + 1);
                }
            });
            productVoList.add(productVo);
        });
        return productVoList;
    }

    @Override
    public List<ProductVo> findTopfiveProduct(Date start, Date end) {
        List<ProductVo> productVos = productDao.findTopfiveProduct(start, end);
        if (productVos.size() < 5) {
            return productVos.subList(0, productVos.size());
        }
        return productVos.subList(0, 5);
    }

    @Override
    public Product findByLabel(String label) {
        return productDao.findByLabel(label);
    }

    @Override
    public Product savePlainProduct(Product product) {
        return productDao.save(product);
    }

    @Override
    public List<ProductVo> findProductStatisticsByPeriod(String period) {

        if (period.equals("TODAY")) {
            return findProductStatistics(new Date(), new Date());
        } else if (period.equals("YESTERDAY")) {
            return findProductStatistics(
                    new Date(new Date().getTime() - 1 * 24 * 3600 * 1000l),
                    new Date(new Date().getTime() - 1 * 24 * 3600 * 1000l)
            );
        } else if (period.equals("LAST_7_DAYS")) {
            return findProductStatistics(
                    new Date(new Date().getTime() - 7 * 24 * 3600 * 1000l),
                    new Date()
            );
        } else if (period.equals("LAST_14_DAYS")) {
            return findProductStatistics(
                    new Date(new Date().getTime() - 14 * 24 * 3600 * 1000l),
                    new Date()
            );
        } else if (period.equals("LAST_30_DAYS")) {
            return findProductStatistics(
                    new Date(new Date().getTime() - 30 * 24 * 3600 * 1000l),
                    new Date()
            );
        } else if (period.equals("THIS_WEEK")) {
            LocalDate now = LocalDate.now();
            TemporalField fieldISO = WeekFields.of(Locale.FRANCE).dayOfWeek();
            LocalDate ld = now.with(fieldISO, 1);
            Date date = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());

            return findProductStatistics(
                    date,
                    new Date()
            );
        } else if (period.equals("THIS_MONTH")) {
            LocalDate now = LocalDate.now();
            LocalDate ld = now.withDayOfMonth(1);
            Date date = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
            return findProductStatistics(
                    date,
                    new Date()
            );
        }
//        else if (period.equals("LAST_WEEK")) {
//            return null;
//        } else if (period.equals("LAST_MONTH")) {
//            return null;
//        }
        else {
            return null;
        }
    }

}
