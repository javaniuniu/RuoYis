### 知识点
- Server层中方法间调用需要使用 AopContext.currentProxy()获取代理类 如方法A调用方法B[AOP切入同类调用方法-AopContext.currentProxy()](https://blog.csdn.net/aosica321/article/details/58039299)
```
((Service)AopContext.currentProxy()).B()
```