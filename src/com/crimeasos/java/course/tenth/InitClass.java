package com.crimeasos.java.course.tenth;

/**
 * Created by Паша on 03.02.2016.
 */
public class InitClass extends InitClassParent {

    static {
        System.out.println("First InitClass static block");
    }

    {
        System.out.println("First InitClass member block");
    }

    String memberVar =  getAndPrintVar("First InitClass member var");

    static String staticVar =  getAndPrintVar("First InitClass staticVar var");

    int i = 5;
    InitClass() {
        System.out.println("InitClass constructor");
        System.out.println(i);
    }
}

class InitClassParent  {
    String memberVar =  getAndPrintVar("First InitClassParent member var");

    static String staticVar =  getAndPrintVar("First InitClassParent staticVar var");

    static {
        System.out.println("First InitClassParent static block");
    }

    {
        System.out.println("First InitClassParent member block");
    }


    static String getAndPrintVar(String var) {
        System.out.println(var);
        return var;
    }

    InitClassParent() {
        System.out.println("InitClassParent constructor");
    }
}


