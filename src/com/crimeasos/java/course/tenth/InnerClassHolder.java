package com.crimeasos.java.course.tenth;

/**
 * Created by Паша on 03.02.2016.
 */
public class InnerClassHolder {

    static int i;
    int j;
    static void staticMethod() {}
    void memeberMethod() {}
    void method() {}

    {
        class LocalClass {
            int c;
            void method1() {


            }
        }
    }

    void localClassMothod(final int z) {
        final int g =2;
        class LocalClass {
            int c;
            void method1() {
                int y = g +  23;
                i = z;
            }
        }
    }

    public static class InnerStaticClass {
        void method() {

        }
    }

    public class InnerMemberClass {
        void method() {
            j = 2;
            i = 3;
            staticMethod();
            memeberMethod();
            InnerClassHolder.this.method();
        }
    }
}
