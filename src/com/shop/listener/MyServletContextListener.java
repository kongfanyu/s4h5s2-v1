package com.shop.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyServletContextListener implements ServletContextListener {

	 public void contextInitialized(ServletContextEvent sce){
		 //0.通过初始化参数读取spring配置文件名
		 String configLocation = sce.getServletContext().getInitParameter("configLocation");
		 System.out.println("spring配置文件:"+ configLocation);
		 //1.读取spring配置文件
		 ApplicationContext ctx  =new ClassPathXmlApplicationContext("applicationContext.xml");
		 //2.放在application作用域
		 System.out.println("容器:"+ctx);
		 ServletContext application  = sce.getServletContext();
		 application.setAttribute("ctx", ctx);
	 }
}
