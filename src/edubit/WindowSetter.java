/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edubit;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

/**
 *
 * @author ThinkPad
 */
public class WindowSetter {
    public static void sizeWindow(Window win){
       Dimension geek = Toolkit.getDefaultToolkit().getScreenSize();
       int w = win.getWidth();
       int h = win.getHeight();
       int x = (geek.width - w)/2;
       int y = (geek.height - h)/2;
       win.setLocation(x, y);
       
    }
    
}
