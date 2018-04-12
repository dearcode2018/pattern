/**
  * @filename SourceSubB.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.bridge;


 /**
 * @type SourceSubB
 * @description  
 * @author qye.zheng
 */
public final class SourceSubB implements Sourceable
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public SourceSubB()
	{
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void source()
	{
		System.out.println("SourceSubB.source()");
	}

}
