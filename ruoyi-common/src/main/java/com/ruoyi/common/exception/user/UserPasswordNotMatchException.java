package com.ruoyi.common.exception.user;

/**
 * 用户密码不正确或不符合规范异常类
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/10 1:23 PM
 */
public class UserPasswordNotMatchException extends UserException {
    private static final long serialVersionUID = 1L;
    public UserPasswordNotMatchException() {
        super("user.password.not.match", null);
    }
}
