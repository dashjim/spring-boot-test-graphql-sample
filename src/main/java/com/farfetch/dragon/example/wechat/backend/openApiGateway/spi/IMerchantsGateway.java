package com.farfetch.dragon.example.wechat.backend.openApiGateway.spi;

/**
 * Created by jim.ji@farfetch.com on 2017/10/2.
 */
public interface IMerchantsGateway {
    String getMerchantsById (String id );
    String getMerchantsLocationsById (String id);

}
