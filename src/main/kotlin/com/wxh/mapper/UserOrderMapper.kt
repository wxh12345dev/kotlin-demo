package com.wxh.mapper;

import com.wxh.model.UserOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wxh
 * @since 2021-03-14
 */
@Mapper
interface UserOrderMapper : BaseMapper<UserOrder>
