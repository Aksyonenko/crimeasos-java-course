package com.crimeasos.java.course.fifth;

/**
 * Created by Паша on 18.12.2015.
 * Клас демонструє правило що змінна завжди передається в метод по значенню
 */
class TestFieldByValue {


    public static void main(String[] args) {
        //Примітив приймає значення по замовчуванню
        Test test = new Test();
        //в методі println спрацьовує метод toString для змінної test типу Test
        System.out.println(test);
        //створюється та присвоюється новий об'єкт для test
        test = createCrazyTest();
        System.out.println(test);
        //Змінна staticI яка належить класу Test ініціалізується при першому зверненні і приймає значення по замовчанню
        System.out.println(Test.staticI);
        Test.staticI =150;
        System.out.println(Test.staticI);

        //Змінна передається в метод за значенням
        changeTestI(test, 110);
        System.out.println(test);
        //Змінна передається в метод за значенням
        changeTest(test);
        System.out.println(test);
        //Змінна передається в метод за значенням
        changeI(test.i);
        System.out.println(test);


    }

    /**
     * Метод створює нову ссилку яка вказує на туж саму змінну
     * тому вдається зміннить значення на i=100
     * але потім створенна ссилається на іншу змінну
     * @param test
     */
    static void changeTest(Test test) {
        test.i=100;
        test = new Test();
        test.i = 100000;
    }

    /**
     * Метод створює нову ссилку яка вказує на туж саму змінну
     * і в цієї змінної міняється значенн змінної на вказану test.i = i
     * @param test
     * @param i
     */
    static void changeTestI(Test test, int i) {
        test.i = i;
    }

    /**
     * створюэться нова ссилка і ссилка починає дивитись на нове значення , тому test не міняється
     * @param i
     */
    static void changeI(int i) {
        i = 5;
    }


    /**
     * Метод створює новий об'єкт Test і порертає його
     * @return
     */
    static Test createCrazyTest() {
        Test t = new Test();
        t.i = 10000000;
        t.b = true;
        return t;
    }
}


