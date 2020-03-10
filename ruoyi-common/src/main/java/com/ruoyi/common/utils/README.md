## 知识点
### BeanUtils 更适合做属性拷贝  [Bean 工具类](./bean/BeanUtils.java)
### indexOf() 方法有以下四种形式： [客户端工具类](./ServletUtils.java)
- public int indexOf(int ch): 返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
- public int indexOf(int ch, int fromIndex): 返回从 fromIndex 位置开始查找指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
- int indexOf(String str): 返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
- int indexOf(String str, int fromIndex): 返回从 fromIndex 位置开始查找指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。

### spring工具类 方便在非spring管理环境中获取bean [spring工具类](./spring/SpringUtils.java)