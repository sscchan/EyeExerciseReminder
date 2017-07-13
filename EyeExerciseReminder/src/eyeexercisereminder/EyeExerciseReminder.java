/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyeexercisereminder;

import java.awt.PopupMenu;
import java.awt.TrayIcon;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author stephenchan
 */
public class EyeExerciseReminder {

    final private static String APPLICATION_TITLE = "Eye Exercise Reminder";
    final private static String SYSTEM_TRAY_ICON_FILEPATH = "./resources/ApplicationSystemTrayIcon.png";
    final private static long REMINDER_INTERVAL = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //setApplicationToRunInHeadlessMode();
        
        SystemTrayPopupMenu systemTrayPopupMenu = new SystemTrayPopupMenu();
        SystemTrayMechanism systemTrayMechanism = new SystemTrayMechanism(APPLICATION_TITLE, SYSTEM_TRAY_ICON_FILEPATH, systemTrayPopupMenu);
        
        Timer reminderTimer = new Timer();
        reminderTimer.schedule(new TimerTask() {
           public void run() {
              systemTrayMechanism.showNotification(APPLICATION_TITLE, "Exercise Your Eyes!");
           }
        }, REMINDER_INTERVAL * 60 * 1000, REMINDER_INTERVAL * 60 * 1000);

    }
    
    private static void setApplicationToRunInHeadlessMode() {
        // Remove Java "Icon" in OSX Dock      
        System.setProperty("apple.awt.UIElement", "true");
    }
    
}