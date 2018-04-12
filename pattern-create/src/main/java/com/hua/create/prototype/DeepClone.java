/**
  * @filename DeepClone.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.hua.util.IOUtil;

 /**
 * @type DeepClone
 * @description  深克隆
 * @author qye.zheng
 */
public final class DeepClone implements Cloneable, Serializable
{

	/**
	 * 实现Cloneable标识接口，覆写Object的clone方法
	 * 不用覆写clone方法也可以，克隆方法名任意起
	 */
	
	private static final long serialVersionUID = 1L;

	private String name;
	
	private int age;
	
	private String address;
	
	// 自定义的可序列化的类型
	private SerializableObject obj;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public DeepClone()
	{
	}

	/**
	 * @description 浅克隆
	 * @return
	 * @throws CloneNotSupportedException
	 * @author qye.zheng
	 */
	public DeepClone shallowClone() throws CloneNotSupportedException
	{
		// 浅克隆
		final DeepClone clone = (DeepClone) super.clone();
		
		return clone;
	}
	
	/**
	 * 
	 * @description 深克隆
	 * @return
	 * @author qye.zheng
	 */
	public DeepClone deepClone()
	{
		/**
		 * 深克隆需要采用流的形式将当前对象转成二进制流载入内存，
		 * 然后再将该二进制流输出到克隆后的对象.
		 * 输出: 将该对象以二进制刘输出到内存
		 * 输入: 将二进制流输入到克隆对象
		 */
		DeepClone clone = null;
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;		
		try
		{
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			// 将当前对象以二进制流载入内存
			oos.writeObject(this);
			
			/* 从二进制流读入生成一个新对象 */
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			clone = (DeepClone) ois.readObject();
			
		} catch (IOException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} finally 
		{
			IOUtil.close(ois);
			IOUtil.close(bis);
			IOUtil.close(oos);
			IOUtil.close(bos);
		}
		
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
	 * @return the obj
	 */
	public final SerializableObject getObj()
	{
		return obj;
	}

	/**
	 * @param obj the obj to set
	 */
	public final void setObj(SerializableObject obj)
	{
		this.obj = obj;
	}

}

/**
 * 
 * @type SerializableObject
 * @description 自定义的可序列化的类型
 * @author qye.zheng
 */
class SerializableObject implements Serializable
{

	private static final long serialVersionUID = 1L;
	
}


