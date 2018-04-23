package org.yaukie.impl;

import javax.jws.WebService;

import org.yaukie.inter.HelloService;
/**
 * 定义soap服务的实现类
 * @author yaukie
 *
 */
@WebService
public class HelloServiceImpl  implements HelloService
{

	public void doSth(String name) {
		System.out.println(name+"正在吃蛋糕!");
	}
 

}
