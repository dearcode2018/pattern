/**
  * @filename ICalculator.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.strategy;

 /**
 * @type ICalculator
 * @description  
 * @author qye.zheng
 */
public interface ICalculator
{
	/**
	 * 
	 * @description 
	 * @param expression 表达式
	 * 例如 1 + 2  或 3 * 4
	 * @return
	 * @author qye.zheng
	 */
	public int calculate(final String expression);
}
