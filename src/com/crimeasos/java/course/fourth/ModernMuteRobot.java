package com.crimeasos.java.course.fourth;

/**
 * Created by ���� on 05.12.2015.
 */
public class ModernMuteRobot extends ModernRobot {
    public ModernMuteRobot() {
        setSpeakerModule(new MuteSpeakingModule());
    }
}
