package com.farfetch.dragon.example.wechat.backend.client.restful;

import com.farfetch.dragon.example.wechat.backend.client.spi.IProductSpi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dashj on 2017/10/2.
 */
@RestController
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    private IProductSpi productSpi;

    @Autowired
    public ProductController(IProductSpi productSpi) {
        this.productSpi = productSpi;
    }

    @GetMapping(path="/v1/products/{pid}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public IProductSpi.ProductDTO getProductsById(@PathVariable String pid) {
        return productSpi.getProductsById(pid);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST) // 400
    @ExceptionHandler(Exception.class)
    public void exceptionHandler(){}
}
