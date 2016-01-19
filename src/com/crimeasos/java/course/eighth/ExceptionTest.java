package com.crimeasos.java.course.eighth;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/**
 * Created by Паша on 19.01.2016.
 */
public class ExceptionTest {

    public static void main(String[] args) {

        //Відловлюємо помилку
        try {
            doSomething1();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex + " ArrayIndexOutOfBoundsException");
        } catch (RuntimeException ex) {
            System.out.println(ex + " RuntimeException");
        } catch (MyException ex) {
            System.out.println(ex + " MyException");
        } finally {
            System.out.println("By default");
        }
        System.out.println("Finish");

    }
    /**
     * @throws MyException - можливе виненкнення MyException
     */
    private static void doSomething1() throws MyException {
        doSomething2();
    }

    /**
     * @throws MyException - можливе виненкнення MyException
     */
    private static void doSomething2() throws MyException {
        // Активуємо нову помилку типу MyException
        throw  new MyException("My exception");
    }

}

class BaseClass {
    public void test() throws IOException {

    }
}

class ChildClass extends  BaseClass {
    @Override
    public void test() throws IOException {

    }
}
