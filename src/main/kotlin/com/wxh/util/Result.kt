package com.wxh.util

import lombok.Getter
import lombok.Setter
import java.io.Serializable

@Getter
@Setter
class Result : Serializable {
    private var info: String? = null
    private var data: Any? = null

    // 200-成功，412-自定义异常，500-系统繁忙，101-未登录
    private var code: Int? = null

    constructor(code: Int?, info: String?, data: Any?) : super() {
        this.info = info
        this.code = code
        this.data = data
    }
}