/**
  * @filename SimpleSingletonB.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.singleton;

 /**
 * @type SimpleSingletonB
 * @description  
 * @author qye.zheng
 */
public final class SimpleSingletonB
{
	/* 持有私有的静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static SimpleSingletonB instance = null;
	
	/**
	 * @description 构造方法
	 * 私有化 - 防止实例化
	 * @author qye.zheng
	 */
	private SimpleSingletonB()
	{
	}
	
	/**
	 * 
	 * @description 获取单例对象
	 * 没有考虑多线程安全问题
	 * @return
	 * @author qye.zheng
	 */
	public static final SimpleSingletonB getInstance()
	{
		// 没有考虑多线程安全问题
		instance = new SimpleSingletonB();
		
		return instance;
	}

}
