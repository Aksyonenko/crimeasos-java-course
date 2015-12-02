//цей рядок означає пакет в якому знаходяться класи
package com.crimeasos.java.course.third;

/**
 * Created by Паша on 28.11.2015.
 */
public class Dog {

    /* По замовчуванню в кожного нового створеного об'єкта типу Dog
         name = "John", color = "red"
    */
    public String name = "John";
    // color - приватне поле, тому до нього є доступ лише
    private String color = "red";

    /**
     * Публічний метод bark можна викликати з будь-якому місця програми
     */
    public void bark() {
        System.out.println("Lay-lay-lay");
        //викликаємо публічний метод
        bite();
    }

    /**
     * Публічний метод getColor можна викликати з будь-якому місця програми
     */
    public String getColor() {
        return color;
    }


    /**
     * Приватний метод bite можна викликати лице в цьому класі
     */
    private void bite() {
        System.out.println("RRRR!!! Bite!");
    }


}
