package com.wxh.controller;

import com.wxh.model.UserOrder
import com.wxh.service.IUserOrderService
import com.wxh.util.Result
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wxh
 * @since 2021-03-14
 */
@RestController
@RequestMapping("/user")
class UserOrderController

@Resource
lateinit var userOrderService: IUserOrderService

@GetMapping("/get/{id}")
fun get(@PathVariable("id") id: String?): UserOrder? {
    return userOrderService.getById(id);
}

@GetMapping("/test")
fun test(id: String?): UserOrder? {
    return userOrderService.getById(id);
}