/**
 * Copyright ©2018 上海屹通. All rights reserved.
 *
 * @Title: ProductInfoDao.java
 * @Prject: yitong-mp-pers-recharge
 * @Description:
 * @Package: com.imooc.product.dao
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 10:28
 * @version: V1.0
 */
package com.imooc.product.server.dao;

import com.imooc.product.server.pojo.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName: ProductInfoDao
 * @Description:
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 10:28
 */
public interface ProductInfoDao extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);


}
