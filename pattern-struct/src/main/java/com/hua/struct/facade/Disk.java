/**
  * @filename Disk.java
  * @description  硬盘
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.facade;

 /**
 * @type Disk
 * @description  
 * @author qye.zheng
 */
public final class Disk implements Action
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Disk()
	{
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void startup()
	{
		System.out.println("Disk.startup()");
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void shutdown()
	{
		System.out.println("Disk.shutdown()");
	}

}
