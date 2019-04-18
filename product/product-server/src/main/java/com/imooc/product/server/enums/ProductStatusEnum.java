/**
 * Copyright ©2018 上海屹通. All rights reserved.
 *
 * @Title: ProductStatusEnum.java
 * @Prject: yitong-mp-pers-recharge
 * @Description:
 * @Package: com.imooc.product.enums
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 10:39
 * @version: V1.0
 */
package com.imooc.product.server.enums;

import lombok.Getter;

/**
 * @ClassName: ProductStatusEnum
 * @Description:
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 10:39
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1,"下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
