/**
  * @filename TreeNode.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.composite;

import java.util.ArrayList;
import java.util.List;

 /**
 * @type TreeNode
 * @description  数节点
 * @author qye.zheng
 */
public final class TreeNode
{

	private String name;
	
	/* 父节点 */
	private TreeNode parent;
	
	/* 孩子节点 */
	private List<TreeNode> children = new ArrayList<TreeNode>();
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public TreeNode(final String name)
	{
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public final String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the parent
	 */
	public final TreeNode getParent()
	{
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public final void setParent(TreeNode parent)
	{
		this.parent = parent;
	}

	/**
	 * 
	 * @description 添加子节点
	 * @param node
	 * @return
	 * @author qye.zheng
	 */
	public boolean add(final TreeNode node)
	{
		return children.add(node);
	}

	/**
	 * 
	 * @description 删除子节点
	 * @param node
	 * @return
	 * @author qye.zheng
	 */
	public boolean remove(final TreeNode node)
	{
		return children.remove(node);
	}

	/**
	 * @return the children
	 */
	public final List<TreeNode> getChildren()
	{
		return children;
	}
}
