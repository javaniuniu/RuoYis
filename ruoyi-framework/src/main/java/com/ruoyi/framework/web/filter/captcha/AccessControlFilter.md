# shiro提供的filter-AccessControlFilter

这个类的javadoc中说明了这个类才是限制应用中的资源能否被访问的filter，我们先看的onPreHandle方法：
Java代码
```java
public boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {  
    return isAccessAllowed(request, response, mappedValue) || onAccessDenied(request, response, mappedValue);  
}  
```

 
可以发现他是调用的isAccessAllowed方法和onAccessDenied方法，只要两者有一个可以就可以了，从名字中我们也可以理解，他的逻辑是这样：先调用isAccessAllowed，如果返回的是true，则直接放行执行后面的filter和servlet，如果返回的是false，则继续执行后面的onAccessDenied方法，如果后面返回的是true则也可以有权限继续执行后面的filter和servelt。
只有两个函数都返回false才会阻止后面的filter和servlet的执行。
 
isAccessAllowed方法在这个类中都是抽象的，依靠实现类实现。onAccessDenied方法不是抽象的，但是调用了另一个抽象的方法：
org.apache.shiro.web.filter.AccessControlFilter.onAccessDenied(ServletRequest, ServletResponse)
这个方法忽略了之前配置的param参数。
 
这个类中还有其他的属性，比如getLoginUrl，这个很容易猜测，是当没有登录的时候重定向到登录界面的，这个方法就是获得登录界面的位置，默认是/login.jsp，如果我们的登录界面不是这个的话就要重写这个方法。
 
还有一个特别好使的方法
saveRequestAndRedirectToLogin(ServletRequest, ServletResponse)，源码如下：
Java代码
```java
protected void saveRequestAndRedirectToLogin(ServletRequest request, ServletResponse response) throws IOException {  
        saveRequest(request);  
        redirectToLogin(request, response);  
} 
```
 
 
 
显示保存了当前的request，然后重定向。
源码如下：
Java代码
```java
protected void saveRequest(ServletRequest request) {  
        WebUtils.saveRequest(request);//关于webutils在别的博客中。  
}  
protected void redirectToLogin(ServletRequest request, ServletResponse response) throws IOException {  
        String loginUrl = getLoginUrl();//重定向的界面就是到登录页面。  
        WebUtils.issueRedirect(request, response, loginUrl); //关于webutils在别的博客中。  
}
```
 
 
我们如果在其他类中需要重定向的话就可以直接使用它的WebUtils.issueRedirect(request,response,loginUrl)方法了。
 
另外这个类还提供了判断当前的请求路径是不是登录页面的功能：
 
Java代码
```java
protectedboolean isLoginRequest(ServletRequest request, ServletResponse response) {  
        return pathsMatch(getLoginUrl(), request);  
}  
```

这个方法也可能用到。
 
 
继续看他的实现类，注意，现在有两个抽象方法，一个是isAccessAllowed，一个是onAccessDenied，这两参数不一样。
 
继承类：
- AuthenticationFilter
- AuthorizationFilter
- UserFilter