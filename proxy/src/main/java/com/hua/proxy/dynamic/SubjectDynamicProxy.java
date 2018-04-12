/**
  * @filename SubjectDynamicProxy.java
  * @description 
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.hua.proxy.Subject;

 /**
 * @type SubjectDynamicProxy
 * @description 
 * @author qye.zheng
 */
public class SubjectDynamicProxy {

	private Subject delegate;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public SubjectDynamicProxy(Subject delegate) {
		this.delegate = delegate;
	}
	
	/**
	 * 
	 * 描述: 以 被代理对象 为参数，返回 代理对象
	 * @author  qye.zheng
	 * @param delegate 委托类 对象
	 * @return
	 */
	public Subject getProxySubject() 
	{
		final InvocationHandler invocationHandler = new DynamicProxyHandler(delegate);
		final Subject proxy = (Subject) Proxy.newProxyInstance(
				invocationHandler.getClass().getClassLoader(), delegate.getClass().getInterfaces(), invocationHandler);
		
		return proxy;
	}
}
