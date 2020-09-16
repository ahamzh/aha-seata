package com.halo.consumer.modules.goods.dao;

import com.halo.consumer.modules.goods.entity.TGoods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 商品(TGoods)表数据库访问层
 *
 * @author shoufeng
 * @since 2020-09-13 23:11:53
 */
@Mapper
public interface TGoodsDao extends BaseMapper<TGoods> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TGoods queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TGoods> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tGoods 实例对象
     * @return 对象列表
     */
    List<TGoods> queryAll(TGoods tGoods);

    /**
     * 新增数据
     *
     * @param tGoods 实例对象
     * @return 影响行数
     */
//    int insert(TGoods tGoods);

    /**
     * 修改数据
     *
     * @param tGoods 实例对象
     * @return 影响行数
     */
    int update(TGoods tGoods);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}