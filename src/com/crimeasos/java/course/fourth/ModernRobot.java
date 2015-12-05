package com.crimeasos.java.course.fourth;

/**
 * Created by Паша on 05.12.2015.
 */
public class ModernRobot extends Robot {

    private Speaking speakerModule = new EnglishSpeakerModule();

    public void setSpeakerModule(Speaking speakerModule) {
        this.speakerModule = speakerModule;
    }
    protected void speak(String text) {
        speakerModule.speak(text);
    }

    public void test() {
        simpleRobotName = "test";
    }
}
