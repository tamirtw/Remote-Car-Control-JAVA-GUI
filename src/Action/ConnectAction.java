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

public class ConnectAction extends AbstractAction {
    
    public ConnectAction(String title){
        super(title);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("ConnectAction Pressed\n");
    }
}
