/**
 * Copyright ©2018 上海屹通. All rights reserved.
 *
 * @Title: ProductServiceImpl.java
 * @Prject: yitong-mp-pers-recharge
 * @Description:
 * @Package: com.imooc.product.service.impl
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 10:37
 * @version: V1.0
 */
package com.imooc.product.server.service.impl;


import com.imooc.product.server.dao.ProductInfoDao;
import com.imooc.product.server.dto.CartDTO;
import com.imooc.product.server.enums.ProductStatusEnum;
import com.imooc.product.server.enums.ResultEnum;
import com.imooc.product.server.exception.ProductException;
import com.imooc.product.server.pojo.ProductInfo;
import com.imooc.product.server.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName: ProductServiceImpl
 * @Description:
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 10:37
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoDao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    /**
     * 给订单服务提供
     * @param productIdList
     * @return
     */
    @Override
    public List<ProductInfo> findList(List<String> productIdList) {
        return productInfoDao.findByProductIdIn(productIdList);
    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList) {

        for (CartDTO cartDTO : cartDTOList) {
            Optional<ProductInfo> optional = productInfoDao.findById(cartDTO.getProductId());
            // 商品不存在
            if (!optional.isPresent()) {
                throw new ProductException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            ProductInfo productInfo = optional.get();
            // 库存不足
            int result = productInfo.getProductStock() - cartDTO.getProductQuantity();
            if (result < 0) {
                throw new ProductException(ResultEnum.PRODUCT_STOCK_ERROE);
            }

            // 扣库存
            productInfo.setProductStock(result);
            productInfoDao.save(productInfo);

        }



    }

}
