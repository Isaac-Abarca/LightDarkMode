/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author abarc
 */
public class PrincipalController implements Initializable {

    @FXML
    private BorderPane parent;
    @FXML
    private Label labaelMode;
    @FXML
    private Button btnMode;
    @FXML
    private ImageView imgMode;

    private boolean isLightMode = true;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cambiarMdod(MouseEvent event) {
        isLightMode = !isLightMode;
        if (isLightMode) {
            setLightMode();
        }else{
            setDarkMode();
        }
    
    }

    private void setLightMode() {
        parent.getStylesheets().remove("estilos/DarkMode.css");
        parent.getStylesheets().add("estilos/LightMode.css");
        Image image = new Image("/img/darkMode.png");
        imgMode.setImage(image);
        labaelMode.setText("Light Mode");
        labaelMode.setTextFill(new Color(0,0,0,1));
    }

    private void setDarkMode() {
        parent.getStylesheets().remove("estilos/LightMode.css");
        parent.getStylesheets().add("estilos/DarkMode.css");
        Image image = new Image("/img/sun.png");
        imgMode.setImage(image);
        labaelMode.setText("Dark Mode");
        labaelMode.setTextFill(new Color(1,1,1,1));
    }
    
}
