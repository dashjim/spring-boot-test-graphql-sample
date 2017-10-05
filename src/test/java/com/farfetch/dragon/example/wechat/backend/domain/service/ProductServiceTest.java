package com.farfetch.dragon.example.wechat.backend.domain.service;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by jim.ji@farfetch.com on 2017/10/3.
 */

public class ProductServiceTest extends SpringBootTestParent{

    @Autowired
    private IProductService productService;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void getProductsByIdWhenIdIsGivenShouldBeGood(){
        IProductService.ProductDAO product = productService.getProductsById("anything");
        assertNotNull(product);
        assertThat("泰迪熊印花背包", equalTo(product.getShortDescription()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getProductByIdWhenNoIdShouldThrowException() {
        productService.getProductsById(null);
//        this.thrown.expect(IllegalArgumentException.class);
    }

}