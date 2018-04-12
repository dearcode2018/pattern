/**
  * @filename AbstractBridge.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.bridge;

 /**
 * @type AbstractBridge
 * @description  
 * @author qye.zheng
 */
public abstract class AbstractBridge
{

	private Sourceable source;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public AbstractBridge()
	{
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	public void start()
	{
		source.source();
	}

	/**
	 * @return the source
	 */
	public final Sourceable getSource()
	{
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public final void setSource(Sourceable source)
	{
		this.source = source;
	}

}
