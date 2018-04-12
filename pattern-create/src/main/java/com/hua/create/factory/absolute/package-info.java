/**
 * @filename package-info.java
 * @description  
 * @version 1.0
 * @author qye.zheng
 */
/**
 * @type package-info
 * @description  设计模式-创建型->抽象工厂模式
 * @author qye.zheng
 */
package com.hua.create.factory.absolute;

/**
 * 抽象工厂
 * 1) 工厂模式-存在问题: 
 * 若需要扩展程序，则需要修改工厂类，这就违背了闭包原则.
 * 从设计的角度，为了解决扩展问题，需要使用抽象工厂模式，创建
 * 多个工厂类，这样，一旦需要增加新的功能，直接增加新的工厂类即可，
 * 而无需修改之前的代码.
 * 
 * 2) Provider 接口
 * 抽象工厂的业务
 * 需要哪些生产哪些类型的对象，实现该接口即可.
 * 
 * 3) 扩展
 * 若需要新增功能，则创建一个实现相应的业务接口(实例中指的是Sender接口)的类，
 * 再创建一个实现Provider接口的类即可.
 *
 *
 *
 */

