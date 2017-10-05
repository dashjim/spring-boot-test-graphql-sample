package com.farfetch.dragon.example.wechat.backend.domain.service;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by jim.ji@farfetch.com on 2017/10/5.
 *
 */
public interface IMerchantService {

    MerchantDAO getMerchantsById (String id );
    getMerchantsLocationDAO getMerchantsLocationsById (String id);
}

@Data
class getMerchantsLocationDAO{
    String jsonRaw;
    String id;

    String merchantId;
    String merchantName;
    String isReturnsInStoreAllowed;
    String zipCode;
    String phone;
}

@Data
class MerchantDAO {

    String jsonRaw;

    String id;
    String name;
    String description; // Chinese
    String type;
    String country;
    List<Map<String, String>> images;
}