/**
  * @filename Computer.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.facade;

 /**
 * @type Computer
 * @description  计算机
 * @author qye.zheng
 */
public final class Computer implements Action
{
	/**
	 * Computer 类将其他部件类聚拢在一起，所有部件类直接
	 * 和Computer类发生关系，而它们之间则没有关系，这样
	 * 就起到了解耦的作用.
	 */
	
	private CPU cpu;
	
	private Memory memory;
	
	private Disk disk;
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Computer()
	{
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void startup()
	{
		System.out.println("Computer.startup()");
		disk.startup();
		memory.startup();
		cpu.startup();
	}

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void shutdown()
	{
		System.out.println("Computer.shutdown()");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
	}

}
