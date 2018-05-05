/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.gui;

import java.awt.Color;

/**
 *
 * @author Maraxys
 */
public class SplashCaller {
    public static void main(String []args){
        SplashScreenExp sp=new SplashScreenExp();
        sp.setVisible(true);
        
        try{
            for(int i=0;i<=100;i++){
            Thread.sleep(35);
            sp.progressBar.setValue(i);
            sp.progressBar.setBackground(Color.white);
            }
            UserLoginFrame loginFrame = new UserLoginFrame();
            loginFrame.setVisible(true);
            sp.dispose();
            
        }
        catch(Exception e){
            
        }
    }
    
}
