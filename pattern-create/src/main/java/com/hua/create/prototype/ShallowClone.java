/**
  * @filename ShallowClone.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.prototype;

 /**
 * @type ShallowClone
 * @description  浅克隆
 * @author qye.zheng
 */
public final class ShallowClone implements Cloneable
{

	private String name;
	
	private int age;
	
	/**
	 * 实现Cloneable标识接口，覆写Object的clone方法
	 * 不用覆写clone方法也可以，克隆方法名任意起
	 */
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public ShallowClone()
	{
	}
	
	/**
	 * @description 浅克隆
	 * @return
	 * @throws CloneNotSupportedException
	 * @author qye.zheng
	 */
	public ShallowClone shallowClhone() throws CloneNotSupportedException
	{
		// 浅克隆
		final ShallowClone clone = (ShallowClone) super.clone();
		
		return clone;
	}

	/**
	 * @return the name
	 */
	public final String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public final int getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public final void setAge(int age)
	{
		this.age = age;
	}

}
