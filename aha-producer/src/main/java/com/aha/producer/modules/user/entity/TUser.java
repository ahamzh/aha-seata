package com.aha.producer.modules.user.entity;

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
 * 用户(TUser)实体类
 *
 * @author shoufeng
 * @since 2020-09-14 21:46:56
 */
@TableName("t_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TUser implements Serializable {
    private static final long serialVersionUID = -63087413947618258L;
    /**
    * 主键
    */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
    * 用户账号
    */
    private Integer userNo;
    /**
    * 用户名
    */
    private String userName;
    /**
    * 电话
    */
    private String userTelephone;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;

}