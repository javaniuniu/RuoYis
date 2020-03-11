package com.ruoyi.framework.shiro.web.session;

import org.apache.shiro.session.mgt.DefaultSessionManager;
import org.apache.shiro.session.mgt.SessionValidationScheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.concurrent.ScheduledExecutorService;

/**
 * 自定义任务调度器完成
 *
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/11 4:37 PM
 */
public class SpringSessionValidationScheduler implements SessionValidationScheduler {
    private static final Logger log = LoggerFactory.getLogger(SpringSessionValidationScheduler.class);

    public static final long DEFAULT_SESSION_VALIDATION_INTERVAL = DefaultSessionManager.DEFAULT_SESSION_VALIDATION_INTERVAL;

    /**
     * 定时器，用于处理超时的挂起请求，也用于连接断开时的重连。
     */
    @Autowired
    @Qualifier("scheduledExecutorService")
    private ScheduledExecutorService executorService;

    private volatile boolean enabled = false;

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enableSessionValidation() {

    }

    @Override
    public void disableSessionValidation() {

    }
}
