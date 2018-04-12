/**
  * @filename AbstractHandler.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.chain.responsibility;

 /**
 * @type AbstractHandler
 * @description  
 * @author qye.zheng
 */
public abstract class AbstractHandler implements Handler
{

	private Handler handler;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public AbstractHandler()
	{
	}

	/**
	 * @return the handler
	 */
	public final Handler getHandler()
	{
		return handler;
	}

	/**
	 * @param handler the handler to set
	 */
	public final void setHandler(Handler handler)
	{
		this.handler = handler;
	}

}
