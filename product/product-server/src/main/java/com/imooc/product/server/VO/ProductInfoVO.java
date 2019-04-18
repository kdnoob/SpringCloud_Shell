/**
 * Copyright ©2018 上海屹通. All rights reserved.
 *
 * @Title: ProductInfoVO.java
 * @Prject: yitong-mp-pers-recharge
 * @Description:
 * @Package: com.imooc.product.VO
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 11:14
 * @version: V1.0
 */
package com.imooc.product.server.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName: ProductInfoVO
 * @Description:
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 11:14
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;

}
