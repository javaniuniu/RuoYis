package com.ruoyi.common.exception.file;

import com.ruoyi.common.exception.base.BaseException;

/**
 * 文件信息异常类
 *
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/9 9:53 PM
 */
public class FileException extends BaseException {
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }

}
