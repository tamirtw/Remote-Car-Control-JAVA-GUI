/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author avi
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class KinectView extends JPanel {
    
    public KinectView(){
        super(new BorderLayout());
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.yellow);
        panel.setSize(10,10);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Code Placed here to draw graphics
    }
}
