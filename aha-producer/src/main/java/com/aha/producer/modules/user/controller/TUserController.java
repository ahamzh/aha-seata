package com.aha.producer.modules.user.controller;

import com.aha.producer.modules.user.entity.TUser;
import com.aha.producer.modules.user.service.TUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户(TUser)表控制层
 *
 * @author shoufeng
 * @since 2020-09-14 21:46:59
 */
@RestController
@RequestMapping("tUser")
public class TUserController {
    /**
     * 服务对象
     */
    @Resource
    private TUserService tUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TUser selectOne(Long id) {
        return this.tUserService.queryById(id);
    }

}