/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author avi
 */
public class KeyPadView extends JPanel{
      
    public KeyPadView(){
        super(new BorderLayout());
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.red);
        panel.setSize(20,20);
        //this.add(panel);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Code Placed here to draw graphics
    }
}
