package com.ruoyi.common.exception.user;

import com.ruoyi.common.exception.base.BaseException;

/**
 * 用户信息异常类
 *
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/10 1:17 PM
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }
}
