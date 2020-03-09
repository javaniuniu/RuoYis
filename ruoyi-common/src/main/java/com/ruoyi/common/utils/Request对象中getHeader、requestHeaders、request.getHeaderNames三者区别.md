# Request对象中getHeader、requestHeaders、request.getHeaderNames三者区别

1.request.getHeader("Accept-Encoding");//获取单个请求头name对应的value值

2.request.getHeaders("Accept-Encoding");//获取多个同名请求头对应的一组value值，因此返回枚举类型数据

3.request.getHeaderNames();//获取请求头的所有name值,返回的数据也是一个枚举类型的数据，将枚举中的元素依次遍历出来，根据name获取对应的value值，即可得到Http请求头的所有信息

示例代码如下：
```java
package TwoDay.request;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 获取头信息和请求数据
 */
public class RequestDemo2 extends HttpServlet {
 
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * 获取头信息
		 */
		String headValue = request.getHeader("Accept-Encoding");//获取单个请求头name对应的value值
		System.out.println(headValue);
		
		System.out.println("--------------");
		
		Enumeration e =  request.getHeaders("Accept-Encoding");//获取多个同名请求头对应的一组value值，因此返回枚举类型数据
		/**
		 * 将数据遍历出来
		 */
		while(e.hasMoreElements()){
		//遍历枚举中存储的每一个元素
		String value = (String)e.nextElement();
		System.out.println(value);//将值输出
		}
		
		System.out.println("----------------");
		/**
		 * 获取所有请求头信息
		 */
		Enumeration er = request.getHeaderNames();//获取请求头的所有name值
		while(er.hasMoreElements()){
		String name	=(String) er.nextElement();
		String value = request.getHeader(name);
		System.out.println(name+"="+value);
		}
	}
 
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 
		
	}
 
}
```

运行结果如下：
```text
Accept: image/webp,image/apng,image/*,*/*;q=0.8
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9,en;q=0.8,zh-TW;q=0.7
Connection: keep-alive
Cookie: _ga=GA1.1.1091106062.1571753560; Idea-b3816d9f=2eec8707-0809-4668-9fbf-d701bfce6229; JSESSIONID=1b7ebe59-ebe0-40cd-815d-d40fb061e019
DNT: 1
Host: localhost:8080
Referer: http://localhost:8080/login
Sec-Fetch-Dest: image
Sec-Fetch-Mode: no-cors
Sec-Fetch-Site: same-origin
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.132 Safari/537.36
```