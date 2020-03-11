# shiro 相关代码

### 知识点
- AtomicInteger 用于并发时单点操作 [原子操作类AtomicInteger详解](https://blog.csdn.net/fanrenxiang/article/details/80623884)
- @PostConstruct该注解被用来修饰一个非静态的void（）方法。被@PostConstruct修饰的方法会在服务器加载Servlet的时候运行，并且只会被服务器执行一次。PostConstruct在构造函数之后执行，init（）方法之前执行。[@PostConstruct注解](https://blog.csdn.net/qq360694660/article/details/82877222)
- AuthenticationInfo对象中存储的是主体（Subject）的身份认证信息。Shiro会调用CredentialsMatcher对象的doCredentialsMatch方法对AuthenticationInfo对象和AuthenticationToken进行匹配。匹配成功则表示主体（Subject）认证成功，否则表示认证失败。
- EnterpriseCacheSessionDAO 提供了缓存功能的会话维护，默认情况下使用MapCache实现，内部使用 ConcurrentHashMap保存缓存的会话。 [20.Session持久化(SessionDAO)](https://blog.csdn.net/acmman/article/details/78955730)

### 参考文章
- [AuthorizingRealm用户认证以及授权](https://www.cnblogs.com/question-sky/p/6806419.html)
- [Shiro 中的 AuthenticationInfo](https://www.jianshu.com/p/c7b669bd9454)