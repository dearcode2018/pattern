/**
  * @filename Plus.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.strategy;

 /**
 * @type Plus
 * @description  加法运算器
 * @author qye.zheng
 */
public final class Plus extends AbsoluteCalculator implements ICalculator
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Plus()
	{
		super("+");
	}

	/**
	 * @description 
	 * @param expression
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public int calculate(String expression)
	{
		int[] arrayInt = split(expression);
		
		return arrayInt[0] + arrayInt[1];
	}

}
