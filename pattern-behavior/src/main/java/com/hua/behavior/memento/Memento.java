/**
  * @filename Memento.java
  * @description  备忘录对象，存储原始对象的某个属性值
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.memento;

 /**
 * @type Memento
 * @description  
 * @author qye.zheng
 */
public final class Memento
{

	private Object value;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Memento(final Object value)
	{
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public final Object getValue()
	{
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public final void setValue(Object value)
	{
		this.value = value;
	}
}
