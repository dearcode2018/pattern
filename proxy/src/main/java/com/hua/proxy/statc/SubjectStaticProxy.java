/**
  * @filename SubjectStaticProxy.java
  * @description 
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.proxy.statc;

import com.hua.proxy.Subject;

 /**
 * @type SubjectStaticProxy
 * @description 静态代理
 * @author qye.zheng
 */
public class SubjectStaticProxy implements Subject {

	/* 委托类 对象 */
	private Subject delegate;
	
	/**
	 * @description 构造方法
	 * @param delegate
	 * @author qye.zheng
	 */
	public SubjectStaticProxy(final Subject delegate) {
		this.delegate = delegate;
	}
	
	/**
	 * @description 
	 * @param key
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public String open(Integer key) {
		// 前置处理
		System.out.println("SubjectStaticProxy.open invocate");
		
		// 拦截/过滤处理: 决定是否调用
		String result = delegate.open(key);
		
		// 后置处理
		System.out.println("SubjectStaticProxy.open invocate over");
		
		// 返回值处理: 可以修改返回值等..
		//result = "";
		
		return result;
	}

	/**
	 * @description 
	 * @param name
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public int status(String name) {
		// 前置处理
		System.out.println("SubjectStaticProxy.status invocate");
		
		// 拦截/过滤处理: 决定是否调用
		int result = delegate.status(name);
		
		// 后置处理
		System.out.println("SubjectStaticProxy.status invocate over");
		
		// 返回值处理: 可以修改返回值等..
		//result = 1;
		
		return result;
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void close() {
		// 前置处理
		System.out.println("SubjectStaticProxy.status invocate");
		
		// 拦截/过滤处理: 决定是否调用
		delegate.close();
		
		// 后置处理
		System.out.println("SubjectStaticProxy.status invocate over");
	}

	
}
