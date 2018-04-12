/**
 * DynamicProxyHandler.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * DynamicProxyHandler
 * 描述: 动态代理实例 - 代理处理器
 * 可以作为jdk接口代理处理器 - 模板
 * @author  qye.zheng
 */
public final class DynamicProxyHandler implements InvocationHandler
{
	/*
	  理论上说，该处理器是通用的，但是由于不同的类其植入的逻辑
	  不同或者只是某些类有公共的需要植入的新逻辑，因此，该处理器
	  在某种程度上有一定的通用，但是这个由业务逻辑来决定的.
	 */

	/** 需要 被代理的对象 - 委托类对象 */
	private Object delegate;
	
	/**
	 * 
	 * @description 构造方法
	 * @param delegate 委托类对象
	 * @author qye.zheng
	 */
	public DynamicProxyHandler(Object delegate)
	{
		this.delegate = delegate;
	}
	
	/**
	 * 动态代理的逻辑 封装在这个方法中
	 *  
	 */
	/**
	 * 描述: 提供给 jdk Proxy 动态调用的方法
	 * @author  qye.zheng
	 * @param delegate
	 * @param method
	 * @param args
	 * @return 返回方法调用后的返回值
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object delegate, final Method method, final Object[] args)
			throws Throwable
	{
		/**
		 * 直接赋值给该参数，或者直接使用类的属性 传入 invoke
		 */
		// 将被代理对象传递给该方法的delegate参数
		delegate = this.delegate;
		
		/*
		 可以在代理方法调用前后添加功能 
		 */
		
		/** begin 动态调用植入新逻辑部分 */
		// 代理方法调用前添加 具体的逻辑
		System.out.println("DynamicProxyHandler.invoke() before");
		
		// 拦截/过滤处理: 决定是否调用
		final Object returnObject = method.invoke(delegate, args);
		
		// 代理方法调用后添加 具体的逻辑
		System.out.println("DynamicProxyHandler.invoke() after");
		
		// 返回值处理 (可以修改返回值...)
		
		/** end of 动态调用植入新逻辑部分 */
		
		return returnObject;
	}

}
