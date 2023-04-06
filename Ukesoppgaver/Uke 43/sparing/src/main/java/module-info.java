module ukesoppgave.sparing {
    requires javafx.controls;
    requires javafx.fxml;


    opens ukesoppgave.sparing to javafx.fxml;
    exports ukesoppgave.sparing;
}