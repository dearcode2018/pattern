/**
  * @filename ObjectAdaptor.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.adaptor;

 /**
 * @type ObjectAdaptor
 * @description  对象的适配器-模式
 * @author qye.zheng
 */
public final class ObjectAdaptor implements Targetable
{
	// 持有原始类的对象
	private Source source;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public ObjectAdaptor(final Source source)
	{
		this.source = source;
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void source()
	{
		source.source();
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void target()
	{
		System.out.println("ObjectAdaptor.target()");
	}

}
