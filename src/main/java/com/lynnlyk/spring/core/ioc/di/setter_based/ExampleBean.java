package com.lynnlyk.spring.core.ioc.di.setter_based;

/**
 * @description: DESCRIPTION
 * @author: lynnlyk
 * @create: 2018-06-08
 */
public class ExampleBean {

    private AnotherBean beanOne;

    private YetAnotherBean beanTwo;

    private int i;

    public void setBeanOne(AnotherBean beanOne) {
        this.beanOne = beanOne;
    }

    public void setBeanTwo(YetAnotherBean beanTwo) {
        this.beanTwo = beanTwo;
    }

    public void setIntegerProperty(int i) {
        this.i = i;
    }
}
