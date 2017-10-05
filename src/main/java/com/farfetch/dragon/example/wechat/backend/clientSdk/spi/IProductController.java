package com.farfetch.dragon.example.wechat.backend.clientSdk.spi;

import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

/**
 * Created by jim.ji@farfetch.com on 2017/10/3.
 */
public interface IProductController {

    ProductDTO getProductsById(@PathVariable String pid);

    @Data
    class ProductDTO{

        String ProductJsonRaw;

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
