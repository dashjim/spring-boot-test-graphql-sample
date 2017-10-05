package com.farfetch.dragon.example.wechat.backend.domain.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by jim.ji@farfetch.com on 2017/10/5.
 *
 */
public class MerchantServiceTest extends SpringBootTestParent{

    @Autowired
    private MerchantService merchantService;

    @Test
    public void getMerchantWhenIdIsGivenShouldReturn(){

        final MerchantDomain merchantDomain = merchantService.getMerchantsById("anything");
        assertNotNull(merchantDomain);
        assertThat("意大利", equalTo(merchantDomain.getCountry()));

    }
}