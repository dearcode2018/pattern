/**
  * @filename State.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.state;

 /**
 * @type State
 * @description  
 * @author qye.zheng
 */
public final class State
{
	private String value;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public State()
	{
	}

	/**
	 * 
	 * @description 在线
	 * @author qye.zheng
	 */
	public void online()
	{
		System.out.println("State.online()");
	}
	
	/**
	 * 
	 * @description 下线
	 * @author qye.zheng
	 */
	public void offline()
	{
		System.out.println("State.offline()");
	}

	/**
	 * @return the value
	 */
	public final String getValue()
	{
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public final void setValue(String value)
	{
		this.value = value;
	}
	
}
