package com.wxh.service.impl;

import com.wxh.model.UserOrder;
import com.wxh.mapper.UserOrderMapper;
import com.wxh.service.IUserOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wxh
 * @since 2021-03-14
 */
@Service
open class UserOrderServiceImpl : ServiceImpl<UserOrderMapper, UserOrder>(), IUserOrderService {

}
