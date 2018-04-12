/**
  * @filename MyHandler.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.chain.responsibility;

 /**
 * @type MyHandler
 * @description  
 * @author qye.zheng
 */
public final class MyHandler extends AbstractHandler implements Handler
{
	private String name;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public MyHandler(final String name)
	{
		this.name = name;
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void operate()
	{
		System.out.println("MyHandler.operate() -> " + name);
		// 下一级处理器
		if (null != getHandler())
		{
			getHandler().operate();
		}
	}

}
