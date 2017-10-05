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
    public MerchantDAO getMerchantsById(String id) {

        final MerchantDAO merchantDAO = new MerchantDAO();
        final String merchantJson = merchantsGateway.getMerchantsById(id);

        final DocumentContext parsed = JsonPath.parse(merchantJson);
        merchantDAO.setJsonRaw(merchantJson);
        merchantDAO.setId(parsed.read("$.id"));
        merchantDAO.setImages(parsed.read("$.images[?(@.size == 'medium')]"));
        merchantDAO.setCountry(parsed.read("$.address.country.name")); // 意大利
        merchantDAO.setDescription(parsed.read("$.description"));
        merchantDAO.setName(parsed.read("$.name"));
        merchantDAO.setType(parsed.read("$.Boutique"));

        return merchantDAO;
    }

    @Override
    public getMerchantsLocationDAO getMerchantsLocationsById(String id) {
        // TODO
        return null;
    }
}
