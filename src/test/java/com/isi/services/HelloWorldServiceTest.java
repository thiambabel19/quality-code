package com.isi.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HelloWorldServiceTest {

    @Autowired
    private HelloWorldService helloWorldService;

    @Test
    void HelloWorldTest(){
        String result = helloWorldService.helloWorld();
        Assertions.assertNotNull(result);
        Assertions.assertEquals("Hello world !!!", result);
    }

    @Test
    void somme() {
        int a =5;
        int b = 10;
        int result = helloWorldService.somme(a, b);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(15, result);
    }

    @Test
    void produit() {
        int a =5;
        int b = 10;
        int result = helloWorldService.produit(a, b);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(50, result);
    }

    @Test
    void soustraction() {
        int a =25;
        int b = 5;
        int result = helloWorldService.soustraction(a, b);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(20, result);
    }
}