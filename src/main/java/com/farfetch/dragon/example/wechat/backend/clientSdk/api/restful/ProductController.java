package com.farfetch.dragon.example.wechat.backend.clientSdk.api.restful;

import com.farfetch.dragon.example.wechat.backend.clientSdk.spi.IProductController;
import com.farfetch.dragon.example.wechat.backend.domain.service.IProductService;
import com.farfetch.dragon.example.wechat.backend.domain.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sun.rmi.log.ReliableLog;

/**
 * Created by dashj on 2017/10/2.
 */
@RestController
public class ProductController implements IProductController{

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path="/v1/products/{pid}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Override
    public ProductDTO getProductsById(@PathVariable String pid) {

        LOGGER.trace("geting product for {}", pid);
        IProductService.ProductDomain product = productService.getProductsById(pid);

        ProductDTO productDTO = new ProductDTO();

        BeanUtils.copyProperties(product, productDTO);
        return productDTO;
    }



    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    @ExceptionHandler(Exception.class)
    public void exceptionHander(){}
}
