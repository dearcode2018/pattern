/**
  * @filename MySubject.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.observer;

 /**
 * @type MySubject
 * @description  具体的主题类
 * @author qye.zheng
 */
public final class MySubject extends AbstractSubject
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public MySubject()
	{
	}
	
	/**
	 * 
	 * @description 该主题的业务逻辑
	 * @author qye.zheng
	 */
	@Override
	public final void operation()
	{
		System.out.println("MySubject.operation()");
		// 通知所有观察者
		notifyAllObserver();
		// 通知部分观察者
		// 通知某个观察者
	}
	
	
}
