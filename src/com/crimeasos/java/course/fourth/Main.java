package com.crimeasos.java.course.fourth;

/**
 * Created by Паша on 05.12.2015.
 */
public class Main {

    public static void main(String[] args) {
//        Robot r2 = new Robot("R2");
//        r2.printName();


//        ModernRobot mr = new ModernRobot();
//        mr.printName();
//
//        mr.speak("hello");
//        mr.setSpeakerModule(new SpainSpeakerModule());
//        mr.speak("hello");
//
//        mr.setSpeakerModule(new MuteSpeakingModule());
//        mr.speak("hello");

        ModernMuteRobot mmr = new ModernMuteRobot();
        mmr.simpleRobotName = "test";
        System.out.println(mmr.simpleRobotName);

    }
}
