module com.example.kodebrikke {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kodebrikke to javafx.fxml;
    exports com.example.kodebrikke;
}