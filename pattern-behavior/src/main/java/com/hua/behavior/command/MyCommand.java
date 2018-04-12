/**
  * @filename MyCommand.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.command;

 /**
 * @type MyCommand
 * @description  
 * @author qye.zheng
 */
public final class MyCommand implements Command
{

	private Receiver receiver;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public MyCommand(final Receiver receiver)
	{
		this.receiver = receiver;
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void execute()
	{
		receiver.action();
	}

}
