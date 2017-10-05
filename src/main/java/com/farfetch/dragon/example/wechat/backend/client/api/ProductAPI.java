package com.farfetch.dragon.example.wechat.backend.client.api;

import com.farfetch.dragon.example.wechat.backend.client.spi.IProductSpi;
import com.farfetch.dragon.example.wechat.backend.domain.service.IProductService;
import com.farfetch.dragon.example.wechat.backend.domain.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jim.ji@farfetch.com on 2017/10/5.
 *
 */
@Component
public class ProductAPI implements IProductSpi {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductAPI.class);

    private ProductService productService;

    @Autowired
    public ProductAPI(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ProductDTO getProductsById( String pid ) {

        LOGGER.trace("getting product for {}", pid);
        IProductService.ProductDomain product = productService.getProductsById(pid);

        ProductDTO productDTO = new ProductDTO();

        BeanUtils.copyProperties(product, productDTO);
        return productDTO;
    }
}
