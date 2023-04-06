package testgruppe.test1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TestController {

    @FXML
    private Button btnSkrivUt;

    @FXML
    private Label lblskrivUt;


    @FXML
    private Label lblskrivbox;

    @FXML
    private Label txtoverskrift;
    @FXML
    private TextField txtskriv;

    @FXML
    void ut(ActionEvent event) {
        String skriv = txtskriv.getText();
        lblskrivUt.setText(skriv);
    }

}
