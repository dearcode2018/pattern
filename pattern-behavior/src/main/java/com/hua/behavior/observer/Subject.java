/**
  * @filename Subject.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.observer;

import java.util.List;

 /**
 * @type Subject
 * @description  业务主题
 * @author qye.zheng
 */
public interface Subject
{
	/**
	 * 
	 * @description 添加观察者
	 * @param observer
	 * @return
	 * @author qye.zheng
	 */
	public boolean add(final Observer observer);
	
	/**
	 * 
	 * @description 移除观察者
	 * @param observer
	 * @return
	 * @author qye.zheng
	 */
	public boolean remove(final Observer observer);
	
	/**
	 * 
	 * @description 通知某个指定的观察者
	 * @param observer
	 * @author qye.zheng
	 */
	public void notify(final Observer observer);
	
	/**
	 * 
	 * @description 通知一批观察者
	 * @author qye.zheng
	 */
	public void notifyObservers(final List<Observer> observers);	

	/**
	 * 
	 * @description 通知所有的观察者
	 * @author qye.zheng
	 */
	public void notifyAllObserver();
	
	/**
	 * 
	 * @description 该主题的业务逻辑
	 * @author qye.zheng
	 */
	public void operation();
	
}
