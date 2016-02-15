package com.crimeasos.java.course.eleventh;

import java.io.*;

/**
 * Created by Паша on 10.02.2016.
 */
public class StreamTest {

    public static void main(String[] atgs)  {

        final String filePath = "D:\\workspace\\crimeasos-java-course\\resources\\file.txt";
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream(filePath))) {
            User user = new User("Andrey", 35);
            System.out.println(user);
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream oos =
                     new ObjectInputStream(
                             new FileInputStream(filePath))) {
            User user  = (User) oos.readObject();
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
