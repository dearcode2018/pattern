/**
  * @filename SimpleSingletonA.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.singleton;

 /**
 * @type SimpleSingletonA
 * @description  简单单例 A
 * @author qye.zheng
 */
public final class SimpleSingletonA
{
	/* 持有私有的静态实例，防止被引用，此处赋值，没有实现延迟加载 */
	private static final SimpleSingletonA instance = new SimpleSingletonA();
	
	/**
	 * @description 构造方法
	 * 私有化 - 防止实例化
	 * @author qye.zheng
	 */
	private SimpleSingletonA()
	{
	}
	
	/**
	 * 
	 * @description 获取单例对象
	 * 没有考虑多线程安全问题
	 * @return
	 * @author qye.zheng
	 */
	public static final SimpleSingletonA getInstance()
	{
		return instance;
	}
}
