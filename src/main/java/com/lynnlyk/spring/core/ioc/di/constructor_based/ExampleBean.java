package com.lynnlyk.spring.core.ioc.di.constructor_based;

/**
 * @description: DESCRIPTION
 * @author: lynnlyk
 * @create: 2018-06-08
 */
public class ExampleBean {

    // Number of years to calculate the Ultimate Answer
    private int years;

    // The Answer to Life, the Universe, and Everything
    private String ultimateAnswer;

    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }
}
