/**
  * @filename ThreadSingletonA.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.singleton;

 /**
 * @type ThreadSingletonA
 * @description  
 * @author qye.zheng
 */
public class ThreadSingletonA
{

	/* 持有私有的静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static ThreadSingletonA instance = null;
	
	/**
	 * @description 构造方法
	 * 私有化 - 防止实例化
	 * @author qye.zheng
	 */
	private ThreadSingletonA()
	{
	}

	/**
	 * 
	 * @description 获取单例对象
	 * 考虑多线程安全问题
	 * 在方法上声明 synchronized
	 * 缺点: 在每次调用此方法的时候都加锁，效率低、性能差
	 * @return
	 * @author qye.zheng
	 */
	public static final synchronized ThreadSingletonA getInstance()
	{
		if (null == instance)
		{
			instance = new ThreadSingletonA();
		}
		
		return instance;
	}
	
}
