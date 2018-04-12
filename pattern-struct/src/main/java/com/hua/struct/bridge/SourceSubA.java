/**
  * @filename SourceSubA.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.bridge;

 /**
 * @type SourceSubA
 * @description  
 * @author qye.zheng
 */
public final class SourceSubA implements Sourceable
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public SourceSubA()
	{
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void source()
	{
		System.out.println("SourceSubA.source()");
	}

}
