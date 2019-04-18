/**
 * Copyright ©2018 上海屹通. All rights reserved.
 *
 * @Title: ProductService.java
 * @Prject: yitong-mp-pers-recharge
 * @Description:
 * @Package: com.imooc.product.service
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 10:25
 * @version: V1.0
 */
package com.imooc.product.server.service;

import com.imooc.product.server.dto.CartDTO;
import com.imooc.product.server.pojo.ProductInfo;

import java.util.List;

/**
 * @ClassName: ProductService
 * @Description:
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 10:25
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     *
     * @return
     */
    List<ProductInfo> findUpAll();


    List<ProductInfo> findList(List<String> productIdList);


    void decreaseStock(List<CartDTO> cartDTOList);
}
