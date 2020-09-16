package com.halo.consumer.modules.goods.controller;

import com.halo.consumer.modules.goods.entity.TGoods;
import com.halo.consumer.modules.goods.service.TGoodsService;
import io.seata.spring.annotation.GlobalTransactional;
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
@GlobalTransactional(rollbackFor = Exception.class)
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
        tGoodsService.save(tGoods);
    }

}