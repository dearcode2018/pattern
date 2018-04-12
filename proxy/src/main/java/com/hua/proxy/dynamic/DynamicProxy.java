/**
 * @filename DynamicProxy.java
 * @description 
 * @version 1.0
 * @author qye.zheng
 */
package com.hua.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @type DynamicProxy
 * @description 通用 动态代理
 * @author qye.zheng
 */
// <I> 业务接口1
public class DynamicProxy<I> {

	private I delegate;
	
	private InvocationHandler invocationHandler;

	/**
	 * @description 构造方法
	 * @param delegate
	 * @param invocationHandler
	 * @author qye.zheng
	 */
	public DynamicProxy(final I delegate, final InvocationHandler invocationHandler) {
		this.delegate = delegate;
		this.invocationHandler = invocationHandler;
	}

	/**
	 * 
	 * 描述: 以 被代理对象 为参数，返回 代理对象
	 * 
	 * @author qye.zheng
	 * @param delegate
	 *            委托类 对象
	 * @return
	 */
	public I getProxySubject() {
		@SuppressWarnings({"unchecked"})
		final I proxy = (I) Proxy.newProxyInstance(invocationHandler.getClass()
				.getClassLoader(), delegate.getClass().getInterfaces(),
				invocationHandler);
		
		return proxy;
	}

}
