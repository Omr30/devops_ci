package com.paymentchain.billing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicApplicationTests {
 
 @Test
 public void contextLoads() {
 	    String meessage= "probando el pipeline con jenkins y haciendo merge probando slack";
 	    Assert.assertNotNull(meessage);
 }
 
}
