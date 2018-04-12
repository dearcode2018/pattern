/**
  * @filename AbsoluteCalculator.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.strategy;

 /**
 * @type AbsoluteCalculator
 * @description  
 * @author qye.zheng
 */
public abstract class AbsoluteCalculator implements ICalculator
{

	// 操作符
	private String operator;
	
	/**
	 * @description 构造方法
	 * @param operator
	 * @author qye.zheng
	 */
	public AbsoluteCalculator(final String operator)
	{
		this.operator = operator;
	}

	/**
	 * 
	 * @description 
	 * @param expression 表达式
	 * @return
	 * @author qye.zheng
	 */
	public int[] split(final String expression)
	{
		final String regex = "\\" + operator;
		final String[] nums = expression.split(regex);
		final int[] arrayInt = new int[2];
		int i = 0;
		arrayInt[i] = Integer.parseInt(nums[i]);
		i++;
		arrayInt[i] = Integer.parseInt(nums[i]);
		
		return arrayInt;
	}
	
}
