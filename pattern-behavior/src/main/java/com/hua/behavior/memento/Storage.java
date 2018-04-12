/**
  * @filename Storage.java
  * @description  存储 备忘录 对象，不能做修改操作
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.memento;

 /**
 * @type Storage
 * @description  
 * @author qye.zheng
 */
public final class Storage
{

	private Memento memento;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Storage(final Memento memento)
	{
		this.memento = memento;
	}

	/**
	 * @return the memento
	 */
	public final Memento getMemento()
	{
		return memento;
	}

	/**
	 * @param memento the memento to set
	 */
	public final void setMemento(Memento memento)
	{
		this.memento = memento;
	}
}
