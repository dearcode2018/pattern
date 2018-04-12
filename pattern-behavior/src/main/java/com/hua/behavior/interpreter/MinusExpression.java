/**
  * @filename MinusExpression.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.interpreter;

 /**
 * @type MinusExpression
 * @description  
 * @author qye.zheng
 */
public final class MinusExpression implements Expression
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public MinusExpression()
	{
	}

	/**
	 * @description 
	 * @param context
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public int interpret(Context context)
	{
		return context.getNum1() - context.getNum2();
	}

}
