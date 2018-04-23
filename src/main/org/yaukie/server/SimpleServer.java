package org.yaukie.server;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.yaukie.impl.HelloServiceImpl;
import org.yaukie.inter.HelloService;

/**
 * ws服务的发布方式二
 * 基于SIMPLE方式发布
 * @author yaukie
 *
 */
public class SimpleServer {
		public static void main(String[] args) {
			ServerFactoryBean factory = new ServerFactoryBean();
			factory.setAddress("http://localhost:8088/ws/soap/hello");
			factory.setServiceClass(HelloService.class);
			factory.setServiceBean(new HelloServiceImpl());
			factory.create();
			System.out.println("soap ws is published !");
		}
}
