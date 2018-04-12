/**
  * @filename MyVisitor.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.visitor;

 /**
 * @type MyVisitor
 * @description  
 * @author qye.zheng
 */
public final class MyVisitor implements Visitor
{

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public MyVisitor()
	{
	}

	/**
	 * @description 
	 * @param subject
	 * @author qye.zheng
	 */
	@Override
	public void visit(Subject subject)
	{
		System.out.println("visit subject is " + subject.getContent());
	}

}
