/**
 * @filename Proxy.java
 * @description  
 * @version 1.0
 * @author qye.zheng
 */
package com.hua.struct.proxy;

/**
 * @type Proxy
 * @description 代理模式
 * @author qye.zheng
 */
public final class Proxy implements Sourceable
{
	// 持有被代理对象的实例
	private Source source;

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Proxy()
	{
		this.source = new Source();
	}

	/**
	 * @description
	 * @author qye.zheng
	 */
	@Override
	public void source()
	{
		// 被代理对象的逻辑执行之前
		atfer();
		// 被代理对象的逻辑 执行
		source.source();
		// 被代理对象的逻辑执行之后
		before();
	}

	private void atfer()
	{
		System.out.println("after proxy!");
	}

	private void before()
	{
		System.out.println("before proxy!");
	}
}
