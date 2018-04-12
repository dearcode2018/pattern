/**
  * @filename SubSource1.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.adaptor;

 /**
 * @type SubSource1
 * @description  
 * @author qye.zheng
 */
public class SubSource1 extends AbstractSource
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public SubSource1()
	{
	}

	/**
	 * @description 随意选择要覆盖的方法
	 * @author qye.zheng
	 */
	@Override
	public void source1()
	{
		System.out.println("SubSource1.source1()");
	}
}
