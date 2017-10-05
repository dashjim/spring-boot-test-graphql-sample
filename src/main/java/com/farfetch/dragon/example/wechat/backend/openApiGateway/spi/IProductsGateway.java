package com.farfetch.dragon.example.wechat.backend.openApiGateway.spi;

/**
 * Created by jim.ji@farfetch.com on 2017/10/2.
 */
public interface IProductsGateway {

    String getProductsById(String id);
    String getProductsMeasurementsById(String id);
    String getProductsOutfitsById(String id);

}
