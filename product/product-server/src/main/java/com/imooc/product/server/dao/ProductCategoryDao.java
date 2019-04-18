/**
 * Copyright ©2018 上海屹通. All rights reserved.
 *
 * @Title: ProductCategoryDao.java
 * @Prject: yitong-mp-pers-recharge
 * @Description:
 * @Package: com.imooc.product.dao
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 10:45
 * @version: V1.0
 */
package com.imooc.product.server.dao;

import com.imooc.product.server.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName: ProductCategoryDao
 * @Description:
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 10:45
 */
public interface ProductCategoryDao extends JpaRepository<ProductCategory, String> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
