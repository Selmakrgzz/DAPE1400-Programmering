module testgruppe.test1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens testgruppe.test1 to javafx.fxml;
    exports testgruppe.test1;
}