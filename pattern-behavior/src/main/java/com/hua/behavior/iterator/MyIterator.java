/**
  * @filename MyIterator.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.iterator;

 /**
 * @type MyIterator
 * @description  
 * @author qye.zheng
 */
public final class MyIterator implements Iterator
{
	private Collection collection;
	
	// 游标值
	private int pos = -1;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public MyIterator(final Collection collection)
	{
		this.collection = collection;
	}

	/**
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public Object previous()
	{
		if (pos > 0)
		{
			pos--;
		}
		
		return collection.get(pos);
	}

	/**
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public Object next()
	{
		if (pos < (collection.size() - 1))
		{
			pos++;
		}
		
		return collection.get(pos);
	}

	/**
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public boolean hasNext()
	{
		return (pos < (collection.size() - 1));
	}

	/**
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public Object first()
	{
		pos = 0;
		return collection.get(pos);
	}

	/**
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public Object last()
	{
		pos = collection.size() - 1;
		return collection.get(pos);
	}

}
