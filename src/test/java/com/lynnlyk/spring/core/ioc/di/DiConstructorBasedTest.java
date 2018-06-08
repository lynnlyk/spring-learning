package com.lynnlyk.spring.core.ioc.di;

import com.lynnlyk.spring.core.ioc.di.constructor_based.ExampleBean;
import com.lynnlyk.spring.core.ioc.di.constructor_based.Foo;
import com.lynnlyk.spring.core.ioc.di.constructor_based.SimpleMovieLister;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

/**
 * @description: DESCRIPTION
 * @author: lynnlyk
 * @create: 2018-06-08
 */
public class DiConstructorBasedTest {

    private ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("classpath:ioc/di/constructor_based_di.xml");
    }

    @Test
    public void simpleMovieListerTest() {

        SimpleMovieLister movieLister = context.getBean("simpleMovieLister", SimpleMovieLister.class);
        assertNotNull(movieLister.getMovieFinder());
        assertNotNull(movieLister);
    }

    @Test
    public void fooTest() {
        Foo foo = context.getBean("foo", Foo.class);
        assertNotNull(foo);
    }

    @Test
    public void exampleTest() {
        ExampleBean exampleBean1 = context.getBean("exampleBean1", ExampleBean.class);
        ExampleBean exampleBean2 = context.getBean("exampleBean2", ExampleBean.class);
        ExampleBean exampleBean3 = context.getBean("exampleBean3", ExampleBean.class);
        assertNotNull(exampleBean1);
        assertNotNull(exampleBean2);
        assertNotNull(exampleBean3);
    }

}
