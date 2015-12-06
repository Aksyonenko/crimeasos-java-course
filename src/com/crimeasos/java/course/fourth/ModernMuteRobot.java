package com.crimeasos.java.course.fourth;

/**
 * Created by Паша on 05.12.2015.
 * Це тип роботів які не вміють говорити,
 * ModernMuteRobot наслідує ModernRobot,
 */
public class ModernMuteRobot extends ModernRobot {

    /**
     * При свторенны ModernMuteRobot по замовчуванню в робота стоїть модуль   MuteSpeakingModule
     * тобто робот не вміє говорити
     */
    public ModernMuteRobot() {
        setSpeakerModule(new MuteSpeakingModule());
    }
}
