package com.halo.producer.modules.order.service;

import com.halo.producer.modules.order.entity.TOrder;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 订单(TOrder)表服务接口
 *
 * @author shoufeng
 * @since 2020-09-14 21:46:36
 */
public interface TOrderService extends IService<TOrder>{

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TOrder queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TOrder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    TOrder insert(TOrder tOrder) throws Exception;

    /**
     * 修改数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    TOrder update(TOrder tOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}