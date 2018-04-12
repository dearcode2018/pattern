/**
  * @filename Observer.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.observer;

 /**
 * @type Observer
 * @description  观察者
 * @author qye.zheng
 */
public interface Observer
{
	/**
	 * 
	 * @description 主题发生变化的时候触发
	 * @author qye.zheng
	 */
	public void update();
}
