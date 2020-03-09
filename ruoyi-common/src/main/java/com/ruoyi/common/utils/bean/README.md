# 各类对象属性拷贝工具性能测试对比（BeanCopier、BeanUtils、DozerBeanMapper、PropertyUtils）

### 性能测试结果对比
预热100次后结果排行
单次耗时：BeanCopier < BeanUtils(Spring) < PropertyUtils < BeanUtils(Apache) < DozerBeanMapper
100万次耗时：BeanCopier < BeanUtils(Spring) < PropertyUtils < DozerBeanMapper < BeanUtils(Apache)
平均耗时：BeanCopier < BeanUtils(Spring) < PropertyUtils < DozerBeanMapper < BeanUtils(Apache)


预热1000次后结果排行：
单次耗时：BeanCopier < BeanUtils(Spring) < PropertyUtils < BeanUtils(Apache) < DozerBeanMapper
100万次耗时：BeanCopier < BeanUtils(Spring) < DozerBeanMapper < PropertyUtils < BeanUtils(Apache)
平均耗时：BeanCopier < BeanUtils(Spring) < DozerBeanMapper < PropertyUtils < BeanUtils(Apache)


### 结果分析 
- BeanCopier 更适合做属性拷贝
- DozerBeanMapper工具虽然表现一般，但是它是深拷贝

### 参考链接
- [各类对象属性拷贝工具性能测试对比（BeanCopier、BeanUtils、DozerBeanMapper、PropertyUtils）](https://blog.csdn.net/u012534326/article/details/102611483)