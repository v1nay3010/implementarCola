/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementarcola;

import core.Cola;
import dato.Cliente;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author v1nay
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    Cola<Cliente> colac;
    private Label label;
    int max, min, range, maxT, minT, rangeT;
    Cajero obj1;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        colac.encolar(new Cliente((int) (Math.random() * range) + min, (int) (Math.random() * rangeT) + minT));
        colac.encolar(new Cliente((int) (Math.random() * range) + min, (int) (Math.random() * rangeT) + minT));
        colac.encolar(new Cliente((int) (Math.random() * range) + min, (int) (Math.random() * rangeT) + minT));
        colac.encolar(new Cliente((int) (Math.random() * range) + min, (int) (Math.random() * rangeT) + minT));
        colac.encolar(new Cliente((int) (Math.random() * range) + min, (int) (Math.random() * rangeT) + minT));
        System.out.println("contenido de la cola \n" + colac.toString());
    }

    @FXML
    private void mostrar(ActionEvent event) {
       Cliente c = colac.desencolar();
        obj1.TiempoTotal(c.getTiempoTransaccion());
        
        System.out.println("contenido de la cola \n" + colac.toString());
        System.out.println("Tiempo Cajero1 \n" + obj1.getTiempoTotal());
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        colac = new Cola<>();
        int max = 80;
        int min = 18;
        int range = max - min + 1;
        int maxT = 240;
        int minT = 1;
        int rangeT = maxT - minT;
        obj1 = new Cajero();

    }

}
