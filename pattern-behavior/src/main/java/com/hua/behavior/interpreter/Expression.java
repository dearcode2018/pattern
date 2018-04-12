/**
  * @filename Expression.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.interpreter;

 /**
 * @type Expression
 * @description  
 * @author qye.zheng
 */
public interface Expression
{
	public int interpret(final Context context);
}
