/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

/**
 *
 * @author avi
 */

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;


public class LogFileAction extends AbstractAction {
        
    public LogFileAction(String title){
        super(title);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("LogFileAction Pressed\n");
    }
}
