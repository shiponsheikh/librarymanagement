/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagerFinal;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Shah Ali
 */
public class HelpController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextArea a;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        a.disableProperty();
        a.setEditable(false);
    }    
    
}
