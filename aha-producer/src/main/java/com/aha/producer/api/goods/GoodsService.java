package com.aha.producer.api.goods;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author shoufeng
 */
@FeignClient(name = "aha-consumer-app")
public interface GoodsService {

    @PostMapping("tGoods/save")
    void saveOne(@RequestBody TGoods tGoods);
}
