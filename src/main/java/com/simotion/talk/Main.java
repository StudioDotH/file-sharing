package com.simotion.talk;

import com.simotion.talk.UI.*;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.UUID;
import java.util.prefs.Preferences;


public class Main extends Application {
    public static final String FIRST_START_TITLE = "FIRST_START";
    public static final String PROFILE_NAME      = "PROFILE_NAME";
    public static final String PROFILE_EMAIL     = "PROFILE_EMAIL";
    public static final String APP_NAME          = "File Transfer";
    public static final String UUID_KEY          = "MachineUUID";

    @Override
    public void start(Stage primaryStage) throws Exception {
        // https://stackoverflow.com/questions/4017137/how-do-i-save-preference-user-settings-in-java
        Preferences prefs = Preferences.userNodeForPackage(com.simotion.talk.Main.class);

        // Set a machine UUID.
        if(prefs.get(UUID_KEY, "-1").equals("-1")) {
            UUID idOne = UUID.randomUUID();
            prefs.put(UUID_KEY, idOne.toString());
        }

        // DEBUG
        // prefs.put(Main.FIRST_START_TITLE, "0");

        System.out.println(prefs.get(PROFILE_NAME, "0"));

        if(prefs.get(FIRST_START_TITLE, "0").equals("0")) {
            new FirstStart().CreateWindow();
        } else {
            new MainWindow().start();
        }
        System.out.println("Hi");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
