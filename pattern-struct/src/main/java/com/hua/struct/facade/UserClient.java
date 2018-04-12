/**
  * @filename UserClient.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.facade;

 /**
 * @type UserClient
 * @description  
 * @author qye.zheng
 */
public final class UserClient implements Action
{

	private Computer computer;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public UserClient(final Computer computer)
	{
		this.computer = computer;
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void startup()
	{
		computer.startup();
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void shutdown()
	{
		computer.shutdown();
	}

}
