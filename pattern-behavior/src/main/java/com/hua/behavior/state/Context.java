/**
  * @filename Context.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.state;

 /**
 * @type Context
 * @description  
 * @author qye.zheng
 */
public final class Context
{
	private State state;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Context(final State state)
	{
		this.state = state;
	}

	/**
	 * 
	 * @description 根据State对象的不同状态来
	 * 执行不同的操作.
	 * @author qye.zheng
	 */
	public void operation()
	{
		if ("online".equalsIgnoreCase(state.getValue()))
		{
			state.online();
		} else if ("offline".equalsIgnoreCase(state.getValue()))
		{
			state.offline();
		} else
		{
			System.out.println("other state value");
		}
	}

	/**
	 * @return the state
	 */
	public final State getState()
	{
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public final void setState(State state)
	{
		this.state = state;
	}
	
}
