package com.crimeasos.java.course.fifth;

/**
 * Created by Паша on 20.12.2015.
 */
class Test {
    //Примітивна змінна класу приймає значення по замовчуванню
    int i;
    boolean b;
    //Статична примітивна змінна класу приймає значення по замовчуванню
    static  int staticI;

    /**
     * Перевизначаємо (оверрайдемо) метод finalize() класу Object
     * Цей метод викликається при видаленні об'єкта з пам'яті
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Test is deleted");
        super.finalize();
    }

    /**
     * Перевизначаємо (оверрайдемо) метод класу toString() Object
     * Цей метод відображає текстове представлення екземпляру класу Test
     * @return - текстове представлення екземпляру класу Test
     */
    @Override
    public String toString() {
        return "Test{" +
                "i=" + i +
                ", b=" + b +
                '}';
    }
}
