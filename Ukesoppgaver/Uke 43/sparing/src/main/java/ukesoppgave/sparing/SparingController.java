package ukesoppgave.sparing;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.lang.Math;

public class SparingController {

    @FXML
    private Button chxberegn;


    @FXML
    private Label lbltittel;
    @FXML
    private Label lblResultat;

    @FXML
    private TextField txtAntallÅr;

    @FXML
    private TextField txtBeløp;

    @FXML
    private TextField txtRente;

    @FXML
    void beregn(ActionEvent event) {

           int belop = Integer.parseInt(txtBeløp.getText());
           double rente = Double.parseDouble(txtRente.getText());
           int antallAAr = Integer.parseInt(txtAntallÅr.getText());
           int resultat = (int) Math.pow(belop*(1+(rente/100)), antallAAr);
           lblResultat.setText(String.valueOf(resultat));

    }

}
