package com.crimeasos.java.course.tenth;

import java.util.List;
import java.util.Set;

/**
 * Created by Паша on 03.02.2016.
 */
public class InnerClassesTester {

    static  public void main(String[] args) {
        InnerClassHolder innerClassHolder = new InnerClassHolder();
        new InnerClassHolder.InnerStaticClass();
        innerClassHolder.new InnerMemberClass();

        //anonymous class


        new I() {

            @Override
            public void method() {

            }
        };
    }
}
interface I {
    void method();
}