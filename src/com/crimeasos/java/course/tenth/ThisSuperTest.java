package com.crimeasos.java.course.tenth;

/**
 * Created by Паша on 03.02.2016.
 */
public class ThisSuperTest {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.test(3);
    }
}


class TestClass extends ParentTestClass {
    int i =10;

    public TestClass() {
        this(4);
    }

    TestClass(int i) {
        System.out.println("new TestClass");
    }


    public void test(int i) {
        this.i = i;
        System.out.println(i);
        super.test(i);
    }

}

class ParentTestClass {

    public ParentTestClass() {
        System.out.println("ParentTestClass construct");
    }

    public ParentTestClass(int i) {
        System.out.println("ParentTestClass other construct");
    }

    public void test(int i) {
        System.out.println("Parent test method");
    }
}
