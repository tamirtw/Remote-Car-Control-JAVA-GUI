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

public class ExitAction extends AbstractAction{

    public ExitAction(String string) {
        super(string);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //TODO close socket
        System.exit(0);
    }
    
}
