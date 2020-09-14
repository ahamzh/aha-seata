package com.aha.consumer.modules.goods.service;

import com.aha.consumer.modules.goods.entity.TGoods;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 商品(TGoods)表服务接口
 *
 * @author shoufeng
 * @since 2020-09-13 23:11:53
 */
public interface TGoodsService extends IService<TGoods> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TGoods queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TGoods> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tGoods 实例对象
     * @return 实例对象
     */
    TGoods insert(TGoods tGoods);

    /**
     * 修改数据
     *
     * @param tGoods 实例对象
     * @return 实例对象
     */
    TGoods update(TGoods tGoods);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}