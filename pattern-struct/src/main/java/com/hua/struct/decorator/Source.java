/**
  * @filename Source.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.decorator;

 /**
 * @type Source
 * @description  
 * @author qye.zheng
 */
public final class Source implements Sourceable
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Source()
	{
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void source()
	{
		System.out.println("Source.source()");
	}

}
