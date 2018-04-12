/**
  * @filename ThreadSingletonC.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.singleton;

import java.util.Vector;

 /**
 * @type ThreadSingletonC
 * @description  
 * @author qye.zheng
 */
public final class UpdatePropertySingleton
{

	/* 持有私有的静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static UpdatePropertySingleton instance = null;
	
	private Vector properties = null;
	
	/**
	 * @description 构造方法
	 * 私有化 - 防止实例化
	 * @author qye.zheng
	 */
	private UpdatePropertySingleton()
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
			instance = new UpdatePropertySingleton();
		}
	}
	
	/**
	 * 
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	public static final UpdatePropertySingleton getInstance()
	{
		if (null == instance)
		{
			syncInit();
		}
		
		return instance;
	}

	/**
	 * @return the properties
	 */
	public final Vector getProperties()
	{
		return properties;
	}

	/**
	 * 
	 * @description 更新属性
	 * 说明: 暂不明确该方法如何完善
	 * @author qye.zheng
	 */
	public final void updateProperties()
	{
		// 影子
		UpdatePropertySingleton shadow = 
				new UpdatePropertySingleton();
		properties = shadow.getProperties();
	}
	
}
