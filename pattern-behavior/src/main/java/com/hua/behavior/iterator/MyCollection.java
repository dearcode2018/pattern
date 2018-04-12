/**
  * @filename MyCollection.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.iterator;

 /**
 * @type MyCollection
 * @description  
 * @author qye.zheng
 */
public final class MyCollection implements Collection
{

	// 模拟元素
	private String[] elements = {"b", "c", "a", "overhaha"};
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public MyCollection()
	{
	}

	/**
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public Iterator iterator()
	{
		return new MyIterator(this);
	}

	/**
	 * @description 
	 * @param index
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public Object get(int index)
	{
		return elements[index];
	}

	/**
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public int size()
	{
		return elements.length;
	}

}
