package com.lynnlyk.spring.core.ioc_container.service;

import com.lynnlyk.spring.core.ioc.beans_instantiation.instance_factory_method.AccountService;
import com.lynnlyk.spring.core.ioc.beans_instantiation.instance_factory_method.impl.AccountServiceImpl;
import com.lynnlyk.spring.core.ioc.beans_instantiation.static_factory_method.ClientService;
import com.lynnlyk.spring.core.ioc.container_instantiating.service.PetStoreService;
import com.lynnlyk.spring.core.ioc.container_instantiating.service.impl.PetStoreServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class PetStoreServiceTest {

    @Test
    public void petStoreServiceTest() {
        /*
        *  最简依赖：core, context, beans, aop, expression, jcl
        *  注意路径写法
        * */
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ioc/services.xml", "ioc/daos.xml");
        PetStoreService petStoreServiceImpl = context.getBean("petStore", PetStoreServiceImpl.class);
        System.out.println(petStoreServiceImpl);

    }

    @Test
    public void petStoreServiceTestByGenericApplicationContext() {
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("/ioc/services.xml", "classpath:/ioc/daos.xml");
        //  注意调用 context.refresh()，否则会报如下错误：
        // java.lang.IllegalStateException: org.springframework.context.support.GenericApplicationContext@5d3411d has not been refreshed yet
        context.refresh();
        PetStoreService petStoreServiceImpl = context.getBean("petStore", PetStoreServiceImpl.class);
        System.out.println(petStoreServiceImpl);
    }

    @Test
    public void beansInstantiatingByStaticMethod() {

        ApplicationContext context = new ClassPathXmlApplicationContext("ioc/beans.xml");
        ClientService clientService = context.getBean("client", ClientService.class);
        AccountService accountService = context.getBean("accountService", AccountServiceImpl.class);
        System.out.println(clientService);
        System.out.println(accountService);
    }


}
