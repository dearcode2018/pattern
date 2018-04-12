/**
  * @filename MyMediator.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.mediator;

 /**
 * @type MyMediator
 * @description  
 * @author qye.zheng
 */
public final class MyMediator implements Mediator
{
	private User user1;
	
	private User user2;
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public MyMediator()
	{
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void createMediator()
	{
		user1 = new User1(this);
		user2 = new User2(this);
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void workAll()
	{
		user1.work();
		user2.work();
	}

}
