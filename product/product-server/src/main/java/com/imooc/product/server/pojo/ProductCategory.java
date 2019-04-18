package com.imooc.product.server.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 *  product_category
 * @author 大狼狗 2019-04-16
 */
@Entity
@Data
public class ProductCategory implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * category_id
     */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**
     * 类目名字
     */
    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    public ProductCategory() {
    }

}