/**
  * @filename Context.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.interpreter;

 /**
 * @type Context
 * @description  
 * @author qye.zheng
 */
public final class Context
{

	private int num1;
	
	private int num2;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Context(final int num1, final int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * @return the num1
	 */
	public final int getNum1()
	{
		return num1;
	}

	/**
	 * @param num1 the num1 to set
	 */
	public final void setNum1(int num1)
	{
		this.num1 = num1;
	}

	/**
	 * @return the num2
	 */
	public final int getNum2()
	{
		return num2;
	}

	/**
	 * @param num2 the num2 to set
	 */
	public final void setNum2(int num2)
	{
		this.num2 = num2;
	}

}
