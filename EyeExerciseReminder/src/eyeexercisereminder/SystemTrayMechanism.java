/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyeexercisereminder;

import java.awt.AWTException;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.MenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author stephenchan
 */
public class SystemTrayMechanism {
    public SystemTrayMechanism(String applicationTitle, String iconFilePath, PopupMenu popupMenu) {
        if (SystemTray.isSupported()) {
            SystemTray systemTray = SystemTray.getSystemTray();
            
            try {
                Image trayIconImage = ImageIO.read(new File(iconFilePath));
                TrayIcon trayIcon = new TrayIcon(trayIconImage, applicationTitle, popupMenu);     
                systemTray.add(trayIcon);
                
            } catch (IOException | AWTException ex) {
                Logger.getLogger(SystemTrayMechanism.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("System Tray Not Supported");
        }
    }
}
