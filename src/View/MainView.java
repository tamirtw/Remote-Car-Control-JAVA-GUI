/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Action.AboutAction;
import Action.ClearLogAction;
import Action.ClearMapAction;
import Action.ConnectAction;
import Action.ExitAction;
import Action.SaveImageAction;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
/**
 *
 * @author avi
 */
public class MainView extends JFrame {
    public void MainView(){
        //Debuging
        System.out.print("Creating Main Frame\n");
        buildMainFrame();
        
    }
    
    public JMenuBar buildMenuBar(){
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
        ToolsMenu.add(new JMenuItem(new ClearMapAction("Clear Map")));
        ToolsMenu.add(new JMenuItem(new ClearLogAction("Clear Log")));
        
        HelpMenu.add(new JMenuItem(new AboutAction("About")));
              
        return menuBar;
    }

    public JFrame buildMainFrame(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame _mainFrame = new JFrame();
        
        //Set Window Size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        _mainFrame.setSize((int) (screenSize.width * 0.9), (int) (screenSize.height * 0.9));
        
        //Set window position to center
        _mainFrame.setLocationRelativeTo(null);
        
        //Handling the 'exit' button
        _mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Set title
        _mainFrame.setTitle("Remote Car Control Project , Graphical User Interface !");
        
        //Add Panel , Components and more
        _mainFrame.setJMenuBar(buildMenuBar());
        
        _mainFrame.setVisible(true);
        
        return _mainFrame;
    }

}
