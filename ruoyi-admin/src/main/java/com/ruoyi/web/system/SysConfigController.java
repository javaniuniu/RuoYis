package com.ruoyi.web.system;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.system.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 参数配置 信息操作处理
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/9 9:53 PM
 */
@Controller
@RequestMapping("/system/config")
public class SysConfigController extends BaseController {

    private String prefix = "system/config";

    @Autowired
    private ISysConfigService configService;
}
