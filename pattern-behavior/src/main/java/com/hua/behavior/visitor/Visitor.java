/**
  * @filename Visitor.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.behavior.visitor;

 /**
 * @type Visitor
 * @description  访问者
 * @author qye.zheng
 */
public interface Visitor
{
	public void visit(final Subject subject);
}
