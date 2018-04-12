/**
 * @filename package-info.java
 * @description  
 * @version 1.0
 * @author qye.zheng
 */
/**
 * @type package-info
 * @description  设计模式-结构型 ->享元模式
 * @author qye.zheng
 */
package com.hua.struct.flyweight;

/**
 * 享元模式
 * 1) 享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的
 * 时候可以减少内存的开销，通常和工厂模式一起使用. JDBC连接池即使用了
 * 这模式。
 *
 *2) 数据连接池
 *公共的属性，例如 url username password driverClassName 这些属性
 *对每个连接来说都是一样的，所以适合用享元模式来处理. 建立一个工厂类，
 *将上述属性做[内部数据]，其他的作为外部数据，在方法调用时，当作参数
 *传入，这样就减少了数据实例的数量.
 *
 *
 */

