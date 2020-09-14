package com.aha.producer;

import com.aha.producer.modules.order.entity.TOrder;
import com.aha.producer.modules.order.service.TOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shoufeng
 */


@SpringBootTest
public class AhaProducerAppTest {

    @Autowired
    private TOrderService tOrderService;

    @Test
    public void test(){
        tOrderService.insert(TOrder.builder().goodsCount(111).build());
    }
}
