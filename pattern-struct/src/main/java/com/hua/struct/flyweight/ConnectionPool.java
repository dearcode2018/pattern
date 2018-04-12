/**
  * @filename ConnectionPool.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 /**
 * @type ConnectionPool
 * @description  
 * @author qye.zheng
 */
public final class ConnectionPool
{
   private List<Connection> pool;  
      
    /*公有属性*/  
    private String url = "jdbc:mysql://localhost:3306/test";  
    private String username = "root";  
    private String password = "root";  
    private String driverClassName = "com.mysql.jdbc.Driver"; 
	
    private Connection conn;
    
	private int poolSize = 100;
	 
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	private ConnectionPool()
	{
		pool = new ArrayList<Connection>();
		// 初始化指定的数量
		for (int i = 0; i < poolSize; i++)
		{
			try
			{
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, username, password);
				pool.add(conn);
			} catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 * @type ConnectionPoolSingleton
	 * @description  
	 * @author qye.zheng
	 */
	private static final class ConnectionPoolSingleton
	{
		private static final ConnectionPool instance = new ConnectionPool();  
	}
	
	/**
	 * @return the instance
	 */
	public static final ConnectionPool getInstance()
	{
		return ConnectionPoolSingleton.instance;
	}

	/**
	 * 
	 * @description 返回连接池中的一个数据库连接
	 * @return
	 * @author qye.zheng
	 */
	public synchronized Connection getConnection()
	{
		if (pool.size() > 0)
		{
			conn = pool.get(0);
			pool.remove(conn);
		}
		
		return conn;
	}
	
	/**
	 * 
	 * @description 返回连接到连接池
	 * 释放连接
	 * @param c
	 * @return
	 * @author qye.zheng
	 */
	public synchronized boolean release(final Connection c)
	{
		return pool.add(c);
	}
	
}
