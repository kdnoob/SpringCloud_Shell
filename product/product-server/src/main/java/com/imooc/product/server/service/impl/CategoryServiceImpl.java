/**
 * Copyright ©2018 上海屹通. All rights reserved.
 *
 * @Title: CategoryServiceImpl.java
 * @Prject: yitong-mp-pers-recharge
 * @Description:
 * @Package: com.imooc.product.service.impl
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 10:48
 * @version: V1.0
 */
package com.imooc.product.server.service.impl;

import com.imooc.product.server.dao.ProductCategoryDao;
import com.imooc.product.server.pojo.ProductCategory;
import com.imooc.product.server.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: CategoryServiceImpl
 * @Description:
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 10:48
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryDao.findByCategoryTypeIn(categoryTypeList);
    }
}
