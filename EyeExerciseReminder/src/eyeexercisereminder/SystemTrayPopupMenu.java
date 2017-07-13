/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyeexercisereminder;

import java.awt.PopupMenu;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;


/**
 *
 * @author stephenchan
 */
public class SystemTrayPopupMenu extends PopupMenu{
   public SystemTrayPopupMenu() {
      super();
      
      MenuItem exitMenuItem = new MenuItem("Exit");

      super.add(exitMenuItem);
      
      exitMenuItem.addActionListener((ActionEvent event) -> {
         System.exit(0);
      });
   }
}
