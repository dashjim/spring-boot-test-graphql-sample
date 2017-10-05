package com.farfetch.dragon.example.wechat.backend.domain.service;

import com.farfetch.dragon.example.wechat.backend.openApiGateway.spi.IMerchantsGateway;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jim.ji@farfetch.com on 2017/10/5.
 *
 */
@Service
public class MerchantService implements IMerchantService{

    private IMerchantsGateway merchantsGateway;

    @Autowired
    public MerchantService(IMerchantsGateway merchantsGateway) {
        this.merchantsGateway = merchantsGateway;
    }

    @Override
    public MerchantDomain getMerchantsById(String id) {

        final MerchantDomain merchantDomain = new MerchantDomain();
        final String merchantJson = merchantsGateway.getMerchantsById(id);

        final DocumentContext parsed = JsonPath.parse(merchantJson);
        merchantDomain.setJsonRaw(merchantJson);
        merchantDomain.setId("" + parsed.read("$.id"));
        merchantDomain.setImages(parsed.read("$.images[?(@.size == 'medium')]"));
        merchantDomain.setCountry(parsed.read("$.address.country.name")); // 意大利
        merchantDomain.setDescription(parsed.read("$.description"));
        merchantDomain.setName(parsed.read("$.name"));
        merchantDomain.setType(parsed.read("$.type"));

        return merchantDomain;
    }

    @Override
    public getMerchantsLocationDAO getMerchantsLocationsById(String id) {
        // TODO
        return null;
    }
}
