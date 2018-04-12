/**
  * @filename CPU.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.facade;

 /**
 * @type CPU
 * @description  
 * @author qye.zheng
 */
public final class CPU implements Action
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public CPU()
	{
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void startup()
	{
		System.out.println("CPU.startup()");
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void shutdown()
	{
		System.out.println("CPU.shutdown()");
	}

}
