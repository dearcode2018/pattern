/**
  * @filename User2.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.mediator;

 /**
 * @type User2
 * @description  
 * @author qye.zheng
 */
public final class User2 extends User
{

	/**
	 * @description 构造方法
	 * @param mediator
	 * @author qye.zheng
	 */
	public User2(Mediator mediator)
	{
		super(mediator);
	}
	@Override
	public void work()
	{
		System.out.println("User2.work()");
	}
}
