package ma.zs.generated.ws.rest.provided.facade;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zs.generated.bean.Product;
import ma.zs.generated.service.facade.ProductService;
import ma.zs.generated.ws.rest.provided.converter.ProductConverter;
import ma.zs.generated.ws.rest.provided.vo.ProductVo;

@Api("Manages product services")
@RestController
@RequestMapping("generated/product")
public class ProductRest {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductConverter productConverter;

    @ApiOperation("Saves the specified product")
    @PostMapping("/")
    public ProductVo save(@RequestBody ProductVo productVo) {
        Product product = productConverter.toItem(productVo);
        product = productService.save(product);
        return productConverter.toVo(product);
    }

    @ApiOperation("Delete the specified product")
    @DeleteMapping("/")
    public int delete(@RequestBody ProductVo productVo) {
        Product product = productConverter.toItem(productVo);
        return productService.delete(product);
    }

    @ApiOperation("Updates the specified product")
    @PutMapping("/")
    public ProductVo update(@RequestBody ProductVo productVo) {
        Product product = productConverter.toItem(productVo);
        product = productService.update(product);
        return productConverter.toVo(product);
    }

    @ApiOperation("Finds a list of all products")
    @GetMapping("/")
    public List<ProductVo> findAll() {
        productConverter.setOrderLines(false);
        return productConverter.toVo(productService.findAll());
    }

    @ApiOperation("Finds a product by id")
    @GetMapping("/id/{id}")
    public ProductVo findById(@PathVariable Long id) {
        return productConverter.toVo(productService.findById(id));
    }

    @ApiOperation("Deletes a product by id")
    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }

    @ApiOperation("Finds a  product by reference")
    @GetMapping("/reference/{reference}")
    public ProductVo findByReference(@PathVariable String reference) {
        return productConverter.toVo(productService.findByReference(reference));
    }

    @ApiOperation("Finds a  product by label")
    @GetMapping("/label/{label}")
    public ProductVo findByLabel(@PathVariable String label) {
        return productConverter.toVo(productService.findByLabel(label));
    }

    @ApiOperation("Deletes a  product by reference")
    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return productService.deleteByReference(reference);
    }


    @ApiOperation("Search product by a specific criterion")
    @PostMapping("/search")
    public List<ProductVo> findByCriteria(@RequestBody ProductVo productVo) {
        return productConverter.toVo(productService.findByCriteria(productVo));
    }


    @ApiOperation("Search top 5 products in a period")
    @GetMapping("/top5/startDate/{start}/endDate/{end}")
    public List<ProductVo> findTopfiveProduct(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date start,
                                              @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date end) {
        return productService.findTopfiveProduct(start, end);
    }

    @ApiOperation("Search product statistics in period")
    @GetMapping("/statistics/startDate/{start}/endDate/{end}")
    public List<ProductVo> findProductStatistics(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date start,
                                                 @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date end) {
        return productService.findProductStatistics(
                new Date(start.getTime() + 1 * 24 * 3600 * 1000l),
                new Date(end.getTime() + 1 * 24 * 3600 * 1000l)
        );
    }

    @ApiOperation("Search product statistics in period updated")
    @GetMapping("/statistics/period/{period}")
    public List<ProductVo> findProductStatisticsByPeriod(@PathVariable String period) {
        return productService.findProductStatisticsByPeriod(period);
    }


    public ProductConverter getProductConverter() {
        return productConverter;
    }

    public void setProductConverter(ProductConverter productConverter) {
        this.productConverter = productConverter;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


}
