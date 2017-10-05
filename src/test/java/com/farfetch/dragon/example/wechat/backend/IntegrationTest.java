package com.farfetch.dragon.example.wechat.backend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;


/**
 * Created by jim.ji@farfetch.com on 2017/10/4.
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IntegrationTest {

    private static final Logger LG = LoggerFactory.getLogger(IntegrationTest.class);

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetProductID(){
        ResponseEntity<String> response = this.restTemplate.getForEntity("/v1/products/{pid}", String.class, "123456");
        assertNotNull(response.getBody());
        assertThat(response.getBody()).contains("id");
    }

}
