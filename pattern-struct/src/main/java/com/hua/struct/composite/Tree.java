/**
  * @filename Tree.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.composite;

 /**
 * @type Tree
 * @description  
 * @author qye.zheng
 */
public final class Tree
{

	private TreeNode root;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Tree(final String name)
	{
		root = new TreeNode(name);
	}

	/**
	 * @return the root
	 */
	public final TreeNode getRoot()
	{
		return root;
	}

}
