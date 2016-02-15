package com.crimeasos.java.course.eleventh;

import java.io.File;

/**
 * Created by Паша on 10.02.2016.
 */
public class FileTest {

    public static void main(String[] args) {
        File file = new File("D:\\workspace\\crimeasos-java-course\\resources\\");
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.getPath());
        System.out.println(file.lastModified());

        String[] files = file.list();
        for (String fileName : files) {
            System.out.println(fileName);
        }

    }
}
