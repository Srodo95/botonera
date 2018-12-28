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
import javafx.scene.control.Label;

/**
 *
 * @author Rodolfo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    private Button botonAzul;
    private Button botonRojo;
    private Button botonVerde;
    
    @FXML
    private void salir(ActionEvent event) {
        Platform.exit();
    }
    
    @FXML
    private void cambiarColor(ActionEvent event){
        
    }
    
    @FXML
    public void salir(){
       // botonSalir.exit();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
