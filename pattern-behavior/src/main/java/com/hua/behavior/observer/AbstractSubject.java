/**
  * @filename AbstractSubject.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.observer;

import java.util.ArrayList;
import java.util.List;

 /**
 * @type AbstractSubject
 * @description 抽象的主题类 
 * @author qye.zheng
 */
public abstract class AbstractSubject implements Subject
{
	/* 观察者列表 */
	private List<Observer> observers = new ArrayList<Observer>();
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public AbstractSubject()
	{
	}

	/**
	 * 
	 * @description 添加观察者
	 * @param observer
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public boolean add(final Observer observer)
	{
		return observers.add(observer);
	}
	
	/**
	 * 
	 * @description 移除观察者
	 * @param observer
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public boolean remove(final Observer observer)
	{
		return observers.remove(observer);
	}
	
	/**
	 * 
	 * @description 通知某个指定的观察者
	 * @param observer
	 * @author qye.zheng
	 */
	@Override
	public void notify(final Observer observer)
	{
		// 调用该观察者的更新方法
		observer.update();
	}
	
	/**
	 * 
	 * @description 通知一批观察者
	 * @author qye.zheng
	 */
	@Override
	public void notifyObservers(final List<Observer> observers)
	{
		for (Observer observer : observers)
		{
			observer.update();
		}
	}

	/**
	 * 
	 * @description 通知所有的观察者
	 * @author qye.zheng
	 */
	@Override
	public void notifyAllObserver()
	{
		for (Observer observer : observers)
		{
			observer.update();
		}
	}
	
}
