package ru.javabegin.training.springlibrary.beans;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean {

    @Autowired
    private SessionFactory sessionFactory;

    public void test(){
        System.out.println("sessionFactory = " + sessionFactory);
    }

}