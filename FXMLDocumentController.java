/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botonera;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;

/**
 *
 * @author Rodolfo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lb_text;
    
    
    @FXML
    private void salir(ActionEvent event) {
        Platform.exit();
    }
    
    @FXML
    private void botonAzul(ActionEvent event){
        lb_text.setTextFill(Color.web("0000ff"));
    }
    @FXML
    private void botonRojo(ActionEvent event){
        lb_text.setTextFill(Color.web("ff0000"));
    }
    @FXML
    private void botonVerde(ActionEvent event){
        lb_text.setTextFill(Color.web("00ff00"));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
