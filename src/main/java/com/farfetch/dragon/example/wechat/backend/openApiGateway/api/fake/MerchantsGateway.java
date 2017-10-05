package com.farfetch.dragon.example.wechat.backend.openApiGateway.api.fake;

import com.farfetch.dragon.example.wechat.backend.openApiGateway.spi.IMerchantsGateway;
import org.springframework.stereotype.Component;

/**
 * Created by jim.ji@farfetch.com on 2017/10/3.
 *
 */
@Component
public class MerchantsGateway implements IMerchantsGateway {

    @Override
    public String getMerchantsById(String id) {

        return "{\"id\":9306,\"name\":\"Julian Fashion\",\"description\":\"Julian Fashion的热门之处在于其从不关注潮流趋势，也不受潮流摆布，坚持自己的本色，只销售国际轻奢设计师品牌。买手店同时拥有女装、男装及童装三个部门。\",\"type\":\"Boutique\",\"address\":{\"city\":{\"id\":96,\"name\":\"海上米兰\",\"countryId\":0},\"country\":{\"id\":101,\"name\":\"意大利\",\"continentId\":0},\"continent\":{\"id\":3}},\"images\":[{\"order\":0,\"size\":\"small\",\"url\":\"http://cdn-images.farfetch.com/boutiques/9306/PG9306_6_S_1080.jpg\"},{\"order\":0,\"size\":\"medium\",\"url\":\"http://cdn-images.farfetch.com/boutiques/9306/PG9306_5_M_1080.jpg\"},{\"order\":0,\"size\":\"large\",\"url\":\"http://cdn-images.farfetch.com/boutiques/9306/PG9306_5_L_1080.jpg\"},{\"order\":0,\"size\":\"detail\",\"url\":\"http://cdn-images.farfetch.com/boutiques/9306/PG9306_3_Detail_1080.jpg\"}],\"availableGender\":\"Both\",\"genders\":\"Women, Men, Kids\",\"brandsLookOut\":[\"Dolce & Gabbana\",\"Junya Watanabe\",\"Rick Owens\",\"Stella McCartney\",\"Sergio Rossi\",\"Giuseppe Zanotti\",\"Ann Demeulemeester\",\"Comme des Garçons\",\"Moschino\",\"Balmain\",\"Emilio Pucci\",\"Fausto Puglisi\",\"Haider Ackermann\",\"Michael Kors\",\"Missoni\",\"Philippe Model\",\"Proenza Schouler\",\"Roland Mouret\",\"The Row\"],\"visible\":1,\"createdDateTime\":\"2017-09-28T16:43:42.563Z\"}";
    }

    @Override
    public String getMerchantsLocationsById(String id) {

        return "[{\"id\":1432,\"merchantId\":9306,\"merchantName\":\"Julian Fashion\",\"isReturnsInStoreAllowed\":false,\"address\":{\"firstName\":\"JULIAN FASHION SRL.\",\"addressLine1\":\"Viale Matteotti, 31\",\"addressLine2\":\"\",\"city\":{\"id\":0,\"name\":\"Milano Marittima\",\"countryId\":0},\"country\":{\"id\":101,\"name\":\"Italy\",\"nativeName\":\"Italy\",\"alpha2Code\":\"IT\",\"alpha3Code\":\"ITA\",\"culture\":\"it-IT\",\"region\":\"Europe\",\"continentId\":3},\"zipCode\":\"48015\",\"phone\":\"0544994313\"},\"lat\":\"44.278465\",\"lon\":\"12.348033\",\"businessDays\":[],\"sameDayDelivery\":{\"isActive\":false,\"cutOffTime\":\"00:00:00\"},\"isCollectPoint\":false,\"deliveryOptions\":[{\"deliveryType\":\"SameDay\",\"startTime\":\"00:00:00\",\"endTime\":\"00:00:00\",\"isEnabled\":false}],\"utcOffsetWithDst\":\"UTC+02:00\"}]";
    }
}
