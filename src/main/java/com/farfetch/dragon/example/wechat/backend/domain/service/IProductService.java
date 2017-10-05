package com.farfetch.dragon.example.wechat.backend.domain.service;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by jim.ji@farfetch.com on 2017/10/3.
 */
public interface IProductService {
    ProductDomain getProductsById(String id);
    String getProductsMeasurementsById(String id);
    String getProductsOutfitsById(String id);

    @Data
    class ProductDomain{
        String id;
        String description;
        String shortDescription;
        String gender;

        String Size;
        String Scale;

        String currencyIsoCode;
        String priceExclTaxes;
        String priceInclTaxes;
        String taxesValue;
        String tags; // DDP

        String quantity;
        String availableAt;

        String merchantId;

        List<Map<String, String>> images;

    }
}
