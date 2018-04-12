/**
  * @filename Collection.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.iterator;

 /**
 * @type Collection
 * @description  集合类型
 * @author qye.zheng
 */
public interface Collection
{
	public Iterator iterator();
	
	public Object get(final int index);
	
	public int size();
	
}
