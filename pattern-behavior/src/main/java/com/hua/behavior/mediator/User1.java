/**
  * @filename User1.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.mediator;

 /**
 * @type User1
 * @description  
 * @author qye.zheng
 */
public final class User1 extends User
{

	/**
	 * @description 构造方法
	 * @param mediator
	 * @author qye.zheng
	 */
	public User1(Mediator mediator)
	{
		super(mediator);
	}

	@Override
	public void work()
	{
		System.out.println("User1.work()");
	}
}
