package com.halo.producer.modules.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单(TOrder)实体类
 *
 * @author shoufeng
 * @since 2020-09-14 21:46:34
 */

@TableName("t_order")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TOrder implements Serializable {
    private static final long serialVersionUID = 128891639929909784L;
    /**
    * 主键
    */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
    * 用户ID
    */
    private Long userId;
    /**
    * 商品ID
    */
    private Long goodsId;
    /**
    * 商品数量
    */
    private Integer goodsCount;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;

}