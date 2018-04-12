/**
  * @filename ClassAdaptor.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.adaptor;

 /**
 * @type ClassAdaptor
 * @description  类的适配器-模式
 * @author qye.zheng
 */
public class ClassAdaptor extends Source implements Targetable
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public ClassAdaptor()
	{
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void target()
	{
		System.out.println("ClassAdaptor.target()");
	}

}
