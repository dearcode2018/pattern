/**
  * @filename PlusExpression.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.interpreter;

 /**
 * @type PlusExpression
 * @description  
 * @author qye.zheng
 */
public final class PlusExpression implements Expression
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public PlusExpression()
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
		return context.getNum1() + context.getNum2();
	}

}
