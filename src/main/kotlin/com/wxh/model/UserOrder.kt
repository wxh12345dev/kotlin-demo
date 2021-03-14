package com.wxh.model

import com.baomidou.mybatisplus.annotation.TableField
import java.io.Serializable
/**
 * <p>
 * 
 * </p>
 *
 * @author wxh
 * @since 2021-03-14
 */
class UserOrder : Serializable {


    /**
     * 订单编号
     */
    @TableField("ORDER_NO")
    var orderNo: String? = null


    override fun toString(): String {
        return "UserOrder{" +
        "orderNo=" + orderNo +
        "}"
    }
}
