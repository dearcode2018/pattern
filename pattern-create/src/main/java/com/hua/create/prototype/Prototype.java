/**
  * @filename Prototype.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.prototype;

 /**
 * @type Prototype
 * @description  
 * @author qye.zheng
 */
public final class Prototype implements Cloneable
{

	/**
	 * 实现Cloneable标识接口，覆写Object的clone方法
	 */
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Prototype()
	{
	}

	/**
	 * @description 
	 * @return
	 * @throws CloneNotSupportedException
	 * @author qye.zheng
	 */
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
