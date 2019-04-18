package com.imooc.product.server.exception;


import com.imooc.product.server.enums.ResultEnum;

/**
 * Created by zghgchao 2018/6/17 16:50
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
