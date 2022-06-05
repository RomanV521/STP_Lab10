module com.example.stp_lab10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stp_lab10 to javafx.fxml;
    exports com.example.stp_lab10;
}