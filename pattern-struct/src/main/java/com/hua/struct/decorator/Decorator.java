/**
  * @filename Decorator.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.decorator;

 /**
 * @type Decorator
 * @description  
 * @author qye.zheng
 */
public final class Decorator implements Sourceable
{
	// 持有被装饰对象的实例
	private Source source;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Decorator(final Source source)
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
		// 被装饰对象的逻辑执行之前
		System.out.println("before decorator");
		// 被装饰对象的逻辑 执行
		source.source();
		// 被装饰对象的逻辑执行之后
		System.out.println("after decorator");
	}

}
