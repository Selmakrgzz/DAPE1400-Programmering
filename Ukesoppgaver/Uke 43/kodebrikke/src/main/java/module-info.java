module ukesoppgaver.kodebrikke {
    requires javafx.controls;
    requires javafx.fxml;


    opens ukesoppgaver.kodebrikke to javafx.fxml;
    exports ukesoppgaver.kodebrikke;
}