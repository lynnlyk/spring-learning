package com.lynnlyk.spring.core.ioc.di;

import com.lynnlyk.spring.core.ioc.di.setter_based.ExampleBean;
import com.lynnlyk.spring.core.ioc.di.setter_based.SimpleMovieLister;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

/**
 * @description: DESCRIPTION
 * @author: lynnlyk
 * @create: 2018-06-08
 */
public class DiSetterBasedTest {

    private ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("classpath:ioc/di/setter_based_di.xml");
    }

    @Test
    public void simpleMovieListerTest() {

        SimpleMovieLister movieLister = context.getBean("simpleMovieLister", SimpleMovieLister.class);
        assertNotNull(movieLister.getMovieFinder());
        assertNotNull(movieLister);
    }

    @Test
    public void exampleBeanTest() {
        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        assertNotNull(exampleBean);
    }


}
