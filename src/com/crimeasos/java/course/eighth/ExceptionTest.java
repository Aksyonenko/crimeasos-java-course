package com.crimeasos.java.course.eighth;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

/**
 * Created by Паша on 19.01.2016.
 */
public class ExceptionTest {

    public static void main(String[] args) {

    }

}

class BaseClass {
    public void test() throws IOException {

    }
}

class ChildClass extends  BaseClass{
    @Override
    public void test() throws NoSuchFileException {

    }
}
