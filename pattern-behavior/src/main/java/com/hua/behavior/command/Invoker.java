/**
  * @filename Invoker.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.command;

 /**
 * @type Invoker
 * @description  调用者 (发出命令  - 司令)
 * @author qye.zheng
 */
public final class Invoker
{
	
	private Command command;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Invoker(final Command command)
	{
		this.command = command;
	}

	/**
	 * 
	 * @description 下命令
	 * @author qye.zheng
	 */
	public void command()
	{
		command.execute();
	}
	
}
