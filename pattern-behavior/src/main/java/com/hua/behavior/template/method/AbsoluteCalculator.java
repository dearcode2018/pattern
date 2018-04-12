/**
  * @filename AbsoluteCalculator.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.template.method;


 /**
 * @type AbsoluteCalculator
 * @description  
 * @author qye.zheng
 */
public abstract class AbsoluteCalculator
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
	 * 例如 1 + 2  或 3 * 4
	 * @return
	 * @author qye.zheng
	 */
	public abstract int calculate(final String expression);
	
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
