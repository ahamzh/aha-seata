package com.aha.consumer.modules.goods.service.impl;

import com.aha.consumer.modules.goods.service.TGoodsService;
import com.aha.consumer.modules.goods.entity.TGoods;
import com.aha.consumer.modules.goods.dao.TGoodsDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品(TGoods)表服务实现类
 *
 * @author shoufeng
 * @since 2020-09-13 23:11:54
 */
@Service("tGoodsService")
public class TGoodsServiceImpl extends ServiceImpl<TGoodsDao, TGoods> implements TGoodsService {
    @Resource
    private TGoodsDao tGoodsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TGoods queryById(Long id) {
        return this.tGoodsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TGoods> queryAllByLimit(int offset, int limit) {
        return this.tGoodsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tGoods 实例对象
     * @return 实例对象
     */
    @Override
    public TGoods insert(TGoods tGoods) {
        this.tGoodsDao.insert(tGoods);
        return tGoods;
    }

    /**
     * 修改数据
     *
     * @param tGoods 实例对象
     * @return 实例对象
     */
    @Override
    public TGoods update(TGoods tGoods) {
        this.tGoodsDao.update(tGoods);
        return this.queryById(tGoods.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tGoodsDao.deleteById(id) > 0;
    }
}