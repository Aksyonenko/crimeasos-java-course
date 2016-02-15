package com.crimeasos.java.course.eleventh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Паша on 10.02.2016.
 */
public class ReaderTest {


    public static void main(String[] args) {
        final String filePath = "D:\\workspace\\crimeasos-java-course\\resources\\file2.txt";

        try (UpperCaseReader bf = new UpperCaseReader(new FileReader(filePath))) {
            String line = bf.readLine();
            while(line != null) {
                System.out.println(line);
                line = bf.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
