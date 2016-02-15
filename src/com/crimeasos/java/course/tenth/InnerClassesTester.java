package com.crimeasos.java.course.tenth;

import java.util.List;
import java.util.Set;

/**
 * Created by Паша on 03.02.2016.
 */
public class InnerClassesTester {

    static  public void main(String[] args) {

        InnerClassHolder.InnerStaticClass innerStaticClass = new InnerClassHolder.InnerStaticClass();
        InnerClassHolder innerClassHolder = new InnerClassHolder();
        InnerClassHolder.InnerMemberClass innerMemberClass = innerClassHolder.new InnerMemberClass();

        //anonymous class


        I i = new I() {
            @Override
            public void method() {
                System.out.println("anonymous class");
            }
        };
        forI(i);

        new ClassInInterface.InnerClass().test();
    }

    static public void forI(I i) {
        i.method();
    }
}
interface I {
    void method();
}


class ForI implements I {

    @Override
    public void method() {
        System.out.println("anonymous class");
    }
}