//цей рядок означає пакет в якому знаходяться класи
package com.crimeasos.java.course.third;


public class Main {

    /**
     * Головний метод, з цього місця починає роботу програма
     * @param args - аргументи які передаються в командному рядку
     */
    public static void main(String[] args) {
        /*
         * Багаторядковий коментар
         */

        //однорядковий коментар

        /*
         * Створєюмо новий об'єкт типу Dog та присвоюваємо йому
         значення нового екземляра типу Dog
         */
        Dog myDog = new Dog();

        //викликаємо в змінної myDog метод bark
        myDog.bark();
        //виводимо ім'я в змінної myDog
        System.out.println(myDog.name);
        //встановлюємо змінні myDog значення name = "Bill"
        myDog.name = "Bill";
        //виводимо ім'я  в змінної myDog
        System.out.println(myDog.name);
        //виводимо колір  в змінної myDog
        System.out.println(myDog.getColor());


        //практичне завдання
        //стоврюєть новий екземляр типу Cat simon, в нього по замовчуванню name = "Simon", age = 7
        Cat simon = new Cat();
        //виводимо name екземляру simon
        System.out.println(simon.getName());
        //виводимо age екземляру simon
        System.out.println(simon.getAge());
        //
        simon.sleep();
    }


}
