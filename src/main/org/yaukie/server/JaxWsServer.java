package org.yaukie.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.yaukie.impl.HelloServiceImpl;
import org.yaukie.inter.HelloService;

/**
 * ws服务发布方式一
 * 使用基于JAX-WS的方式来发布服务
 * @author yaukie
 *
 */
public class JaxWsServer {
public static void main(String[] args) {
	JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
	factory.setAddress("http://localhost:8088/ws/soap/hello");
	factory.setServiceClass(HelloService.class);
	factory.setServiceBean(new HelloServiceImpl());
	factory.create();
	System.out.println("soap ws is published ");
}
}
