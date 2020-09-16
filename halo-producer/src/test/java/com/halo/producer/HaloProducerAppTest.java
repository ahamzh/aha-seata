package com.halo.producer;

import com.halo.producer.modules.order.entity.TOrder;
import com.halo.producer.modules.order.service.TOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author shoufeng
 */


@SpringBootTest
public class HaloProducerAppTest {

    @Autowired
    private TOrderService tOrderService;

    @Test
    public void test() throws Exception {
        tOrderService.insert(TOrder.builder().goodsCount(111).build());
    }
}
