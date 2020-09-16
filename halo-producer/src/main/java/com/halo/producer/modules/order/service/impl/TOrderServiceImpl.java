package com.halo.producer.modules.order.service.impl;

import com.halo.producer.api.goods.GoodsService;
import com.halo.producer.api.goods.TGoods;
import com.halo.producer.modules.order.entity.TOrder;
import com.halo.producer.modules.order.dao.TOrderDao;
import com.halo.producer.modules.order.service.TOrderService;
import com.halo.producer.modules.user.entity.TUser;
import com.halo.producer.modules.user.service.TUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单(TOrder)表服务实现类
 *
 * @author shoufeng
 * @since 2020-09-14 21:46:37
 */
@Service("tOrderService")
@GlobalTransactional(rollbackFor = Exception.class)
public class TOrderServiceImpl extends ServiceImpl<TOrderDao, TOrder> implements TOrderService {
    @Resource
    private TOrderDao tOrderDao;

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private TUserService tUserService;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TOrder queryById(Long id) {
        return this.tOrderDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TOrder> queryAllByLimit(int offset, int limit) {
        return this.tOrderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TOrder insert(TOrder tOrder) throws Exception {
        this.tOrderDao.insert(tOrder);
        goodsService.saveOne(TGoods.builder().goodsName("测试商品新增").build());
        tUserService.insert(TUser.builder().userName("测试用户").build());
        throw new Exception("自定义异常");
//        return tOrder;
    }

    /**
     * 修改数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TOrder update(TOrder tOrder) {
        this.tOrderDao.update(tOrder);
        return this.queryById(tOrder.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tOrderDao.deleteById(id) > 0;
    }
}