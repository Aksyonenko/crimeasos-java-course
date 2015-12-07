package com.crimeasos.java.course.fourth;

import com.crimeasos.java.course.fourth.cocktailmaker.RobotCocktailMaker;

/**
 * Created by Паша on 05.12.2015.
 * Головний клас, з нього починає роботу програма
 */
public class Main {

    public static void main(String[] args) {
        //Створюємо нового робота і задаємо йому ім'я в конструкторі
        Robot r2 = new Robot("R2");
        //Виводимо ім'я робота r2
        r2.printName();


        //Створюємо нового робота, ModernRobot наслідується від Robot, тому викликається
        //конструктор по замовчуванню класу Robot
        ModernRobot mr = new ModernRobot();
        //Виводимо ім'я робота mr
        mr.printName();


        //викликаємо метод speak в робота mr, по замовчуванню стоїть речовий модуль EnglishSpeakerModule
        mr.speak("hello");
        //встановлюємо новий речовий модуль SpainSpeakerModule
        mr.setSpeakerModule(new SpainSpeakerModule());
        //тепер робот mr говоритиме іспанською
        mr.speak("hello");

        //встановлюємо новий речовий модуль MuteSpeakingModule
        mr.setSpeakerModule(new MuteSpeakingModule());
        //тепер робот mr нічого не буде виводити
        mr.speak("hello");

        //створюємо робота mmr, в цього робота по замовчуванню стоїть речовий модуль MuteSpeakingModule
        ModernMuteRobot mmr = new ModernMuteRobot();
        //Виводимо ім'я робота mmr
        mmr.printName();
        //робот mmr нічого не буде виводити
        mmr.speak("hello");


        //практичне завдання
        RobotCocktailMaker rcm = new RobotCocktailMaker();
        rcm.printName();
        rcm.makeCoffeeCocktail();
        rcm.makeMilkCocktail();

    }
}
