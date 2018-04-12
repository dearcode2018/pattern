/**
  * @filename MySubject.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.visitor;

 /**
 * @type MySubject
 * @description  
 * @author qye.zheng
 */
public final class MySubject implements Subject
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public MySubject()
	{
	}

	/**
	 * @description 
	 * @param visitor
	 * @author qye.zheng
	 */
	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}

	/**
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public String getContent()
	{
		return "love 2014";
	}

}
