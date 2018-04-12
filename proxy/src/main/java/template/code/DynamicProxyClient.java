/**
 * DynamicProxyClient.java
 * @author  qye.zheng
 * 	version 1.0
 */
package template.code;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.hua.proxy.Subject;


/**
 * DynamicProxyClient
 * 描述: 动态代理客户端
 * @author  qye.zheng
 */
public final class DynamicProxyClient
{

	/**
	 * 
	 * 描述: 以 被代理对象 为参数，返回 代理对象
	 * @author  qye.zheng
	 * @param delegate 委托类 对象
	 * @return
	 */
	public static Subject getProxySubject(final Subject delegate) 
	{
/*		final InvocationHandler invocationHandler = new DynamicProxyHandler(delegate);
		final Subject proxy = (Subject) Proxy.newProxyInstance(
				invocationHandler.getClass().getClassLoader(), delegate.getClass().getInterfaces(), invocationHandler);*/
		
		return null;
	}
}
