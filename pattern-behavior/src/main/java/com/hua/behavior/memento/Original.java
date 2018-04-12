/**
  * @filename Original.java
  * @description  原始类，可以决定需要备份哪些属性
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.memento;

 /**
 * @type Original
 * @description  
 * @author qye.zheng
 */
public final class Original
{
	private String name;
	
	private Integer age;
	
	private String address;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Original()
	{
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
	public final Integer getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public final void setAge(Integer age)
	{
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public final String getAddress()
	{
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public final void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * 
	 * @description 这里只备份name属性
	 * @return
	 * @author qye.zheng
	 */
	public final Memento createMemento()
	{
		return new Memento(name);
	}
	
	/**
	 * 
	 * @description 恢复备忘录
	 * @param memento
	 * @author qye.zheng
	 */
	public final void restoreMemento(final Memento memento)
	{
		name = (String) memento.getValue();
	}
}
