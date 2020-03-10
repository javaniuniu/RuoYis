package com.ruoyi.common.utils;

import com.ruoyi.common.utils.spring.SpringUtils;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

/**
 * 获取i18n资源文件
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/9 9:53 PM
 */
public class MessageUtils
{
    /**
     * 根据消息键和参数 获取消息 委托给spring messageSource
     * 通过传如配置文件中的key 获取对于的value
     * @param code 消息键 <p>user.password.not.match</p>
     * @param args 参数 <p>null</p>
     * @return 获取国际化翻译值 <p>用户不存在/密码错误</p>
     */
    public static String message(String code, Object... args)
    {
        MessageSource messageSource = SpringUtils.getBean(MessageSource.class);
        return messageSource.getMessage(code, args, LocaleContextHolder.getLocale());
    }
}
