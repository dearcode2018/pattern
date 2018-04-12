/**
  * @filename ThreadSingletonC.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.singleton;

 /**
 * @type ThreadSingletonC
 * @description  
 * @author qye.zheng
 */
public final class ThreadSingletonC
{

	/* 持有私有的静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static ThreadSingletonC instance = null;
	
	/**
	 * @description 构造方法
	 * 私有化 - 防止实例化
	 * @author qye.zheng
	 */
	private ThreadSingletonC()
	{
	}

	/**
	 * 
	 * @description 单独把实例化抽取
	 * 作为一个独立的方法
	 * @author qye.zheng
	 */
	private static final synchronized void syncInit()
	{
		if (null == instance)
		{
			instance = new ThreadSingletonC();
		}
	}
	
	/**
	 * 
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	public static final ThreadSingletonC getInstance()
	{
		if (null == instance)
		{
			syncInit();
		}
		
		return instance;
	}

}
