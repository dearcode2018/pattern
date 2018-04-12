/**
  * @filename User.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.mediator;

 /**
 * @type User
 * @description  
 * @author qye.zheng
 */
public abstract class User
{
	private Mediator mediator;
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public User(final Mediator mediator)
	{
		this.mediator = mediator;
	}
	/**
	 * @return the mediator
	 */
	public final Mediator getMediator()
	{
		return mediator;
	}
	/**
	 * @param mediator the mediator to set
	 */
	public final void setMediator(Mediator mediator)
	{
		this.mediator = mediator;
	}

	public abstract void work();
}
