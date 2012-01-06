/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Action.AboutAction;
import Action.ClearLogAction;
import Action.ClearGalleryAction;
import Action.ConnectAction;
import Action.ExitAction;
import Action.LogFileAction;
import Action.SaveImageAction;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author avi
 */
public class MainView extends JFrame {
    
    public void MainView(){
        //Debuging
        //System.out.print("Creating Main Frame\n");
        buildMainFrame();
        
    }
    
    public void buildMenuBar(){
        JMenuBar menuBar = new JMenuBar();
         //Create menus
        JMenu startMenu = new JMenu("Start");
        //Need to check how to insert key listener
        //startMenu.setMnemonic(KeyEvent.VK_DOWN);
        menuBar.add(startMenu);
        
        JMenu ToolsMenu = new JMenu("Tools");
        menuBar.add(ToolsMenu);
        
        JMenu HelpMenu = new JMenu("Help");
        menuBar.add(HelpMenu);
     
        //Create Sub-menus
        startMenu.add(new JMenuItem(new ConnectAction("Connect")));
        startMenu.add(new JMenuItem(new ExitAction("Exit")));
        
        ToolsMenu.add(new JMenuItem(new SaveImageAction("Save Image")));
        ToolsMenu.add(new JMenuItem(new ClearGalleryAction("Clear Gallery Map")));
        ToolsMenu.add(new JMenuItem(new LogFileAction("View Log")));
        ToolsMenu.add(new JMenuItem(new ClearLogAction("Clear Log")));
                
        HelpMenu.add(new JMenuItem(new AboutAction("About")));
              
        this.setJMenuBar(menuBar);
    }
    

    public void buildPanles(){
        this.getContentPane().add(new KeyPadView());
        this.getContentPane().add(new KinectView());
        this.getContentPane().add(new GalleryView());
    }
    
    public JFrame buildMainFrame(){
        //JFrame.setDefaultLookAndFeelDecorated(true);
                
        //Set Window Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize((int) (screenSize.width * 0.9), (int) (screenSize.height * 0.9));
        
        //Set window position to center
        this.setLocationRelativeTo(null);
        
        //Handling the 'exit' button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Set title
        this.setTitle("Remote Car Control Project , Graphical User Interface !");
        
        //Add menubar
        this.buildMenuBar();
        
        //Creating and Adding Panels
        this.buildPanles();
        
        //Make main frame visible
        this.setVisible(true);
        
        return this;
    }

}
