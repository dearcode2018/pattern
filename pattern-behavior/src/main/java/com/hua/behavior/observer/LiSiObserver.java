/**
  * @filename LiSiObserver.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.observer;

 /**
 * @type LiSiObserver
 * @description  
 * @author qye.zheng
 */
public final class LiSiObserver implements Observer
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public LiSiObserver()
	{
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void update()
	{
		System.out.println("LiSiObserver.update()");
	}

}
