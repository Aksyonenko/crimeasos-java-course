package com.crimeasos.java.course.fourth;

/**
 * Created by Паша on 05.12.2015.
 * ModernRobot - наслідується від Robot,
 * тобто він має доступ до всім полів і методів Robot
 * які 1. public, protected або без модифікатора і в тому самому пакеті
 */
public class ModernRobot extends Robot {

    /**
     *  Речовий модуль модернового робота,
     *  який відповідає за вміння говорити - по замовчування стоїть EnglishSpeakerModule модуль
     *  змінна speakerModule має тип Speaking для того щоб ми могли могли цій змінній
     *  підставляти будь які значення
     *  наприклад EnglishSpeakerModule, SpainSpeakerModule, MuteSpeakerModule...
     *  якби ми написали  protected EnglishSpeakerModule speakerModule = new EnglishSpeakerModule();
     *  то ми не могли б потім поміняти значення  speakerModule на відмінний від EnglishSpeakerModule тип.
     */
    protected Speaking speakerModule = new EnglishSpeakerModule();

    /**
     * Метод змінює речовий модуль
     * @param speakerModule - параметр новий речовий модуль робота
     */
    public void setSpeakerModule(Speaking speakerModule) {
        this.speakerModule = speakerModule;
    }

    /**
     * метод спонукає робота говорити,
     * береться модуль який встановлений і в цьому модуля виклкається метод speak
     * @param text - текст який вимагається шоб робота сказав
     */
    protected void speak(String text) {
        speakerModule.speak(text);
    }

}
