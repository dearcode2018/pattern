/**
  * @filename Iterator.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.iterator;

 /**
 * @type Iterator
 * @description  迭代器类型
 * @author qye.zheng
 */
public interface Iterator
{
	
	/**
	 * 
	 * @description 前移 返回上一个对象
	 * @return
	 * @author qye.zheng
	 */
	public Object previous();
	
	/**
	 * 
	 * @description 后移 下一个对象
	 * @return
	 * @author qye.zheng
	 */
	public Object next();
	
	public boolean hasNext();
	
	/**
	 * 
	 * @description 第一个元素
	 * @return
	 * @author qye.zheng
	 */
	public Object first();
	
	/**
	 * 
	 * @description 最后一个元素
	 * @return
	 * @author qye.zheng
	 */
	public Object last();
}
