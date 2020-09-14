package com.aha.producer.api.goods;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品(TGoods)实体类
 *
 * @author shoufeng
 * @since 2020-09-13 23:11:51
 */
@TableName("t_goods")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TGoods implements Serializable {
    private static final long serialVersionUID = 407721917741068048L;
    /**
    * 主键
    */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
    * 商品名称
    */
    private String goodsName;
    /**
    * 商品价格
    */
    private Double goodsPrice;
    /**
    * 余下商品数量
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