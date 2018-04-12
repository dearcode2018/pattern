/**
  * @filename ZhanSanObserver.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.observer;

 /**
 * @type ZhanSanObserver
 * @description  
 * @author qye.zheng
 */
public final class ZhanSanObserver implements Observer
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public ZhanSanObserver()
	{
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void update()
	{
		System.out.println("ZhanSanObserver.update()");
	}

}
