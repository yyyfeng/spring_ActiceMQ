package com.example.spring_activemq.testClass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Author     ：scw
 * @ Date       ：Created in 下午 3:13 2018/7/15 0015
 * @ Description：消费者的测试
 * @ Modified By：
 * @Version: $version$
 */
public class ConsumerTest {
    public static void main(String[] args){
        //启动消费者
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("consumer.xml");
    }
}
