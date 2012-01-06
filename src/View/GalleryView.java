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


public class GalleryView extends JPanel {
          
    public GalleryView(){
        super(new BorderLayout());
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.yellow);
        panel.setSize(30,30);
        //this.add(panel);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Code Placed here to draw graphics
    }
}
