package com.farfetch.dragon.example.wechat.backend.domain.service;

import com.farfetch.dragon.example.wechat.backend.openApiGateway.spi.IProductsGateway;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by jim.ji@farfetch.com on 2017/10/3.
 */
@Service
public class ProductService implements IProductService{

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);
    private IProductsGateway productsGateway;

    @Autowired
    public ProductService(IProductsGateway productGateway) {
        this.productsGateway = productGateway;
    }

    @Override
    public ProductDomain getProductsById(String id) {

        LOGGER.trace("product id is {}, is empty? {}", id, StringUtils.isEmpty(id));

        if(StringUtils.isEmpty(id)) throw new IllegalArgumentException();
        String jsonString = productsGateway.getProductsById(id);
        ReadContext ctx = JsonPath.parse(jsonString);

        ProductDomain productDomain = new ProductDomain();

        productDomain.setProductJsonRaw(jsonString);
        productDomain.setId(""+ctx.read("$.id"));
        productDomain.setShortDescription(ctx.read("$.shortDescription"));
        productDomain.setImages(ctx.read("$.images.images[?(@.size == 300)]"));

        return productDomain;
    }

    @Override
    public String getProductsMeasurementsById(String id) {
        return null;
    }

    @Override
    public String getProductsOutfitsById(String id) {
        return null;
    }
}
