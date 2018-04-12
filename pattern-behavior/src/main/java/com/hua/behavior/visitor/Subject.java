/**
  * @filename Subject.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.visitor;

 /**
 * @type Subject
 * @description  
 * @author qye.zheng
 */
public interface Subject
{

	public void accept(final Visitor visitor);

	public String getContent();
}
