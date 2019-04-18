/**
 * Copyright ©2018 上海屹通. All rights reserved.
 *
 * @Title: ResultVO.java
 * @Prject: yitong-mp-pers-recharge
 * @Description:
 * @Package: com.imooc.product.VO
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 11:13
 * @version: V1.0
 */
package com.imooc.product.server.VO;

import lombok.Data;

/**
 * @ClassName: ResultVO
 * @Description:
 * @author: 张凯达（zhangkaida@yitong.com.cn）
 * @date: 2019-04-16 11:13
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

}
