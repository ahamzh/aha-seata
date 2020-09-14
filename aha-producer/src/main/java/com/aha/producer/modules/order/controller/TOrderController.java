package com.aha.producer.modules.order.controller;

import com.aha.producer.modules.order.entity.TOrder;
import com.aha.producer.modules.order.service.TOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单(TOrder)表控制层
 *
 * @author shoufeng
 * @since 2020-09-14 21:46:37
 */
@RestController
@RequestMapping("tOrder")
public class TOrderController {
    /**
     * 服务对象
     */
    @Resource
    private TOrderService tOrderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TOrder selectOne(Long id) {
        return this.tOrderService.queryById(id);
    }

    @GetMapping("/test")
    public void test() {
        tOrderService.insert(TOrder.builder().goodsCount(111).build());
    }

}