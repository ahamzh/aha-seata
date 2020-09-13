package com.aha.consumer.moudules.goods.controller;

import com.aha.consumer.moudules.goods.entity.TGoods;
import com.aha.consumer.moudules.goods.service.TGoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品(TGoods)表控制层
 *
 * @author shoufeng
 * @since 2020-09-13 23:11:54
 */
@RestController
@RequestMapping("tGoods")
public class TGoodsController {
    /**
     * 服务对象
     */
    @Resource
    private TGoodsService tGoodsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TGoods selectOne(Long id) {
        return this.tGoodsService.queryById(id);
    }

    @PostMapping("/save")
    public void saveOne(@RequestBody TGoods tGoods){

    }

}