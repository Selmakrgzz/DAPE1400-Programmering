module com.example.sparing {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sparing to javafx.fxml;
    exports com.example.sparing;
}