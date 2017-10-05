package com.farfetch.dragon.example.wechat.backend.openApiGateway.api.fake;

import com.farfetch.dragon.example.wechat.backend.openApiGateway.spi.IProductsGateway;
import org.springframework.stereotype.Component;

/**
 * Created by jim.ji@farfetch.com on 2017/10/3.
 */
@Component
public class ProductsGateway implements IProductsGateway {

    @Override
    public String getProductsById(String id) {
        return "{\"id\":12000575,\"shortDescription\":\"泰迪熊印花背包\",\"description\":\"Moschino (莫斯奇诺) 红色 泰迪熊印花背包。 顶置拉链, 内置一个主要分层, 内置拉链口袋, 内置标贴, 可调整肩带。\",\"categories\":[{\"id\":135971,\"name\":\"包袋\",\"parentId\":0,\"gender\":\"Woman\",\"uuid\":\"00000000-0000-0000-0000-000000000000\"},{\"id\":136311,\"name\":\"双肩包\",\"parentId\":135971,\"gender\":\"Woman\",\"uuid\":\"00000000-0000-0000-0000-000000000000\"}],\"gender\":\"Woman\",\"variants\":[{\"merchantId\":9306,\"attributes\":[{\"type\":\"Size\",\"value\":\"17\"},{\"type\":\"SizeDescription\",\"value\":\"均码\"},{\"type\":\"Scale\",\"value\":\"14\"},{\"type\":\"ScaleDescription\",\"value\":\"均码\"},{\"type\":\"ScaleAbbreviation\"}],\"price\":{\"currencyIsoCode\":\"CNY\",\"countryId\":42,\"priceExclTaxes\":3889.31,\"priceInclTaxes\":5460.75,\"discountExclTaxes\":0.00,\"discountInclTaxes\":0.00,\"discountRate\":0.0,\"taxesRate\":40.4040,\"taxesValue\":1571.44,\"tags\":[\"DDP\"],\"priceWithoutPromotion\":5460.75},\"quantity\":6,\"availableAt\":[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,301,302,303,304,305,306,307,308,309,310,311,334],\"purchaseChannel\":\"AddToBag\",\"id\":\"00000000-0000-0000-0000-000000000000\"},{\"merchantId\":9339,\"attributes\":[{\"type\":\"Size\",\"value\":\"17\"},{\"type\":\"SizeDescription\",\"value\":\"均码\"},{\"type\":\"Scale\",\"value\":\"14\"},{\"type\":\"ScaleDescription\",\"value\":\"均码\"},{\"type\":\"ScaleAbbreviation\"}],\"price\":{\"currencyIsoCode\":\"CNY\",\"countryId\":42,\"priceExclTaxes\":3889.31,\"priceInclTaxes\":5460.75,\"discountExclTaxes\":0.00,\"discountInclTaxes\":0.00,\"discountRate\":0.0,\"taxesRate\":40.4040,\"taxesValue\":1571.44,\"tags\":[\"DDP\"],\"priceWithoutPromotion\":5460.75},\"quantity\":2,\"availableAt\":[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,301,302,303,304,305,306,307,308,309,310,311,334],\"purchaseChannel\":\"AddToBag\",\"id\":\"00000000-0000-0000-0000-000000000000\"},{\"merchantId\":9644,\"attributes\":[{\"type\":\"Size\",\"value\":\"17\"},{\"type\":\"SizeDescription\",\"value\":\"均码\"},{\"type\":\"Scale\",\"value\":\"14\"},{\"type\":\"ScaleDescription\",\"value\":\"均码\"},{\"type\":\"ScaleAbbreviation\"}],\"price\":{\"currencyIsoCode\":\"CNY\",\"countryId\":42,\"priceExclTaxes\":3889.31,\"priceInclTaxes\":5460.75,\"discountExclTaxes\":0.00,\"discountInclTaxes\":0.00,\"discountRate\":0.0,\"taxesRate\":40.4040,\"taxesValue\":1571.44,\"tags\":[\"DDP\"],\"priceWithoutPromotion\":5460.75},\"quantity\":2,\"availableAt\":[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,301,302,303,304,305,306,307,308,309,310,311,334],\"purchaseChannel\":\"AddToBag\",\"id\":\"00000000-0000-0000-0000-000000000000\"}],\"images\":{\"images\":[{\"order\":1,\"size\":\"54\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_54.jpg\"},{\"order\":1,\"size\":\"58\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_58.jpg\"},{\"order\":1,\"size\":\"70\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_70.jpg\"},{\"order\":1,\"size\":\"80\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_80.jpg\"},{\"order\":1,\"size\":\"114\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_114.jpg\"},{\"order\":1,\"size\":\"120\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_120.jpg\"},{\"order\":1,\"size\":\"170\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_170.jpg\"},{\"order\":1,\"size\":\"180\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_180.jpg\"},{\"order\":1,\"size\":\"190\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_190.jpg\"},{\"order\":1,\"size\":\"200\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_200.jpg\"},{\"order\":1,\"size\":\"240\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_240.jpg\"},{\"order\":1,\"size\":\"250\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_250.jpg\"},{\"order\":1,\"size\":\"255\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_255.jpg\"},{\"order\":1,\"size\":\"300\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_300.jpg\"},{\"order\":1,\"size\":\"322\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_322.jpg\"},{\"order\":1,\"size\":\"330\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_330.jpg\"},{\"order\":1,\"size\":\"350\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_350.jpg\"},{\"order\":1,\"size\":\"400\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_400.jpg\"},{\"order\":1,\"size\":\"480\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_480.jpg\"},{\"order\":1,\"size\":\"500\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_500.jpg\"},{\"order\":1,\"size\":\"600\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_600.jpg\"},{\"order\":1,\"size\":\"800\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_800.jpg\"},{\"order\":1,\"size\":\"1000\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403972_1000.jpg\"},{\"order\":2,\"size\":\"54\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_54.jpg\"},{\"order\":2,\"size\":\"58\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_58.jpg\"},{\"order\":2,\"size\":\"70\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_70.jpg\"},{\"order\":2,\"size\":\"80\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_80.jpg\"},{\"order\":2,\"size\":\"114\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_114.jpg\"},{\"order\":2,\"size\":\"120\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_120.jpg\"},{\"order\":2,\"size\":\"170\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_170.jpg\"},{\"order\":2,\"size\":\"180\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_180.jpg\"},{\"order\":2,\"size\":\"190\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_190.jpg\"},{\"order\":2,\"size\":\"200\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_200.jpg\"},{\"order\":2,\"size\":\"240\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_240.jpg\"},{\"order\":2,\"size\":\"250\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_250.jpg\"},{\"order\":2,\"size\":\"255\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_255.jpg\"},{\"order\":2,\"size\":\"300\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_300.jpg\"},{\"order\":2,\"size\":\"322\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_322.jpg\"},{\"order\":2,\"size\":\"330\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_330.jpg\"},{\"order\":2,\"size\":\"350\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_350.jpg\"},{\"order\":2,\"size\":\"400\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_400.jpg\"},{\"order\":2,\"size\":\"480\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_480.jpg\"},{\"order\":2,\"size\":\"500\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_500.jpg\"},{\"order\":2,\"size\":\"600\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_600.jpg\"},{\"order\":2,\"size\":\"800\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_800.jpg\"},{\"order\":2,\"size\":\"1000\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403975_1000.jpg\"},{\"order\":3,\"size\":\"54\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_54.jpg\"},{\"order\":3,\"size\":\"58\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_58.jpg\"},{\"order\":3,\"size\":\"70\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_70.jpg\"},{\"order\":3,\"size\":\"80\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_80.jpg\"},{\"order\":3,\"size\":\"114\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_114.jpg\"},{\"order\":3,\"size\":\"120\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_120.jpg\"},{\"order\":3,\"size\":\"170\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_170.jpg\"},{\"order\":3,\"size\":\"180\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_180.jpg\"},{\"order\":3,\"size\":\"190\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_190.jpg\"},{\"order\":3,\"size\":\"200\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_200.jpg\"},{\"order\":3,\"size\":\"240\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_240.jpg\"},{\"order\":3,\"size\":\"250\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_250.jpg\"},{\"order\":3,\"size\":\"255\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_255.jpg\"},{\"order\":3,\"size\":\"300\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_300.jpg\"},{\"order\":3,\"size\":\"322\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_322.jpg\"},{\"order\":3,\"size\":\"330\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_330.jpg\"},{\"order\":3,\"size\":\"350\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_350.jpg\"},{\"order\":3,\"size\":\"400\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_400.jpg\"},{\"order\":3,\"size\":\"480\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_480.jpg\"},{\"order\":3,\"size\":\"500\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_500.jpg\"},{\"order\":3,\"size\":\"600\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_600.jpg\"},{\"order\":3,\"size\":\"800\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_800.jpg\"},{\"order\":3,\"size\":\"1000\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403978_1000.jpg\"},{\"order\":4,\"size\":\"54\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_54.jpg\"},{\"order\":4,\"size\":\"58\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_58.jpg\"},{\"order\":4,\"size\":\"70\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_70.jpg\"},{\"order\":4,\"size\":\"80\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_80.jpg\"},{\"order\":4,\"size\":\"114\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_114.jpg\"},{\"order\":4,\"size\":\"120\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_120.jpg\"},{\"order\":4,\"size\":\"170\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_170.jpg\"},{\"order\":4,\"size\":\"180\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_180.jpg\"},{\"order\":4,\"size\":\"190\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_190.jpg\"},{\"order\":4,\"size\":\"200\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_200.jpg\"},{\"order\":4,\"size\":\"240\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_240.jpg\"},{\"order\":4,\"size\":\"250\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_250.jpg\"},{\"order\":4,\"size\":\"255\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_255.jpg\"},{\"order\":4,\"size\":\"300\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_300.jpg\"},{\"order\":4,\"size\":\"322\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_322.jpg\"},{\"order\":4,\"size\":\"330\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_330.jpg\"},{\"order\":4,\"size\":\"350\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_350.jpg\"},{\"order\":4,\"size\":\"400\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_400.jpg\"},{\"order\":4,\"size\":\"480\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_480.jpg\"},{\"order\":4,\"size\":\"500\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_500.jpg\"},{\"order\":4,\"size\":\"600\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_600.jpg\"},{\"order\":4,\"size\":\"800\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_800.jpg\"},{\"order\":4,\"size\":\"1000\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403983_1000.jpg\"},{\"order\":5,\"size\":\"54\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_54.jpg\"},{\"order\":5,\"size\":\"58\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_58.jpg\"},{\"order\":5,\"size\":\"70\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_70.jpg\"},{\"order\":5,\"size\":\"80\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_80.jpg\"},{\"order\":5,\"size\":\"114\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_114.jpg\"},{\"order\":5,\"size\":\"120\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_120.jpg\"},{\"order\":5,\"size\":\"170\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_170.jpg\"},{\"order\":5,\"size\":\"180\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_180.jpg\"},{\"order\":5,\"size\":\"190\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_190.jpg\"},{\"order\":5,\"size\":\"200\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_200.jpg\"},{\"order\":5,\"size\":\"240\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_240.jpg\"},{\"order\":5,\"size\":\"250\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_250.jpg\"},{\"order\":5,\"size\":\"255\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_255.jpg\"},{\"order\":5,\"size\":\"300\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_300.jpg\"},{\"order\":5,\"size\":\"322\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_322.jpg\"},{\"order\":5,\"size\":\"330\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_330.jpg\"},{\"order\":5,\"size\":\"350\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_350.jpg\"},{\"order\":5,\"size\":\"400\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_400.jpg\"},{\"order\":5,\"size\":\"480\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_480.jpg\"},{\"order\":5,\"size\":\"500\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_500.jpg\"},{\"order\":5,\"size\":\"600\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_600.jpg\"},{\"order\":5,\"size\":\"800\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_800.jpg\"},{\"order\":5,\"size\":\"1000\",\"url\":\"https://cdn-images.farfetch-contents.com/12/00/05/75/12000575_9403987_1000.jpg\"}],\"liveModel\":{\"id\":0,\"measurements\":[{\"description\":\"Bust\",\"value\":81.0,\"measureTypeId\":\"00000000-0000-0000-0000-000000000000\",\"unitClass\":\"None\"},{\"description\":\"Height\",\"value\":180.0,\"measureTypeId\":\"00000000-0000-0000-0000-000000000000\",\"unitClass\":\"None\"},{\"description\":\"Hips\",\"value\":86.0,\"measureTypeId\":\"00000000-0000-0000-0000-000000000000\",\"unitClass\":\"None\"},{\"description\":\"Waist\",\"value\":62.0,\"measureTypeId\":\"00000000-0000-0000-0000-000000000000\",\"unitClass\":\"None\"}],\"globalId\":\"00000000-0000-0000-0000-000000000000\"},\"productSize\":\"OS\"},\"videos\":[],\"brand\":{\"id\":3879,\"name\":\"Moschino\",\"description\":\"自1984年起，意大利品牌Moschino以聪明及滑稽的时装闯荡米兰时尚圈。20年多年来，为品牌效力多年的Rosella Jardini终于找到同样以幽默感著称的洛杉矶设计师Jeremy Scott担任创意总监职位，希望借由他的天赋和人气，将品牌推向崭新的时尚舞台。\"},\"season\":{\"id\":3965729,\"uuid\":\"00000000-0000-0000-0000-000000000000\"},\"measurements\":[{\"description\":\"见详细测量尺寸\",\"measureTypeId\":\"00000000-0000-0000-0000-000000000000\",\"unitClass\":\"None\"}],\"compositions\":[{\"productPart\":\"OUTER\",\"material\":\"聚亚安酯\",\"value\":\"100\"}],\"brandStyleId\":\"A76338210\",\"tag\":\"NoTag\",\"care\":[],\"isCustomizable\":false,\"colors\":[{\"color\":{\"id\":112504,\"name\":\"RED\"},\"tags\":[\"MainColor\"]},{\"color\":{\"id\":0,\"name\":\"1115\"},\"tags\":[\"DesignerColor\"]}],\"isOnline\":true,\"hasParentProduct\":false,\"parentProductId\":0,\"preferedMerchantId\":9306,\"madeIn\":\"Italy\",\"preferedMerchant\":{\"merchantId\":9306,\"byAttribute\":[{\"merchantId\":9306,\"type\":\"Size\",\"value\":\"17\"}]},\"departmentId\":\"Luxe\",\"styleId\":4220537}";
    }

    @Override
    public String getProductsMeasurementsById(String id) {
        return "[{\"attributes\":[{\"type\":\"Size\",\"value\":\"17\"},{\"type\":\"SizeDescription\",\"value\":\"OS\"},{\"type\":\"Scale\",\"value\":\"d7c5302c-58d0-4358-9d1d-0153a863a714\"},{\"type\":\"ScaleAbbreviation\",\"value\":\"\"},{\"type\":\"ScaleDescription\",\"value\":\"One Size\"}],\"measurements\":[{\"description\":\"宽度\",\"value\":24.0,\"unit\":\"cm\",\"measureTypeId\":\"b33c57a1-c80b-413a-830e-0f81a8c83379\",\"unitClass\":\"Length\"},{\"description\":\"高度\",\"value\":30.0,\"unit\":\"cm\",\"measureTypeId\":\"f4636e38-d893-4dcd-a871-3665329353d6\",\"unitClass\":\"Length\"},{\"description\":\"手柄\",\"value\":9.0,\"unit\":\"cm\",\"measureTypeId\":\"5d6d783b-9430-43f5-ae73-5107f09eb6e0\",\"unitClass\":\"Length\"},{\"description\":\"深度\",\"value\":13.0,\"unit\":\"cm\",\"measureTypeId\":\"3d0a1016-f795-444b-87cd-b2ec73567781\",\"unitClass\":\"Length\"},{\"description\":\"带长\",\"value\":38.0,\"unit\":\"cm\",\"measureTypeId\":\"2eaabd97-61f1-4ab0-8c53-fb8336dd577c\",\"unitClass\":\"Length\"}]}]";
    }

    @Override
    public String getProductsOutfitsById(String id) {
        return "[{\"id\":107186,\"mainProductId\":12000575,\"description\":\"\",\"countryId\":0,\"dateCreated\":\"2017-03-17T12:18:45.5109348Z\",\"onlineState\":1,\"targetTenantId\":10000,\"products\":[{\"outfitId\":107186,\"productId\":11221747},{\"outfitId\":107186,\"productId\":11539852},{\"outfitId\":107186,\"productId\":11979110}]}]";
    }
}