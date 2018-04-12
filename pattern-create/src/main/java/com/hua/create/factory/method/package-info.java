/**
 * @filename package-info.java
 * @description  
 * @version 1.0
 * @author qye.zheng
 */
/**
 * @type package-info
 * @description  设计模式-创建型->工厂方法模式
 * @author qye.zheng
 */
package com.hua.create.factory.method;

/**
 * 工厂方法模式
 * 1) 普通工厂
 * 通过 枚举或字符串、数值、布尔值等值来标识通知工厂生产哪些类型的对象.
 * 工厂需要实例化后才能使用.
 * 
 * 2) 多个工厂方法
 * 在工厂中，一个特定的方法负责创建一个特定类型的对象
 * 工厂需要实例化后才能使用.
 * 
 * 3) 静态工厂方法
 * 在工厂中，一个特定的静态方法责创建一个特定类型的对象
 * 工厂无需实例化，而直接调用静态方法即可.
 * 
 *工厂方法模式 - 总结
 * 1) 第一个种情况可以传入字符串或枚举类型的值，需要实例化
 * 
 * 2) 第三种相对前面2种，无需实例化，直接使用.
 * 而且第三种可以将前面两种综合起来，改成静态方法即可.
 * 
 * 3) 大多数情况下，第三种 静态工厂方法是首选
 *
 */

