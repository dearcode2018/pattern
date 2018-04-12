/**
  * @filename Memory.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.facade;

 /**
 * @type Memory
 * @description  内存
 * @author qye.zheng
 */
public final class Memory implements Action
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Memory()
	{
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void startup()
	{
		System.out.println("Memory.startup()");
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void shutdown()
	{
		System.out.println("Memory.shutdown()");
	}

}
