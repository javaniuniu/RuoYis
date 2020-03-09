## 知识点
WebDataBinder 用于把参数绑定到javaBean ，和 @RequestBody @ReauestPram 类似 [最全面阐述WebDataBinder理解Spring的数据绑定](https://www.jianshu.com/p/b1cd2234e012)
@InitBinder注解 被此注解的方法可以对 WebDataBinder 初始化 和WebDataBinder 一起使用 [SpringMVC学习笔记15-----@InitBinder注解](https://blog.csdn.net/qq_38016931/article/details/82080940)
```
@InitBinder
   public void initBinder(WebDataBinder binder) {
       binder.setDisallowedFields("name");
   }
```